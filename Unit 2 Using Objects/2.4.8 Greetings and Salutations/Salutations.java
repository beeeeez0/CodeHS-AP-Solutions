public class Salutations
{
    private String name;
    // Put your code here

    public Salutations(String _name) {
        name = _name;
    }

    public void addressLetter() {
        System.out.println("Dear " + name);
    }

    public void signLetter() {
        System.out.println("Sincerely,\n" + name);
    }

    public void addressEmail() {
        System.out.println("To whom it may concern:");
    }

    public void signEmail() {
        System.out.println("Thanks,\n" + name);
    }
}