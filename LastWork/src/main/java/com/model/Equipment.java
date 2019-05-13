package com.model;

/**
 * 资产类型类
 * @author Administrator
 *
 */

public class Equipment {
	private Integer equ_id;       //id
	private String equ_name;	  //资产名称
	private Double equ_price;     //资产单价
	private String equ_cat;       //资产类别
	private String equ_model;     //资产型号
	private String equ_fac;       //资产制造商
	private String equ_sup;       //资产供应商
	public Integer getEqu_id() {
		return equ_id;
	}
	public void setEqu_id(Integer equ_id) {
		this.equ_id = equ_id;
	}
	public String getEqu_name() {
		return equ_name;
	}
	public void setEqu_name(String equ_name) {
		this.equ_name = equ_name;
	}
	public Double getEqu_price() {
		return equ_price;
	}
	public void setEqu_price(double equ_price) {
		this.equ_price = equ_price;
	}
	public String getEqu_cat() {
		return equ_cat;
	}
	public void setEqu_cat(String equ_cat) {
		this.equ_cat = equ_cat;
	}
	public String getEqu_model() {
		return equ_model;
	}
	public void setEqu_model(String equ_model) {
		this.equ_model = equ_model;
	}
	public String getEqu_fac() {
		return equ_fac;
	}
	public void setEqu_fac(String equ_fac) {
		this.equ_fac = equ_fac;
	}
	public String getEqu_sup() {
		return equ_sup;
	}
	public void setEqu_sup(String equ_sup) {
		this.equ_sup = equ_sup;
	}
	@Override
	public String toString() {
		return "Equipment [equ_id=" + equ_id + ", equ_name=" + equ_name + ", equ_price=" + equ_price + ", equ_cat="
				+ equ_cat + ", equ_model=" + equ_model + ", equ_fac=" + equ_fac + ", equ_sup=" + equ_sup + "]";
	}
	
	
	
	

}
