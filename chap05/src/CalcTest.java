class Calc{
    private double res;
    static final double PI = 3.14159;

    public double area(double rad){
        res = PI*rad*rad;
        return res;
    }
    public static double circ(double rad){
        return 2*PI*rad;
    }

    public double getRes(){
        return res;
    }
}

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double a = calc.area(10);
        double result = Calc.circ(10);

        System.out.println("넓이 : "+ a );
        System.out.println("둘레 : "+ result );
        System.out.println(calc.getRes());
        System.out.println(Calc.PI);
    }
}
