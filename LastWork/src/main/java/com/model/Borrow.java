package com.model;


/**
 * 资产借用表
 * @author Administrator
 *
 */
public class Borrow {
	
	private Integer borrow_id;    //id
	private String equ_cat;       //资产类别
	private String equ_name;      //资产名称
	private Integer equ_num;      //资产数量
	private String business_cat;  //业务类型
	private String business_pro;  //业务项目
	private String user_name;     //保管人
	private String borrow_date;   //借出时间
	private String equ_status;	  //设备状态
	
	public String getBorrow_date() {
		return borrow_date;
	}
	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
	public Integer getBorrow_id() {
		return borrow_id;
	}
	public void setBorrow_id(Integer borrow_id) {
		this.borrow_id = borrow_id;
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
	public String getBusiness_cat() {
		return business_cat;
	}
	public void setBusiness_cat(String business_cat) {
		this.business_cat = business_cat;
	}
	public String getBusiness_pro() {
		return business_pro;
	}
	public void setBusiness_pro(String business_pro) {
		this.business_pro = business_pro;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEqu_status() {
		return equ_status;
	}
	public void setEqu_status(String equ_status) {
		this.equ_status = equ_status;
	}
	@Override
	public String toString() {
		return "Borrow [borrow_id=" + borrow_id + ", equ_cat=" + equ_cat + ", equ_name=" + equ_name + ", equ_num="
				+ equ_num + ", business_cat=" + business_cat + ", business_pro=" + business_pro + ", user_name="
				+ user_name + ", borrow_date=" + borrow_date + "]";
	}
	
	

}
