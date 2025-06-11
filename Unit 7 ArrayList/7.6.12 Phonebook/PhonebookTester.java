public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addNumber(new PhoneNumber("Sherry", "12312312")); // 5
        test.addNumber(new PhoneNumber("Dylan", "12312312")); // 3
        test.addNumber(new PhoneNumber("Kevin", "12312312")); // 4
        test.addNumber(new PhoneNumber("Bob", "12312312")); // 2
        test.addNumber(new PhoneNumber("Alex", "12312312")); // 1
        test.printPhoneBook();

    }
}