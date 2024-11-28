public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Chung Ha");
        System.out.println("이름 : "+person.getName());

        person.setName("청하");
        System.out.println("변경된 이름 : "+person.getName());

        person.setName("BadName");
        System.out.println("변경된 이름 : "+person.getName());
    }
}
