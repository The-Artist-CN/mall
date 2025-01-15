package com.aoding.mall.dao;

import com.aoding.mall.model.CmsPreferenceAreaProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author trollge
 */
public interface CmsPreferenceAreaProductRelationDao {

    int insertList(@Param("list") List<CmsPreferenceAreaProductRelation> prefrenceAreaProductRelationList);
}
