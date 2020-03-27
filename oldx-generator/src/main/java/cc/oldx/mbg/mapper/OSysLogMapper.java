package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysLog;
import cc.oldx.mbg.domain.OSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSysLogMapper {
    long countByExample(OSysLogExample example);

    int deleteByExample(OSysLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OSysLog record);

    int insertSelective(OSysLog record);

    List<OSysLog> selectByExampleWithBLOBs(OSysLogExample example);

    List<OSysLog> selectByExample(OSysLogExample example);

    OSysLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OSysLog record, @Param("example") OSysLogExample example);

    int updateByExampleWithBLOBs(@Param("record") OSysLog record, @Param("example") OSysLogExample example);

    int updateByExample(@Param("record") OSysLog record, @Param("example") OSysLogExample example);

    int updateByPrimaryKeySelective(OSysLog record);

    int updateByPrimaryKeyWithBLOBs(OSysLog record);

    int updateByPrimaryKey(OSysLog record);
}