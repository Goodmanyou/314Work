<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'turnmessage.jsp' starting page</title>

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
	<h2 align="center">借出资产信息</h2>
	<div align="center">
		<form action="borrow/findidles" method="post">
			搜索：<input type="text" name="catOrname" /> <input type="submit"
				value="查询">
		</form>
		<table class="dataintable">
			<tr>
				<th>借出资产类别</th>
				<th>借出资产名称</th>
				<th>借出资产数量</th>
				<th>业务类型</th>
				<th>业务项目</th>
				<th>保管人</th>
				<th>借出时间</th>
				<th>设备状态</th>
				<th></th>
			</tr>
			<c:forEach items="${listborrow}" var="term">
				<tr>
					<td>${term.equ_cat}</td>
					<td>${term.equ_name}</td>
					<td>${term.equ_num}</td>
					<td>${term.business_cat}</td>
					<td>${term.business_pro}</td>
					<td>${term.user_name}</td>
					<td>${term.borrow_date}</td>
					<td>${term.equ_status}</td>
					<td><a href="borrow/turnback?borrow_id=${term.borrow_id}&equ_name=${term.equ_name}&equ_num=${term.equ_num}"><input
							type="button" value="归还设备"></a></td>
				</tr>
			</c:forEach>
		</table>

	</div>
</body>
</html>
