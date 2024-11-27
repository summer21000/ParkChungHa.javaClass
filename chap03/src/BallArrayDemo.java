class Ball{

}

public class BallArrayDemo {
    public static void main(String[] args) {
        Ball[] balls = new Ball[5];

        for(int i = 0; i < 2; i++){
            balls[i] = new Ball();
        }

        System.out.println("배열의 원소들 : ");
        for (Ball ball : balls){
            if (ball != null) {
                System.out.println(ball);
            }
            else {
                System.out.println("null");

            }
        }
    }
}
