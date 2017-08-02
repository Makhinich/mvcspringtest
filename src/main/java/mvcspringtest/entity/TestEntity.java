package mvcspringtest.entity;

/**
 * Created by Slava on 01.08.2017.
 */
public class TestEntity {

    private String firstName;

    private String lastName;

    // обязательно должен быть конструктор без параметров, или вообще без конструктора, чтоб работал конструктор по умолчанию

    // и сеттеры

    @Override
    public String toString() {
        return "TestEntity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public TestEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public TestEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

}
