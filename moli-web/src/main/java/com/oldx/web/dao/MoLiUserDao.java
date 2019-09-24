package com.oldx.web.dao;

import com.oldx.mbg.domain.MoliUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface MoLiUserDao {
    /**
     * 查询员工列表
     * @param user
     * @return list
     */
    @Select(" select m.user_id,\n" +
            "        m.username,\n" +
            "        m.dept_id,\n" +
            "        m.email,\n" +
            "        m.mobile,\n" +
            "        m.`status`,\n" +
            "        m.create_time,\n" +
            "        m.modify_time,\n" +
            "        m.sex,\n" +
            "        m.icon,\n" +
            "        m.desciption,\n" +
            "        md.dept_name\n" +
            "        from moli_user m\n" +
            "        left join m_dept md\n" +
            "        on(m.dept_id=md.dept_id)\n" +
            "        where 1=1\n" +
            "        order by m.user_id")
    List<MoliUser> findUserWithDept(@Param("user") MoliUser user);
}
