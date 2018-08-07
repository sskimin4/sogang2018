package com.mycompany.test;

public class calculator{

  public static void main(String[] args){
    int a=2;
    int b=4;

    System.out.println( sum(a,b));
  }
  private static int sum(int a,int b){
    return a+b;
  }
  private static int minus(int a,int b){
    return a-b;
  }
}
