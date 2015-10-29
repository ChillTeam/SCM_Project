package com.scm;

public class Salespeople {
		String name ="";
		double salary=0;
		double circulation=0;
		double wage;
		public Salespeople(String name,double salary,double circulation){
			this.name=name;
			this.salary=salary;
			this.circulation=circulation;
		}
		public String getName()  {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public double getCirculation() {
			return circulation;
		}
		public void setCirculation(double circulation) {
			this.circulation = circulation;
		}
		public double wages() {
		
			if(circulation>0 && circulation <= 25000 ){
				this.wage = circulation*1.01;
				
			}else if(circulation>25000 &&circulation <= 50000 ){
				this.wage = circulation*1.02;
				
			}else if(circulation>50000 ){
				this.wage = circulation*1.03;
				
			}
			if(this.wage < 18000){
				this.wage = 18000;
			}
			
			
			return wage;
		}
		public String toString() {
			
			String total="";
			total="Name : "+name+" Wage : "+wage;
			
			return total;
		}
}
