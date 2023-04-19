package com.macro.mall.mapper;

import com.macro.mall.model.CmsPrefrenceArea;
import com.macro.mall.model.CmsPreferenceAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsPrefrenceAreaMapper {
    long countByExample(CmsPreferenceAreaExample example);

    int deleteByExample(CmsPreferenceAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    List<CmsPrefrenceArea> selectByExampleWithBLOBs(CmsPreferenceAreaExample example);

    List<CmsPrefrenceArea> selectByExample(CmsPreferenceAreaExample example);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPreferenceAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPreferenceAreaExample example);

    int updateByExample(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPreferenceAreaExample example);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);
}