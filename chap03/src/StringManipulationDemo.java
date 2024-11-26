public class StringManipulationDemo {
    public static void main(String[] args) {
        String baseString = "Hello";
        String stringToConcat = " World";
        String searchString = "lo";

        String concatenatedString = baseString.concat(stringToConcat);
        System.out.println(concatenatedString);

        int index = concatenatedString.indexOf(searchString);
        System.out.println("'"+searchString+"'의 인덱스 : "+index);

        boolean isEmpty = baseString.isEmpty();
        System.out.println("baseString이 비어있음 : "+isEmpty);

        int length = concatenatedString.length();
        System.out.println(length);
    }
}
