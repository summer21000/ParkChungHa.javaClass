public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPionterException 발생 : "+ e.getMessage());
        }
    }
}
