package bg.uni.fmi.lab01.tasks.task6;

public class Person {
    private static final String DEFAULT_NAME = "No name";
    private static final int DEFAULT_AGE = -1;
    private String name;
    private int age;

    Person() {
        this(DEFAULT_NAME, DEFAULT_AGE);
    }

    Person(String name) {
        this(name, DEFAULT_AGE);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (name.equals(DEFAULT_NAME)) {
            return "I am John Doe";
        }

        if (age == DEFAULT_AGE) {
            return "Hello, I am " + name;
        }

        return "Hello, I am " + name + ".I am " + age + " old";
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
}