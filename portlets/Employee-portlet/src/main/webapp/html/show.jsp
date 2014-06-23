<%@page
	import="com.test.portlets.service.ManageOrganizationLocalServiceUtil"%>
<%@page import="com.test.portlets.model.ManageOrganization"%>
<%@page import="com.test.portlets.service.EmployeeLocalServiceUtil"%>
<%@page import="com.test.portlets.model.Employee"%>
<%@ include file="/init.jsp"%>
<%
	List<Employee> allEmployees = EmployeeLocalServiceUtil
			.listAllEmployees();
	System.out
			.println("The Size of employee is " + allEmployees.size());
	List<ManageOrganization> allOrganization = ManageOrganizationLocalServiceUtil
			.listAllOrganization();
%>
<style>
.employeeTable td,th {
	padding: 10px;
}

.addEmployee {
	background-color: #93939A;
	padding: 20px;
	margin-top: 20px;
}
</style>
<div>
	<liferay-ui:success key="success"
		message="Employee saved successfully!" />
	<liferay-ui:success key="error"
		message="Some error while updating the user!!!" />
	<h2>List of Employees</h2>
	<c:set value="<%=allEmployees%>" var="allEmployees" scope="session"></c:set>
	<table style="width: 400px" border="1" class="employeeTable">
		<tr>
			<th width="10%">Id</th>
			<th width="30%">Gender</th>
			<th width="30%">Name</th>
			<th width="15%"></th>
			<th width="15%"></th>
		</tr>
		<c:forEach items="${allEmployees}" var="employee">
			<portlet:actionURL name="deleteEmployee" var="removeEmployeeURL">
				<portlet:param name="empId" value="${employee.getEmployeeId()}" />
			</portlet:actionURL>
			<portlet:actionURL name="loadEmployee" var="loadEmployeeURL">
				<portlet:param name="empId" value="${employee.getEmployeeId()}" />
			</portlet:actionURL>
			<tr>
				<td>${employee.getEmployeeId()}</td>
				<td>${employee.getEmployeeGender()}</td>
				<td>${employee.getEmployeeName()}</td>
				<td><a href="<%=loadEmployeeURL%>">Edit</a></td>
				<td><a href="<%=removeEmployeeURL%>">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
<div class="addEmployee">
	<h2>Add New Employees</h2>
	<portlet:actionURL name="addEmployee" var="addEmployeeURL" />
	<aui:form name="fm" action="<%=addEmployeeURL.toString()%>">
		<aui:fieldset>
			<aui:input name="empName" label="Employee Name" value="" size="45"
				placeholder="Enter Your Name" />
			<aui:input label="Gender" name="empGender" value="" size="45" />
			<aui:select label="Buissness" name="sbId">
				<%
					for (ManageOrganization organization : allOrganization) {
				%>
				<aui:option value="<%=organization.getSbId()%>">
					<%=organization.getSbName()%>
				</aui:option>
				<%
					}
				%>
			</aui:select>
			<aui:button-row>
				<aui:button type="submit" />
			</aui:button-row>
		</aui:fieldset>
	</aui:form>
</div>