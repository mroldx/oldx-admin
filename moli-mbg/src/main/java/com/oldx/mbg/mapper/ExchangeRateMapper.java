package com.oldx.mbg.mapper;

import com.oldx.mbg.test_domain.ExchangeRate;
import com.oldx.mbg.test_domain.ExchangeRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExchangeRateMapper {
    long countByExample(ExchangeRateExample example);

    int deleteByExample(ExchangeRateExample example);

    int insert(ExchangeRate record);

    int insertSelective(ExchangeRate record);

    List<ExchangeRate> selectByExample(ExchangeRateExample example);

    int updateByExampleSelective(@Param("record") ExchangeRate record, @Param("example") ExchangeRateExample example);

    int updateByExample(@Param("record") ExchangeRate record, @Param("example") ExchangeRateExample example);
}