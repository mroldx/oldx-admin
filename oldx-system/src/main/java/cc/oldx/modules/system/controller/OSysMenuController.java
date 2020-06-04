package cc.oldx.modules.system.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cc.oldx.mbg.domain.OSysMenuEntity;
import cc.oldx.modules.system.service.OSysMenuService;
import cc.oldx.common.utils.PageUtils;
import cc.oldx.common.utils.CommonResult;



/**
 * 
 *
 * @author MrOldx
 * @email 974751082@qq.com
 * @date 2020-06-04 14:11:58
 */
@RestController
@RequestMapping("system/osysmenu")
public class OSysMenuController {
    @Autowired
    private OSysMenuService oSysMenuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("system:osysmenu:list")
    public CommonResult list(@RequestParam Map<String, Object> params){
        PageUtils page = oSysMenuService.queryPage(params);

        return CommonResult.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{menuId}")
    //@RequiresPermissions("system:osysmenu:info")
    public CommonResult info(@PathVariable("menuId") Long menuId){
		OSysMenuEntity oSysMenu = oSysMenuService.getById(menuId);

        return CommonResult.ok().put("oSysMenu", oSysMenu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("system:osysmenu:save")
    public CommonResult save(@RequestBody OSysMenuEntity oSysMenu){
		oSysMenuService.save(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("system:osysmenu:update")
    public CommonResult update(@RequestBody OSysMenuEntity oSysMenu){
		oSysMenuService.updateById(oSysMenu);

        return CommonResult.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("system:osysmenu:delete")
    public CommonResult delete(@RequestBody Long[] menuIds){
		oSysMenuService.removeByIds(Arrays.asList(menuIds));

        return CommonResult.ok();
    }

}
