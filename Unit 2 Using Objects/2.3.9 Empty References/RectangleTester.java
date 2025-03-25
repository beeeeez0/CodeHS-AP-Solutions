public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(1,1);
        Rectangle other = new Rectangle(1, 3);
        Rectangle fencePost;

        System.out.println(brick);
        System.out.println(other);

        // Change the fencePost dimensions
        fencePost = new Rectangle(1, 5);
        System.out.println(fencePost);

    }
}