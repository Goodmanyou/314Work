<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/login.css"/>
    <title>登陆页面</title>
    
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
  <div class="global">
            <form action="login/login" method="post">
			<div class="log log_in" tabindex='-1' id='dl'>
				<dl>
					<dt>
						<div class='header'>
							<h3>登&nbsp;录</h3>
						</div>
					</dt>
					<dt></dt>
					<dt>
						<div class='letter'>
							用户名:&nbsp;<input type="text" name="userid" id="userid" tabindex='1' value="${userid}"/>
						</div>
					</dt>
					<dt>
						<div class='letter'>
							密&nbsp;&nbsp;&nbsp;码:&nbsp;<input type="password" name="pwd" id="pwd" tabindex='2' value="${userpwd}"/>
						</div>
					</dt>
					<dt>
						<div>
							<input type="submit" name="" id="login" value='&nbsp登&nbsp录&nbsp' tabindex='3'/>
							<input type="button" name="" id="sig_in" value='&nbsp注&nbsp册&nbsp' tabindex='4'/>
						</div>
					</dt>
				</dl>
			</div>
			</form> 
			<form action="register/register" method="post">
			<div class="sig sig_out" tabindex='-1' id='zc' style='visibility:hidden;'>
				<dl>
					<dt>
						<div class='header'>
							<h3>注&nbsp;册</h3>
						</div>
					</dt>
					<dt></dt>
					<dt>
						<div class='letter'>
							用户名:&nbsp;<input type="text"  id="regist_user_id" name="regist_user_id" tabindex='5'/>
							<div class='warning' id='warning_1'><span>该用户名不可用</span></div>
						</div>
					</dt>
					<dt>
						<div class='letter'>
							昵&nbsp;&nbsp;&nbsp;称:&nbsp;<input type="text"  id="regist_user_name" name="regist_user_name" tabindex='6'/>
						</div>
					</dt>
					<dt>
						<div class='letter'>
							密&nbsp;&nbsp;&nbsp;码:&nbsp;<input type="password"  id="regist_password" name="regist_password" tabindex='7'/>
							<div class='warning' id='warning_2'><span>密码长度过短</span></div>
						</div>
					</dt>
					<dt>
						<div class='password'>
							&nbsp;&nbsp;&nbsp;确认密码:&nbsp;<input type="password"  id="final_password" name="final_password" tabindex='8'/>
							<div class='warning' id='warning_3'><span>密码输入不一致</span></div>
						</div>
					</dt>
					<dt>
						<div>
							<input type="submit" name="" id="regist_button" value='&nbsp注&nbsp册&nbsp' tabindex='9'/>
							<input type="button" name="" id="back" value='&nbsp返&nbsp回&nbsp' tabindex='10'/>
							<script type="text/javascript">
							function get(e){
								return document.getElementById(e);
							}
							get('sig_in').onclick=function(){
								get('dl').className='log log_out';
								get('zc').className='sig sig_in';
							}
							get('back').onclick=function(){
								get('zc').className='sig sig_out';
								get('dl').className='log log_in';
							}
							window.onload=function(){
								var t =setTimeout("get('zc').style.visibility='visible'",800);
								get('final_password').onblur=function(){
									var npassword=get('regist_password').value;
									var fpassword=get('final_password').value;
									if(npassword!=fpassword){
										get('warning_3').style.display='block';
									}
								}
								get('regist_password').onblur=function(){
									var npassword=get('regist_password').value.length;
									if(npassword<6&&npassword>0){
										get('warning_2').style.display='block';
									}
								}
								get('regist_password').onfocus=function(){
									get('warning_2').style.display='none';
								}
								get('final_password').onfocus=function(){
									get('warning_3').style.display='none';
								}
							}
							</script>
						</div>
					</dt>
				</dl>
			</div>
			</form> 
		</div>
  </body>
</html>
