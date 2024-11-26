public class StringExample {
    public static void main(String[] args) {
        String greeting = "안녕하세요";

        System.out.println(greeting);

        String name = new String("java 사용자");
        System.out.println(name);

        char[] charArray = {'j', 'a', 'v', 'a',' ', '프','로','그','레','머'};
        String programmer = new String(charArray);
        System.out.println(programmer);

        String fullName = "Park" + " " + "Chung Ha";
        System.out.println(fullName);
        

        StringBuilder sb = new StringBuilder();
        sb.append("문자열 ");
        sb.append("생성 ");
        sb.append("예제");

        System.out.println(sb);

    }
}
