package com.ioc.demo.Employee;

public class Employee {
    private int eid;
    private String fname;
    private String lname;

    public Employee() {
    }
    public Employee(int eid, String fname, String lname) {
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getFnmae() {
        return fname;
    }

    public void setFnmae(String fnmae) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
