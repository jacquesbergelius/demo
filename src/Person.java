public class Person {
    private String name;
    private int age;
    private Person friend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Person friend) {
        this(name, age);
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public boolean equals(Object anotherObject) {
        return name.equals(((Person)anotherObject).name);
    }

    public static void main(String[] args) {
        // Create multiple Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Charlie", 22);

        // Access object properties and methods
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        person2.introduce();
        System.out.println(person3.getName() + " is " + person3.getAge() + " years old.");
    }
}
