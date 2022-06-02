<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	
	<form action = "result" method = "post">
		id : <input type='text' name ='id' value = '${requestScope.databean.id}'/> <br/>
		name : <input type='text' name ='id' value = '${requestScope.databean.name}'/> <br/>
		pw : <input type='text' name ='id' value = '${requestScope.databean.pw}'/> <br/>
		address_1 : <input type='text' name ='id' value = '${requestScope.databean.address_1}'/> <br/>
		address_2 : <input type='text' name ='id' value = '${requestScope.databean.address_2}'/> <br/>
		<input type = 'submit' value = 'confirm'/>
	</form>
</body>
</html>