<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	
%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'borrow.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
body {
	overflow: hidden;
	width: 100%;
	height: 100%;
}

table.dataintable {
	margin-top: 10px;
	border-collapse: collapse;
	border: 1px solid #aaa;
}

table.dataintable th {
	vertical-align: baseline;
	padding: 5px 15px 5px 6px;
	background-color: #3F3F3F;
	border: 1px solid #3F3F3F;
	text-align: left;
	color: #fff;
}

table.dataintable td {
	vertical-align: text-top;
	padding: 6px 15px 6px 6px;
	border: 1px solid #aaa;
}

table.dataintable tr:nth-child(odd) {
	background-color: #F5F5F5;
}

table.dataintable tr:nth-child(even) {
	background-color: #fff;
}

input[type="text"] {
	border: 1px;
	background-color: transparent;
	height: 33px;
	width: 250px
}

input[type=submit] {
	width: 120px;
	height: 30px;
	background-color: #3F3F3F;
	color: #fff;
	border: 0px;
}

input[type=reset] {
	width: 120px;
	height: 30px;
	background-color: #3F3F3F;
	color: #fff;
	border: 0px;
}
</style>

</head>

<body>
	<h2 align="center">借用信息登记</h2>
	<div align="center">
		<table class="dataintable">
			<tr>
				<th>资产类别</th>
				<th>资产名称</th>
				<th>资产数量</th>
				<th>存放位置</th>
				
			</tr>
			<tr>

				<td>${idle.equ_cat }</td>
				<td>${idle.equ_name }</td>
				<td>${idle.equ_num}</td>
				<td>${idle.idle_loc}</td>
			</tr>
		</table>
		<form action="borrow/insertandupdate" method="post">
			<table class="dataintable">
				<input type="hidden" value=${idle_id } name="idle_id"/>
				<tr>
					<td>借用资产类别：</td>
					<td><input type="text" name="borrow.equ_cat"
						value=${idle.equ_cat }></td>
				<tr>
					<td>借用资产名称：</td>
					<td><input type="text" name="borrow.equ_name"
						value=${idle.equ_name }></td>
				</tr>
				<tr>
					<td>借用资产数量：</td>
					<td><input type="text" name="borrow.equ_num"></td>
				</tr>
				<tr>
					<td>业务类型：</td>
					<td><input type="text" name="borrow.business_cat"></td>
				</tr>
				<tr>
					<td>业务项目：</td>
					<td><input type="text" name="borrow.business_pro"></td>
				</tr>
				<tr>
					<td>保管人：</td>
					<td><input type="text" name="borrow.user_name"></td>
				</tr>
				<tr>
					<td>借出时间：</td>
					<td><input type="text" name="borrow.borrow_date"></td>
				</tr>
				<tr>
					<td>设备状态：</td>
					<td><input type="text" name="borrow.equ_status"></td>
				</tr>
			</table>
			<input type="submit" value="提交">
		</form>
	</div>

</body>

</html>
