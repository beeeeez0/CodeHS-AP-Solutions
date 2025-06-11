public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] arr = {"Welcome to", "the snap shot", "app!"};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = "Upgrade to";
        arr[2] = "premium app!";
        System.out.println();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}