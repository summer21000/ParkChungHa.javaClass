public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        if (newName.equals("BadName")){
            System.out.println("좋지 않은 이름 선택입니다.");
        }
        else{
            this.name = newName;
        }

    }

    public static void main(String[] args) {
        Person person = new Person("Chung Ha");
        System.out.println("이름 : "+person.name);

        person.setName("청하");
        System.out.println("변경된 이름 : "+person.name);
    }
}
