<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	<br/>
	
	<a href = "RMG">RMG Test</a>
	<br/>
	<form action = 'RMP' method = 'post'>
		<input type = 'submit' value ='RMP_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "sub2/test1">sub2/test1</a>
	<br/>
	<br/>
	<br/>
	<a href = "RMB">RMB Test</a>
	<br/>
	<form action = 'RMB' method = 'post'>
		<input type = 'submit' value ='RMB_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMT">GMT Test</a>
	<br/>
	<form action = 'PMT' method = 'post'>
		<input type = 'submit' value ='PMT_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTH?data1=tlqkf">GMTH Test</a>
	<br/>
	<form action = 'PMTH' method = 'post'>
		<input type = 'text' name = 'data1' placeholder = 'data1' />
		<input type = 'submit' value ='PMTH_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTW?data1=tlqkf">GMTWTest</a>
	<br/>
	<form action = 'PMTW' method = 'post'>
		<input type = 'text' name = 'data1' placeholder = 'data1' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'submit' value ='PMTW_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTP/100/200"> GMTP </a>
	<br/>
		<form action = 'PMTP/100/200' method = 'post'>
		<input type = 'submit' value ='PMTP_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTR?data1=100&data2=400&data2=143"> GMTR_Test </a>
	<br/>
		<form action = 'PMTR' method = 'post'>
		<input type = 'text' name = 'data1' placeholder = 'data1' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'submit' value ='PMTR_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTRO?data1=100&data2=400&data2=143&value3=34212"> 
	GMTRO_Test </a>
	<br/>
		<form action = 'PMTRO' method = 'post'>
		<input type = 'text' name = 'data1' placeholder = 'data1' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'text' name = 'value3' placeholder = 'value3' />
		<input type = 'submit' value ='PMTR_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTRDS?data1=100&data2=400&data3=23&data3=233"> 
	GMTRDS_Test </a>
	<br/>
		<form action = 'PMTRDS' method = 'post'>
		<input type = 'text' name = 'data1' placeholder = 'data1' />
		<input type = 'text' name = 'data2' placeholder = 'data2' />
		<input type = 'text' name = 'data3' placeholder = 'data3' />
		<input type = 'text' name = 'data3' placeholder = 'data3' />
		<input type = 'submit' value ='PMTRDS_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTRM?id=11&name=jihyeon"> 
	GMTRM_Test </a>
	<br/>
		<form action = 'PMTRM' method = 'post'>
		<input type = 'text' name = 'id' placeholder = 'id' />
		<input type = 'text' name = 'name' placeholder = 'name' />
		<input type = 'submit' value ='PMTRM_Test'/>
	</form>
	<br/>
	<br/>
	<br/>
	<a href = "GMTRMO?id=121&name=munjihyeon"> 
	GMTRMO_Test </a>
	<br/>
		<form action = 'PMTRMO' method = 'post'>
		<input type = 'text' name = 'id' placeholder = 'id' />
		<input type = 'text' name = 'name' placeholder = 'name' />
		<input type = 'submit' value ='PMTRMO_Test'/>
	</form>
</body>
</html>