class Animal{
    String eye;
    String mouth;

    void eat(){
        System.out.println("먹는 중...");
    }
    void sleep(){
        System.out.println("잠자는 중...");
    }
}

class Eagle extends Animal{
    String wing;
    void fly() {
        System.out.println("날아다니는 중...");
    }
}

class Tiger extends Animal{
    String leg;
    void run(){
        System.out.println("달리는 중...");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Tiger tiger = new Tiger();

        eagle.fly();
        tiger.run();
        eagle.eat();
        tiger.sleep();
    }
}
