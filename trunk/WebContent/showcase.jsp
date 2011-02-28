<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
Showcase
<form action="showcase.jsp">
	<input type="text" name="test" value="${param.test == null ? '     테     스        트              ' : param.test}">
	<input type="submit">
</form>