package com.pasunuru.scjp;

class emp{
	int empno;
	String empname;
	
	public emp(int empno, String empname) {
		this.empno = empno;
		this.empname = empname;
	}
	
	public boolean equals(emp e) {
		return e.empname.equals(this.empname);
	}
	
}
public class EqualsExample {
	public static void main(String[] args) {
		emp e1 = new emp(10,"srik");
		emp e2 = new emp(10, "srik");
		
		System.out.println(e1.equals(e2));
		
	}

}
