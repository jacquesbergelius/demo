public class Main {

    public static void main(String[] args) {
        A a1 = new A(), a2 = new A(), a3 = new A();
        B b1 = new B(), b2 = new B(), b3 = new B();

        System.out.println(a1.getMyBoss());
        System.out.println(a2.getMyBoss());
        System.out.println(a3.getMyBoss());

        Dictator.getInstance().setDictatorName("Adolf");

        System.out.println(b1.getMyBoss());
        System.out.println(b2.getMyBoss());
        System.out.println(b3.getMyBoss());
    }
}