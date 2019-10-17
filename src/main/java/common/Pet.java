package common;

public class Pet {
    private String name;
    private int age;
    private String type;
    Pet() {

    }
    Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }
}
