<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
	
	data1: <form:radiobutton path="data1" value="true" /> true 
			<form:radiobutton path="data1" value="false" /> false <br />
		<form:errors path="data1" />
		<br />
	data2: <form:radiobutton path="data2" value="true" /> true 
			<form:radiobutton path="data2" value="false" /> false <br />
		<form:errors path="data2" />
		<br />
			
	data3: <form:input path="data3" type="text" />
		<br>
		<form:errors path="data3" />
		<br>
			
	data4: <form:checkbox path="data4" value="check1" />checkbox1 <br />
		<form:errors path="data4" />
		<br />
			
	data5: <form:checkbox path="data5" value="check2" />checkbox2 <br />
		<form:errors path="data5" />
		<br />
		
	data6: <form:input path="data6" type="text" />
		<br>
		<form:errors path="data6" />
		<br>
	data7: <form:input path="data7" type="text" />
		<br>
		<form:errors path="data7" />
		<br>

		<form:button type="submit">확인</form:button>
	</form:form>

</body>
</html>