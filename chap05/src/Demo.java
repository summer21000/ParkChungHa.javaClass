public class Demo {
    int field;

    public void showDiff(){
        int local = 7;
        field = local;
        System.out.println("클래스 필드 : "+field);
        System.out.println("메서드 지역변수 : "+local);
    }

    public void changeField(){
        field = 10;
    }

    public static void main(String[] args) {
        Demo demoInstance = new Demo();
        demoInstance.showDiff();
        demoInstance.changeField();

        System.out.println("변경된 클래스 필드 : "+demoInstance.field);
    }
}
