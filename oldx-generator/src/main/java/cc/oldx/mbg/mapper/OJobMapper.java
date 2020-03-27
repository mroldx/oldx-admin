package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OJob;
import cc.oldx.mbg.domain.OJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OJobMapper {
    long countByExample(OJobExample example);

    int deleteByExample(OJobExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OJob record);

    int insertSelective(OJob record);

    List<OJob> selectByExample(OJobExample example);

    OJob selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OJob record, @Param("example") OJobExample example);

    int updateByExample(@Param("record") OJob record, @Param("example") OJobExample example);

    int updateByPrimaryKeySelective(OJob record);

    int updateByPrimaryKey(OJob record);
}