package com.model;


/**
 * 财务闲置表
 * @author Administrator
 *
 */
public class Idle {
	
	private Integer idle_id;   	//id
	private String equ_cat;    	//资产类别
	private String equ_name;	//资产名称
	private Integer equ_num;   	//资产数量
	private String idle_loc;   	//存放位置
	public Integer getIdle_id() {
		return idle_id;
	}
	public void setIdle_id(Integer idle_id) {
		this.idle_id = idle_id;
	}
	public String getEqu_cat() {
		return equ_cat;
	}
	public void setEqu_cat(String equ_cat) {
		this.equ_cat = equ_cat;
	}
	
	public String getEqu_name() {
		return equ_name;
	}
	public void setEqu_name(String equ_name) {
		this.equ_name = equ_name;
	}
	public Integer getEqu_num() {
		return equ_num;
	}
	public void setEqu_num(Integer equ_num) {
		this.equ_num = equ_num;
	}
	public String getIdle_loc() {
		return idle_loc;
	}
	public void setIdle_loc(String idle_loc) {
		this.idle_loc = idle_loc;
	}
	@Override
	public String toString() {
		return "Idle [idle_id=" + idle_id + ", equ_cat=" + equ_cat + ", equ_num=" + equ_num + ", idle_loc=" + idle_loc
				+ "]";
	}
	

}
