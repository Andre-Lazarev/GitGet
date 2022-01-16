public class Main {

    public static void main(String[] args) {

        First f = new First(1, 2);
        System.out.print("для суперкласса сумма будет такая ");
        System.out.println(f.sum());
        Second s = new Second(3, 4, 5);
        System.out.print("для подкласса сумма будет такая ");
        System.out.println(s.sum());
        s.print();
    }
}
