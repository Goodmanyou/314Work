<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>资产管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

	<div class="top"></div>
	<div id="header">
		<div class="logo">资产管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li>${userid}</li>
				<li><a href="">修改密码</a></li>
				<li><a href="">设置</a></li>
				<li><a href="login.jsp">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M4">订单操作						<span></span>
					</h4>
					<div class="list-item none">
						<a href=''>评论管理1</a> <a href=''>评论管理2</a> <a href=''>评论管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M2">
						<span></span>资产领用
					</h4>
					<div class="list-item none">
						<a href ="findidles/findidle" target="s">资产闲置信息</a> 
						<a href="findidles?action=findpage" target="s">已借用的信息</a> 
					</div>
				</li>
				<li>
					<h4 class="M3">
						<span></span>资产归还
					</h4>
					<div class="list-item none">
						<a href="borrow/findborrowlist" target="s">已借用的信息</a>
					</div>
				</li>
				<li>
					<h4 class="M4">
						<span></span>资产卡片
					</h4>
					<div class="list-item none">
						<a href=''>评论管理1</a> <a href=''>评论管理2</a> <a href=''>评论管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M5">
						<span></span>资产列表
					</h4>
					<div class="list-item none">
						<a href=''>调研问卷1</a> <a href=''>调研问卷2</a> <a href=''>调研问卷3</a>
					</div>
				</li>
				<!-- <li>
					<h4 class="M6">
						<span></span>数据统计
					</h4>
					<div class="list-item none">
						<a href=''>数据统计1</a> <a href=''>数据统计2</a> <a href=''>数据统计3</a>
					</div>
				</li>
				<li>
					<h4 class="M7">
						<span></span>奖励管理
					</h4>
					<div class="list-item none">
						<a href=''>奖励管理1</a> <a href=''>奖励管理2</a> <a href=''>奖励管理3</a>
					</div>
				</li>
				<li>
					<h4 class="M8">
						<span></span>字典维护
					</h4>
					<div class="list-item none">
						<a href=''>字典维护1</a> <a href=''>字典维护2</a> <a href=''>字典维护3</a> <a
							href=''>字典维护4</a> <a href=''>字典维护5</a> <a href=''>字典维护6</a> <a
							href=''>字典维护7</a> <a href=''>字典维护8</a> <a href=''>字典维护9</a> <a
							href=''>字典维护4</a> <a href=''>字典维护5</a> <a href=''>字典维护6</a> <a
							href=''>字典维护7</a>
					</div>
				</li>
				<li>
					<h4 class="M9">
						<span></span>内容管理
					</h4>
					<div class="list-item none">
						<a href=''>内容管理1</a> <a href=''>内容管理2</a> <a href=''>内容管理3</a>
					</div>
				</li> -->

			</ul>
		</div>
		<div class="m-right">
			
			<div class="main">
				<iframe name="s" id="s" width="1600" height="920" frameborder="0"></iframe>
			</div>
		</div>
	</div>
	<div class="bottom"></div>
	<div id="footer">
		<p>
			Copyright© 2019 版权所有 314宿舍</a>
		</p>
	</div>
	<script>navList(12);
	</script>
</body>
</body>
</html>
