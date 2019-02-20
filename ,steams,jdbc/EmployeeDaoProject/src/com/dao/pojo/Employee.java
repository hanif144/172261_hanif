package com.dao.pojo;
import java.sql.Date;


public class Employee {


		
		private int empNo;
		private String ename;
		private String job;
		private int mgr;
		private Date hiredate;
		private double sal;
		private double comm;
		private int deptNo;
		public Employee(int empNo, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptNo) {
			super();
			this.empNo = empNo;
			this.ename = ename;
			this.job = job;
			this.mgr = mgr;
			this.hiredate = hiredate;
			this.sal = sal;
			this.comm = comm;
			this.deptNo = deptNo;
		}
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public int getEmpNo() {
			return empNo;
		}

		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getMgr() {
			return mgr;
		}

		public void setMgr(int mgr) {
			this.mgr = mgr;
		}

		public Date getHiredate() {
			return hiredate;
		}

		public double getSal() {
			
			return sal;
		}
		
		public double getcomm()
		{
			return comm;
			
		}
		public int getdeptNo()
		{
			return deptNo;
		}

	
	

}
