package Study;

public class Tclass {
    private static int priSta;
    public  static int pubSta;

    public  Tclass(int a,int b) {
        this.priSta = a;
        this.pubSta = b;
    }

    public static int getPriSta() {
        System.out.println(priSta);
        return priSta;
    }

    public static int getPubSta() {
        System.out.println("I AM public"+pubSta);
        return pubSta;
    }
}
