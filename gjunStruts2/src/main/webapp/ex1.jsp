<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="testAction" method="post">
	<s:textfield name="name" label="姓名"/>
	<s:password name="password" label="密碼"/>
	<s:select name="degree" label="學歷" list="{'高中','大學'}"/>
	<s:radio name="sex" label="性別" list="{'男','女'}"/>
	<s:checkboxlist name="interest" label="興趣" list="{'電影','音樂'}"/>
	<s:textarea name="memo" label="備忘" value="輸入"/>
	<s:submit value="ok"/>

</s:form>
</body>
</html>