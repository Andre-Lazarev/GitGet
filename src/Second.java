//это будет подкласс
public class Second extends First {

    private int c;

    Second(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    @Override
    public int sum() {
        int summa = super.sum() + c;
        return summa;
    }

    public void print(){
        System.out.println(this.c);
    }

}
