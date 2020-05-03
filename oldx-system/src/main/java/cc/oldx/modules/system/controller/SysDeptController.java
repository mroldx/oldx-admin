package cc.oldx.modules.system.controller;

import cc.oldx.common.api.CommonResult;
import cc.oldx.mbg.domain.ODept;
import cc.oldx.modules.system.service.SysDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/17 4:35
 */
@RestController
@RequestMapping("/sys/dept")
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;

    // 测试普通权限
    @PreAuthorize("hasAuthority('user:add')")
    @RequestMapping(value = "/normal/test", method = RequestMethod.GET)
    public String test1() {
        return "ROLE_NORMAL /normal/test接口调用成功！修改的内容哦1111111111111111";
    }

    // 测试管理员权限
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/admin/test", method = RequestMethod.GET)
    public String test2() {
        return "ROLE_ADMIN /admin/test接口调用成功！修改了内容哦111111111111111111111111111111";
    }

    // 测试权限
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test23() {
        return "111111111111111111111111111111";
    }
    // 测试权限

    @RequestMapping("/getDeptList")
    @PreAuthorize("hasAuthority('dept:list')")
    public CommonResult getDeptList(ODept dept) {
        List<ODept> deptList = this.sysDeptService.selectDeptList(dept);
        return CommonResult.success(deptList, "获取部门列表成功");

    }

}
