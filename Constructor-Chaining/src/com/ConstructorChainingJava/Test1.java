package com.ConstructorChainingJava;

public class Test1 {
   public Test1() {
	   System.out.println("Test classes");
   }
   public Test1(int t) {
	   System.out.println("Test class constructor");
   }
}
   class A extends Test1{
	   public A() {
		   this("Rahul");
		   System.out.println("Constructor A 1");
	   }
	   public A(String str) {
		   System.out.println("Constructor A 2");
	   }
   }
   class B extends A{
	   public B() {
		   this(10);
		   System.out.println("Constructor B 1");
	   }
	   public B(int a) {
		   System.out.println("Constructor B 2 ");
	   }
   }
  class C extends B{
	  public C() {
		  this(10);
		  System.out.println("Constructor C 1");
	  }
	  public C(int c) {
		  System.out.println("Constructor C 2");
	  }
  }

