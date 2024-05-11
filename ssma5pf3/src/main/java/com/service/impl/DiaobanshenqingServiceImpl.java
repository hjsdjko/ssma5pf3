package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiaobanshenqingDao;
import com.entity.DiaobanshenqingEntity;
import com.service.DiaobanshenqingService;
import com.entity.vo.DiaobanshenqingVO;
import com.entity.view.DiaobanshenqingView;

@Service("diaobanshenqingService")
public class DiaobanshenqingServiceImpl extends ServiceImpl<DiaobanshenqingDao, DiaobanshenqingEntity> implements DiaobanshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiaobanshenqingEntity> page = this.selectPage(
                new Query<DiaobanshenqingEntity>(params).getPage(),
                new EntityWrapper<DiaobanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiaobanshenqingEntity> wrapper) {
		  Page<DiaobanshenqingView> page =new Query<DiaobanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiaobanshenqingVO> selectListVO(Wrapper<DiaobanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiaobanshenqingVO selectVO(Wrapper<DiaobanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiaobanshenqingView> selectListView(Wrapper<DiaobanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiaobanshenqingView selectView(Wrapper<DiaobanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
