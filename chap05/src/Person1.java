public class Person1 {
    private String name;
    private int age;

    public Person1 setname(String name){
        this.name = name;
        return this;
    }

    public  Person1 setAge(int age){
        this.age = age;
        return this;
    }

    public void Hello(){
        System.out.println("안녕, 내 이름은 "+name+"이고 나는 "+age+"살이야.");
    }

    public static void main(String[] args) {
        Person1 person0 = new Person1();
        person0.setname("청하").setAge(25).Hello();
    }
}
