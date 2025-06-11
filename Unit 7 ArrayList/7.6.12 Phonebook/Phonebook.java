import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<PhoneNumber> book = new ArrayList<PhoneNumber>();

    public void addNumber(PhoneNumber number) {
        book.add(number);
        sort();
    }

    public void sort() {
        for(int index = 1; index < book.size(); index++) {
            String curName = book.get(index).getName();
            PhoneNumber curElem = book.get(index);
            int curIndex = index-1;

            while(curIndex >= 0 && book.get(curIndex).getName().compareTo(curName) > 0) {
                book.set(curIndex+1, book.get(curIndex));
                curIndex--;
            }

            book.set(curIndex+1, curElem);
        }
    }

    public void printPhoneBook() {
        for(PhoneNumber number : book) {
            System.out.println(number.getName());
        }
    }
}