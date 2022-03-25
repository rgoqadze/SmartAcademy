package DataObject;

import com.github.javafaker.Faker;

public interface AddProductData {
    Faker faker = new Faker();
    String
            ProductName = faker.funnyName().name(),
            NameValue = faker.name().firstName(),
            PhoneNumber = faker.phoneNumber().subscriberNumber(9),
            BankAccountNumber = "GE10TB7395836030100001",
            PowerValue = "30",
            Impedance = "20";
    int
            PriceValue = faker.number().numberBetween(1,99),
            ProductQuantity = faker.number().randomDigitNotZero(),
            ProductWeight = faker.number().randomDigitNotZero();

}
