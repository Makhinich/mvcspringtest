package mvcspringtest.entity;

/**
 * Created by Slava on 01.08.2017.
 */
public class TestEntity {

    private String firstName;

    private int age;

    // обязательно должен быть конструктор без параметров, или вообще без конструктора, чтоб работал конструктор по умолчанию

    // и сеттеры


    @Override
    public String toString() {
        return "TestEntity{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    public TestEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TestEntity setAge(int age) {
        this.age = age;
        return this;
    }
}
