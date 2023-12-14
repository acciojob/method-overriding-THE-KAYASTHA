package com.driver;

public class Main {

public static void main(String args[]){


     B obj=new B();
    String first= obj.meth();
    System.out.print(first);


    }
    static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends A{

        String meth(){

            return "Method is overridden in Extendend class B";
        }

    }
  
}
