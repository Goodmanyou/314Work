package com.model;

/**
 * 采购清单类
 * @author Administrator
 *
 */

public class EquipList {
	private Integer elist_id;        //id
	private String elsit_order;      //清单编号
	private String elist_equ_name;   //资产名称
	private Integer elist_equ_num;    //资产数量
	private double elist_price;      //资产总价
	private String elist_equ_sup;    //资产供应商
	private String elist_remarks;    //订单备注

	public Integer getElist_id() {
		return elist_id;
	}
	public void setElist_id(Integer elist_id) {
		this.elist_id = elist_id;
	}
	public String getElist_equ_name() {
		return elist_equ_name;
	}
	public void setElist_equ_name(String elist_equ_name) {
		this.elist_equ_name = elist_equ_name;
	}
	
	public Integer getElist_equ_num() {
		return elist_equ_num;
	}
	public void setElist_equ_num(Integer elist_equ_num) {
		this.elist_equ_num = elist_equ_num;
	}
	public double getElist_price() {
		return elist_price;
	}
	public void setElist_price(double elist_price) {
		this.elist_price = elist_price;
	}
	public String getElist_equ_sup() {
		return elist_equ_sup;
	}
	public void setElist_equ_sup(String elist_equ_sup) {
		this.elist_equ_sup = elist_equ_sup;
	}
	public String getElist_remarks() {
		return elist_remarks;
	}
	public void setElist_remarks(String elist_remarks) {
		this.elist_remarks = elist_remarks;
	}
	public String getElsit_order() {
		return elsit_order;
	}
	public void setElsit_order(String elsit_order) {
		this.elsit_order = elsit_order;
	}
	@Override
	public String toString() {
		return "EquipList [elist_id=" + elist_id + ", elsit_order=" + elsit_order + ", elist_equ_name=" + elist_equ_name
				+ ", elist_equ_num=" + elist_equ_num + ", elist_price=" + elist_price + ", elist_equ_sup="
				+ elist_equ_sup + ", elist_remarks=" + elist_remarks + "]";
	}
	
}
