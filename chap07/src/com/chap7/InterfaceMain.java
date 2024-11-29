package com.chap7;

class MyClass implements MyInterface{
    public void sayHello(){
        System.out.println("안녕하세요, 최대값은 : "+MAX);
    }
}

public class InterfaceMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }
}
