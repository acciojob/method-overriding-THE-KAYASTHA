package com.driver;

public class Main {

public static void main(String args[]){


     B one=new B();
    String a= one.meth();
     String b=one.meth();
     System.out.println(a);
    System.out.println(b);
    }

  
}
class A{
      String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    @Override
    String meth(){
        return "Method is overridden in Extendend class B";
    }

}