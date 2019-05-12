package com.model;


/**
 * 资产入账表类
 * @author Administrator
 *
 */
public class Assets {
	
	private Integer assets_id;   //凭证号
	private String equ_name;  //资产名称
	private String financial_code; //财务编码
	private String asset_code;   //资产编码
	private String in_date;      //入库时间
	private String unit;         //单位
	private Double equ_price;    //单价
	private String total_price;  //总价
	public Integer getAssets_id() {
		return assets_id;
	}
	public void setAssets_id(Integer assets_id) {
		assets_id = assets_id;
	}
	public String getEqu_name() {
		return equ_name;
	}
	public void setEqu_name(String equ_name) {
		this.equ_name = equ_name;
	}
	public String getFinancial_code() {
		return financial_code;
	}
	public void setFinancial_code(String financial_code) {
		this.financial_code = financial_code;
	}
	public String getAsset_code() {
		return asset_code;
	}
	public void setAsset_code(String asset_code) {
		this.asset_code = asset_code;
	}
	public String getIn_date() {
		return in_date;
	}
	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Double getEqu_price() {
		return equ_price;
	}
	public void setEqu_price(Double equ_price) {
		this.equ_price = equ_price;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	@Override
	public String toString() {
		return "Assets [Assets_id=" + assets_id + ", equ_name=" + equ_name + ", financial_code=" + financial_code
				+ ", asset_code=" + asset_code + ", in_date=" + in_date + ", unit=" + unit + ", equ_price=" + equ_price
				+ ", total_price=" + total_price + "]";
	}
}
