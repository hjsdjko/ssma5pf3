package com.entity.model;

import com.entity.YishengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 医生信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-19 00:33:34
 */
public class YishengxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 职称
	 */
	
	private String zhicheng;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 值班时间
	 */
	
	private String zhibanshijian;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 医生详情
	 */
	
	private String yishengxiangqing;
		
	/**
	 * 预约须知
	 */
	
	private String yuyuexuzhi;
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：职称
	 */
	 
	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}
	
	/**
	 * 获取：职称
	 */
	public String getZhicheng() {
		return zhicheng;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：值班时间
	 */
	 
	public void setZhibanshijian(String zhibanshijian) {
		this.zhibanshijian = zhibanshijian;
	}
	
	/**
	 * 获取：值班时间
	 */
	public String getZhibanshijian() {
		return zhibanshijian;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：医生详情
	 */
	 
	public void setYishengxiangqing(String yishengxiangqing) {
		this.yishengxiangqing = yishengxiangqing;
	}
	
	/**
	 * 获取：医生详情
	 */
	public String getYishengxiangqing() {
		return yishengxiangqing;
	}
				
	
	/**
	 * 设置：预约须知
	 */
	 
	public void setYuyuexuzhi(String yuyuexuzhi) {
		this.yuyuexuzhi = yuyuexuzhi;
	}
	
	/**
	 * 获取：预约须知
	 */
	public String getYuyuexuzhi() {
		return yuyuexuzhi;
	}
			
}
