class Prod{
    int id;
    String nm;

    Prod(int i, String n){
        id = i;
        nm = n;
    }
    void info(){
        System.out.println(id+" : "+nm);
    }
}

class ExtProd extends Prod{
    int qty;
    ExtProd(int i, String n, int q){
        super(i, n);
        qty = q;
    }

    void info(){
        super.info();
        System.out.println("수량 : "+qty);
    }
}

public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1, "Pen");
        ExtProd ep = new ExtProd(2, "NoteBook", 10);

        p.info();
        ep.info();
    }
}
