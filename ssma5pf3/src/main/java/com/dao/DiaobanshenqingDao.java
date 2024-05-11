package com.dao;

import com.entity.DiaobanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiaobanshenqingVO;
import com.entity.view.DiaobanshenqingView;


/**
 * 调班申请
 * 
 * @author 
 * @email 
 * @date 2021-04-19 00:33:34
 */
public interface DiaobanshenqingDao extends BaseMapper<DiaobanshenqingEntity> {
	
	List<DiaobanshenqingVO> selectListVO(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
	
	DiaobanshenqingVO selectVO(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
	
	List<DiaobanshenqingView> selectListView(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);

	List<DiaobanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
	
	DiaobanshenqingView selectView(@Param("ew") Wrapper<DiaobanshenqingEntity> wrapper);
	
}
