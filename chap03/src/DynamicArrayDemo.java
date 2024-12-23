import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        stringList.remove("Python");

        String elementAtIndex = stringList.get(1);

        int size = stringList.size();

        System.out.println("인덱스 1의 요소 : "+elementAtIndex);
        System.out.println("ArrayList의 크기 : "+ size);
        System.out.println("ArrayList의 현재 요소들 : ");
        for (String s : stringList){
            System.out.println(s);
        }

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(100);
        intList.add(200);
        intList.add(1);

        for (int i:intList){
            System.out.println(i);
        }
        System.out.println("------------------------");
        intList.remove(1);
        for (int i:intList){
            System.out.println(i);
        }
        System.out.println("------------------------");
        intList.remove(Integer.valueOf(1));
        for (int i:intList){
            System.out.println(i);
        }




    }
}
