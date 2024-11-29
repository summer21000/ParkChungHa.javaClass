public class GenericMain {
    public static void main(String[] args) {
        GenericClass<String> stringInstance = new GenericClass<>();
        stringInstance.setData("안녕, 제네릭");
        String data = stringInstance.getData();
        System.out.println(data);

        GenericClass<Integer> intInstance = new GenericClass<>();
        intInstance.setData(123);
        Integer intData = intInstance.getData();
        System.out.println(intData);
    }
}
