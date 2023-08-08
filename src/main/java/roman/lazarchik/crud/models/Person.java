package roman.lazarchik.crud.models;

import javax.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Name must not be empty")
    @Size(min = 2, max = 20, message = "The name must not be shorter than two characters")
    private String name;
    @Min(value = 0, message = "Age must be greater than 0")
    private int age;
    @Email(message = "Email must be valid")
    @NotEmpty(message = "Email must not be empty")
    private String email;

    // Страна, Город, Индекс (6 цифр)
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Your address must follow the following format: Country, City, Postcode (6 digits)")
    // "^[A-Z][a-zA-Z']{1,50}, [A-Z][a-zA-Z']{1,50}, \\d{6}$"
    //"^[A-Z][a-zA-Z']+,\\s[A-Z][a-zA-Z']+,\\s\\d{6}$"
    private String address;

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
