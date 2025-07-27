package com.Objects;

/**
 * Class Objects.Person is created to test the method, which sorts the list of people descended by year of birth
 * and ascending by last name if some people have same birthday
 */
public class Person {
    private String firstName;
    private String lastName;
    private final Date birthDate;

    public Person(String fn, String ln, Date bd) {
        this.firstName = fn;
        this.lastName = ln;
        this.birthDate = bd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFullInfo() {
        return firstName + " " + lastName + ", " + birthDate.toString();
    }
}
