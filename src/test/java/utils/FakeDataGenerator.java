package utils;

import com.github.javafaker.Faker;

public class FakeDataGenerator {
    private static final Faker faker = new Faker();

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getUsername() {
        return faker.name().username();
    }

    public static String getName() {
        return faker.name().firstName();
    }

    public static String getPassword() {
        return faker.internet().password();
    }

    public static String getPhoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static String getAddress() {
        return faker.address().fullAddress();
    }

    public static String getCity() {
        return faker.address().city();
    }

    public static String getZipCode() {
        return faker.address().zipCode();
    }

    public static String getCountry() {
        return faker.address().country();
    }

    public static String getState() {
        return faker.address().state();
    }

    public static String getSSN() {
        return faker.idNumber().valid();
    }
}
