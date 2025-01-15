package com.aoding.mall.Service;

import com.aoding.mall.model.CmsPreferenceArea;

import java.util.List;

/**
 * 优选专区管理Service
 * Created by macro on 2018/6/1.
 */
public interface CmsPreferenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPreferenceArea> listAll();
}
