package cc.oldx;

import cc.oldx.common.utils.MD5Util;
import cc.oldx.common.utils.RedisUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/7/7 22:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Mroldx_test {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private Jedis jedis;
    @Test
    public void testRedis(){
        String code = RandomUtil.randomString("fdsafsd6464716f7dafds7fs4af6",4);
        String key = MD5Util.MD5Encode(code+System.currentTimeMillis(), "utf-8");
        redisUtil.set(key, code, 60);

        System.out.println(1);

        Object o = redisUtil.get(key);
        System.out.println(o);
    }

    @Test
    public void testHutool(){
        boolean b = StrUtil.hasBlank("", "");
        System.out.println(b);
    }
}
