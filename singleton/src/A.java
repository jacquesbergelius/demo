public class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public String getMyBoss() {
        return Dictator.getInstance().getDictatorName();
    }
}
