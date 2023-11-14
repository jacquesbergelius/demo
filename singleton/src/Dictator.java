public class Dictator {
    private static Dictator instance;
    private String dictatorName;

    private Dictator() {
        dictatorName = "Josef";
    }

    public static Dictator getInstance() {
        if (instance == null) {
            instance = new Dictator();
        }
        return instance;
    }

    public String getDictatorName() {
        return dictatorName;
    }

    public void setDictatorName(String name) {
        dictatorName = name;
    }
}
