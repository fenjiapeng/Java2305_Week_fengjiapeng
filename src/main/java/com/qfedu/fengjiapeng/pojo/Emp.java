package com.qfedu.fengjiapeng.pojo;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:21
 *   `eid` int NOT NULL,
 *   `ename` varchar(255) DEFAULT NULL,
 *   `pass` varchar(255) DEFAULT NULL,
 *   `salary` decimal(10,2) DEFAULT NULL,
 *   `did` int DEFAULT NULL,
 */
public class Emp {
    private Integer eid;
    private String ename;
    private String pass;
    private Double salary;
    private Integer did;
    private String dname;
    private String loc;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", pass='" + pass + '\'' +
                ", salary=" + salary +
                ", did=" + did +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
