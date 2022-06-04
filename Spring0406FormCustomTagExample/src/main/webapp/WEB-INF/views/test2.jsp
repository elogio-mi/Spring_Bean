<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> test2</h2>
	
	<!-- requestScope.object.variabl 방식을 대체한 방법... 이라고 생각하면 편함
			기본동작은 POST로 작동하기에 따로 설정하지 않는다. -->
	<!-- 컨트롤러에서 @ModelAttribute에 지정한 파라미터 이름으로 불러오는 것이기에, 
			컨트롤러에 있는 해당 메서드에  @ModelAttribute 설정을 해줘야한다. -->
	<form:form modelAttribute = "testBean" action = "result">
		아이디 : <form:input path='id'/> <br/>
		이름 : <form:input path='name'/> <br/>
			  <form:button> OK</form:button>
	</form:form>
</body>
</html>