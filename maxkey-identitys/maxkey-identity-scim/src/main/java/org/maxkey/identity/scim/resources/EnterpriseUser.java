package org.maxkey.identity.scim.resources;

public class EnterpriseUser extends User {
    /**
     * 
     */
    private static final long serialVersionUID = 3212312511630459427L;
    private  String employeeNumber;
    private  String costCenter;
    private  String organization;
    private  String division;
    private  String department;
    private  Manager manager;
    
    public String getEmployeeNumber() {
        return employeeNumber;
    }
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getCostCenter() {
        return costCenter;
    }
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Manager getManager() {
        return manager;
    }
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public EnterpriseUser() {
    }
    
    
}
