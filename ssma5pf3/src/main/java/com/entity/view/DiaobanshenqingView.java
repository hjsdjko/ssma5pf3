package com.entity.view;

import com.entity.DiaobanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 调班申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 00:33:34
 */
@TableName("diaobanshenqing")
public class DiaobanshenqingView  extends DiaobanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiaobanshenqingView(){
	}
 
 	public DiaobanshenqingView(DiaobanshenqingEntity diaobanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, diaobanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
