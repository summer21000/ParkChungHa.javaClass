public class ArrayAccessDemo {
    public static void main(String[] args) {
        int[] scores = {100, 90, 50, 95, 85};

        int FirstScore = scores[0];
        System.out.println("첫 번째 점수 : "+FirstScore);

        int LastScore = scores[scores.length-1];
        System.out.println("마지막 점수 : "+LastScore);

        System.out.println("배열의 크기 : "+scores.length);

        System.out.println("배열의 모든 원소 : ");
        for (int i = 0; i< scores.length; i++){
            System.out.println("원소"+i+" : "+scores[i]);

        }
    }
}
