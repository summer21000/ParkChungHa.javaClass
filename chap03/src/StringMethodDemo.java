public class StringMethodDemo {
    public static void main(String[] args) {
        String originalString = " Java Programming";

        String subString = originalString.substring(5);
        System.out.println("substring(5) 결과 : "+subString);

        String lowerCaseString = originalString.toLowerCase();
        System.out.println("toLowerCase() 결과 : "+ lowerCaseString);

        String upperCaseString = originalString.toUpperCase();
        System.out.println("toUpperCase() 결과 : "+upperCaseString);

        String trimmedString = originalString.trim();
        System.out.println("trim() 결과 : "+trimmedString);
    }
}
