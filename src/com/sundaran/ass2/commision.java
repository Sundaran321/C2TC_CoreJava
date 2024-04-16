package com.sundaran.ass2;

public class commision
{

	  String Name;
    String Address;
    long PhoneNo;
    double salesAmount;
    double commision;
  public void AcceptDetails_Employee(String Name,String Address,long PhoneNo,double salesAmount) {
  	this. Name=Name;
  	this. Address=Address;
  	this. PhoneNo=PhoneNo;
  	this.salesAmount=salesAmount;
   }

   
  public double CalculateCommission(){ 
  	 if (salesAmount>=100000){
  		 return commision  = salesAmount*0.1;
  	 }
  	 else if(50000<=salesAmount && salesAmount<100000) {
  		 return  commision = salesAmount*0.05;
  	 }
  	 else if(30000<=salesAmount && salesAmount<50000) {
  		 return  commision=salesAmount*0.03;
  	 }
  	 else  {
  		 return  0;
  	 }
  }

  public static void main(String[] args) {
Person student=new Person();
  	commision commission =new commision();
  	commission.AcceptDetails_Employee("Riswana","1057 vanji nagar",996754890,90000);
  	double commisionAmount =commission.CalculateCommission();
  	System.out.println("Commission amount:$"+commisionAmount);
  	

  	}
}
