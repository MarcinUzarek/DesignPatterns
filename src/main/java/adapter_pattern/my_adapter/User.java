package adapter_pattern.my_adapter;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class User {

    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;


    private final String PESEL;


    public User(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
        this.dateOfBirth = LocalDate.now();
    }

}
