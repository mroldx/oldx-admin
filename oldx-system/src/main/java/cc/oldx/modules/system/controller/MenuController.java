package cc.oldx.modules.system.controller;

import cc.oldx.common.api.CommonResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/18 4:48
 */
@RestController
public class MenuController {
    @RequestMapping("/menu/listAll")
    @PreAuthorize("hasAuthority('menu:list')")
    public CommonResult getMenuList(){
        return CommonResult.success("这是menu list的测试");
    }

}
