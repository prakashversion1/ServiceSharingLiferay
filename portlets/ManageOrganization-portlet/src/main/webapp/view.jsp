<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page
	import="com.test.portlets.service.ManageOrganizationLocalServiceUtil"%>
<%@page import="com.test.portlets.model.ManageOrganization"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ include file="/init.jsp"%>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<portlet:defineObjects />
<style>
.organizationTable td,th {
	padding: 10px;
}

.addOrganization {
	background-color: #93939A;
	padding: 20px;
	margin-top: 20px;
}
</style>
<%
	List<ManageOrganization> listofOrganization = ManageOrganizationLocalServiceUtil.listAllOrganization();
	System.out.println("The Size of organization is "+ listofOrganization.size());
%>

<div>
	<liferay-ui:success key="success"
		message="organization saved successfully!" />
	<liferay-ui:error key="error"
		message="Some error while updating the user!!!" />
	<h2>List of Organization</h2>
	<c:set value="<%=listofOrganization%>" var="allOrganization"
		scope="session"></c:set>
	<table style="width: 200px" border="1" class="organizationTable">
		<tr>
			<th width="40%">Id</th>
			<th width="60%">Sb Name</th>
		</tr>
		<c:forEach items="${allOrganization}" var="organization">
			<tr>
				<td>${organization.getSbId()}</td>
				<td>${organization.getSbName()}</td>
			</tr>
		</c:forEach>
	</table>
</div>
<div class="addOrganization">
	<h2>Add New Organization</h2>
	<portlet:actionURL name="saveOrganization" var="addOrganizationURL" />
	<aui:form name="fm" action="<%=addOrganizationURL.toString()%>">
		<aui:fieldset>
			<aui:input name="sbName" label="Organization Name" value="" size="45"
				placeholder="Enter Your Organization" />
			<aui:button-row>
				<aui:button type="submit" />
			</aui:button-row>
		</aui:fieldset>
	</aui:form>
</div>
<div class="searchEmployee">
	<div class="selectSBID">
		<select name="selectID" id="selectID" onChange="searchEmp();">
			<%
				for (ManageOrganization organization : listofOrganization) {
			%>
			<option value="<%=organization.getSbId()%>">
				<%=organization.getSbId() + " : "
								+ organization.getSbName()%>
			</option>
			<%
				}
			%>
		</select>
	</div>
	<portlet:actionURL name="getEmployeeBySBID" var="searchEmployeesURL" />
	<input id="searchEmployeesURL" name="searchEmployeesURL"
		value="<%=searchEmployeesURL%>" type="hidden"></input>
	<div class="showEmployees">
		<ul class="listEmployee">
		</ul>
	</div>
</div>
<script>
	function searchEmp() {
		console.log("the select is changed");
		var sbId = $('#selectID').val();
		var uri = $('#searchEmployeesURL').val();
		$('#listEmployee').empty();
		$.ajax({
			type : 'POST',
			data : {
				sbId : sbId,
			},
			url : uri,
			success : function(data) {
				console.log('Successfully received data');
				console.log(data);
				loadData(data);
			},
			error : function(msg) {

			}
		});
	}
	function loadData(data) {
		console.log("inside loadData");
		if (data) {
			for (i in data) {
				console.log(data[i]);
				$('.showEmployees ul').append(
						"<li>" + i + " .  " + data[i].empName + "</li>");
			}
		} else {
			$('ul').append('No data found.');
		}
	}
</script>
