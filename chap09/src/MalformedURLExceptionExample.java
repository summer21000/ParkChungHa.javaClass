import java.net.MalformedURLException;
import java.net.URL;

public class MalformedURLExceptionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("htp://www.example.com");
            System.out.println("프로토콜 : "+url.getProtocol());

        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL형식 입니다. : "+e.getMessage());
        }
    }
}
