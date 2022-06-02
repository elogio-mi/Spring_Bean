<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<a href = 'test1?data1=100&data2=200&data3=300&data4=400'>test1 get</a> <br/>
	
	<form action ='test2' method='post'>
		data1 : <input type = 'text' name = 'data1'/> <br/>
		data2 : <input type = 'text' name = 'data2'/> <br/><br/>
		data3 : <input type = 'checkbox' name = 'data3' value = '100'/> data3 - 100
				<input type = 'checkbox' name = 'data3' value = '200'/> data3 - 200
				<br/>
				<input type = 'submit' value = 'test2 post'>
	</form>
	<a href = "test4/101/202/303"> test4 - 101 202 303</a>
	<a href = "test5?data1=101&data2=202&data3=303&data3=304"> test5 - 101 202 303,304</a>
	<a href = "test6?data1=102&data2=203&data3=304&data3=305"> test6 - 102 203 304,305</a>
	<a href = "test7?data1=1024"> test7 - 1024</a>
</body>
</html>