package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiaobanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiaobanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiaobanshenqingView;


/**
 * 调班申请
 *
 * @author 
 * @email 
 * @date 2021-04-19 00:33:34
 */
public interface DiaobanshenqingService extends IService<DiaobanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiaobanshenqingVO> selectListVO(Wrapper<DiaobanshenqingEntity> wrapper);
   	
   	DiaobanshenqingVO selectVO(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
   	
   	List<DiaobanshenqingView> selectListView(Wrapper<DiaobanshenqingEntity> wrapper);
   	
   	DiaobanshenqingView selectView(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiaobanshenqingEntity> wrapper);
   	
}

