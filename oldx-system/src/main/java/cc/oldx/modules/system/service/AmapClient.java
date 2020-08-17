package cc.oldx.modules.system.service;

import com.dtflys.forest.annotation.Request;

import java.util.Map;

/**
 * @Author: MrOldx <br/>
 * @Descrption:
 * @Date:Created in 16:29 2020/8/17  <br/>
 */
public interface AmapClient {
    @Request(
            url = "http://ditu.amap.com/service/regeo?longitude=${0}&latitude=${1}",
            dataType = "json"
    )
    Map getLocation(String longitude, String latitude);
}
