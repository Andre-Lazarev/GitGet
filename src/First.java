//это будет суперкласс
public class First {

    private int a, b;

    First(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        int summa = this.a + this.b;
        return summa;
    }

}
