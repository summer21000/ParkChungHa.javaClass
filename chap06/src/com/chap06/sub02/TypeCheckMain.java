package com.chap06.sub02;

class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("나는 사람임 : "+name);
    }
}

class Student extends Person{
    int id;
    Student(String name, int id){
        super(name);
        this.id = id;
    }

    void introduce(){
        super.introduce();
        System.out.println("학생 번호 : "+id);
    }
}

public class TypeCheckMain {
    public static void main(String[] args) {
        Person person = new Person("박지선");
        Student student = new Student("박청하", 182466);

        if (person instanceof Person){
            System.out.println("person은 Person클래스의 인스턴스임");
        }

        if (student instanceof Person){
            System.out.println("student는 Person클래스의 인스턴스임(상속관계)");
        }

        if (person instanceof Student){
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else {
            System.out.println("person은 Student로 변환불가");
        }

        Person p = student;
        p.introduce();

        if (p instanceof Student) {
            Student s = (Student) p;
            s.introduce();
        }
    }
}
