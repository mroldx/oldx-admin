package com.oldx.mbg.mapper;

import com.oldx.mbg.test_domain.Canping;
import com.oldx.mbg.test_domain.CanpingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CanpingMapper {
    long countByExample(CanpingExample example);

    int deleteByExample(CanpingExample example);

    int insert(Canping record);

    int insertSelective(Canping record);

    List<Canping> selectByExample(CanpingExample example);

    int updateByExampleSelective(@Param("record") Canping record, @Param("example") CanpingExample example);

    int updateByExample(@Param("record") Canping record, @Param("example") CanpingExample example);
}