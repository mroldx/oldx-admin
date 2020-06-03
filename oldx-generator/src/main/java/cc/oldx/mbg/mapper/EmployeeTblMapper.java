package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.EmployeeTbl;

public interface EmployeeTblMapper {
    int insert(EmployeeTbl record);

    int insertSelective(EmployeeTbl record);

}