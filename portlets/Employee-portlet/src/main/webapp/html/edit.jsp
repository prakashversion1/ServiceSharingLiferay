<%@page
	import="com.test.portlets.service.ManageOrganizationLocalServiceUtil"%>
<%@page import="com.test.portlets.model.ManageOrganization"%>
<%@page import="com.test.portlets.service.EmployeeLocalServiceUtil"%>
<%@page import="com.test.portlets.model.Employee"%>
<%@ include file="/init.jsp"%>
<%
	Employee employee = (Employee) request.getAttribute("employee");
	List<ManageOrganization> allOrganization = ManageOrganizationLocalServiceUtil
			.listAllOrganization();
%>
<div class="addEmployee">
	<h2>Update Employee</h2>
	<portlet:actionURL name="updateEmployee" var="updateEmployeeURL" />
	<aui:form name="fm" action="<%=updateEmployeeURL.toString()%>">
		<aui:fieldset>
			<aui:input name="empId" type="hidden"
				value="<%=employee.getEmployeeId()%>" />
			<aui:input name="empName" label="Employee Name"
				value="<%=employee.getEmployeeName()%>" size="45"
				placeholder="Update Your Name" />
			<aui:input label="Gender" name="empGender"
				value="<%=employee.getEmployeeGender()%>" size="45"
				placeholder="Update your Gender" />

			<%-- 			<aui:select label="sbId" name="sbId"></aui:select> --%>
			<aui:select label="Buissness" name="sbId" >
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
<portlet:renderURL var="viewEmployeeListURL">
	<portlet:param name="jspPage" value="/html/show.jsp" />
</portlet:renderURL>
<p>
	<a href="<%=viewEmployeeListURL%>"><b>Back</b></a>
</p>