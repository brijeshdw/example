package com.example.equalshashcode;

public class Employee
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;
    
  /*  @Override
    public int hashCode()
    {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getId();
        return result;
    }*/
    public boolean equals(Object o) {
        if(o == null)
        {
            return false;
        }
        if (o == this)
        {
            return true;
        }
        if (getClass() != o.getClass())
        {
            return false;
        }
         
        Employee e = (Employee) o;
        return (this.getId() == e.getId());
    }
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
 
    //Setters and Getters
}
