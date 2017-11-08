package com.util.math;


public class Subtracter
{
 int Value1=-1;
 int Value2=-1;
 
  public Subtracter(int Arg1, int Arg2)
  {
     this.Value1=Arg1;
     this.Value2=Arg2;
  }
  
  public int minuser()
  {
    System.out.println("Inside Minuser..... 23232323232323");
    return Value1-Value2;
  }
  
  public int minusScientific()
  {
	  System.out.println("Inside Scientific Minus");
	  return Math.subtractExact(Value1, Value2);
  }
  
}
