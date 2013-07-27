<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- importar libreria core de JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<title>Java bean jsp</title>
<head>

<style type="text/css">
td{vertical-align: top;
    padding: 3px;
     }
#td1{
background-color: lemonchiffon;
border: 1px dashed orange;
padding: 3px;
font-syze: 8pt;
text-align: center;
font-family: verdana;
color: green;
}
#btnCalc{
margin-left:30%;
} 
#operand{
width: 100px;
text-align: left"
} 
#res{
color:green;
} 

</style>

</head>
<body>

        <jsp:useBean id="mybean" class="com.MyBean" scope="session"></jsp:useBean>        

		<c:set target="${mybean}" property="operacion" value="${param.operacion}"/>
		<c:set target="${mybean}" property="operando1" value="${param.operand1}"/>
		<c:set target="${mybean}" property="operando2" value="${param.operand2}"/>	

	
<form  method="get" action="#">
<input type="hidden" name="frm1"/>
  <table style="background-color: beige; border: 1px dashed #999">
	<tr>
	  <td>
		<table style="margin: 10px">
	     <tr>
	     <td colspan="2" style="text-align:center"><b>Resultado</b>
		 <tr>
			<td id="td1" colspan="2"><jsp:getProperty property="resultado" name="mybean"/></td>
			
		 </tr>		 
         
		<tr>
			<td >Operando 1:</td>
			<td ><input id="operand" type="text" name="operand1"></td>
		</tr>
		
		<tr>
			<td >Operando 2:</td>
			<td ><input id="operand" type="text" name="operand2" ></td>
		</tr>
		<tr>
		<td colspan="2"> Elige operacion a realizar</td>

		<tr>			
			<td ><input	type="radio" name="operacion" value="sumar">sumar<br>
			     <input type="radio" name="operacion" value="restar">restar<br />
			     <input type="radio" name="operacion" value="multiplicar">multiplicar<br />
			     <input type="radio" name="operacion" value="dividir">dividir<br />
			 </td>
		</tr>      
				
		<tr>			
			<td colspan="2"><input id="btnCalc" name="calc" type="submit" value="Calcular"></td>
		</tr>		 			

	</table>
	</td>
	</tr>
  </table>
</form>
</body>
</html>