package model;
// Generated May 9, 2017 10:07:54 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Emp generated by hbm2java
 */
public class Emp  implements java.io.Serializable {


     private int empno;
     private String ename;
     private String job;
     private Integer mgr;
     private Date hiredate;
     private BigDecimal sal;
     private BigDecimal comm;
     private Byte deptno;

    public Emp() {
    }

	
    public Emp(int empno) {
        this.empno = empno;
    }
    public Emp(int empno, String ename, String job, Integer mgr, Date hiredate, BigDecimal sal, BigDecimal comm, Byte deptno) {
       this.empno = empno;
       this.ename = ename;
       this.job = job;
       this.mgr = mgr;
       this.hiredate = hiredate;
       this.sal = sal;
       this.comm = comm;
       this.deptno = deptno;
    }
   
    public int getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public String getEname() {
        return this.ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    public Integer getMgr() {
        return this.mgr;
    }
    
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }
    public Date getHiredate() {
        return this.hiredate;
    }
    
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }
    public BigDecimal getSal() {
        return this.sal;
    }
    
    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }
    public BigDecimal getComm() {
        return this.comm;
    }
    
    public void setComm(BigDecimal comm) {
        this.comm = comm;
    }
    public Byte getDeptno() {
        return this.deptno;
    }
    
    public void setDeptno(Byte deptno) {
        this.deptno = deptno;
    }




}

