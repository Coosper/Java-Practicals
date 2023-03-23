
/**
 * OneRectangle.
 *
 * @author Kacper Marszelewski
 * @version 01/02/2023
 */
public class OneRectangle
{
    public static void main(String[] args) 
    {
        
        
        Rectangle rec1 = new Rectangle(50,60);
        
        System.out.println("The length of rec1 is " + rec1.getLength() );
        System.out.println("The height of rec1 is " + rec1.getHeight() );
        System.out.println();
        
        rec1.setLength(80);
        rec1.setHeight(90);
        
        System.out.println("The new length of rec1 is " + rec1.getLength() );
        System.out.println("The new height of rec 1 is " + rec1.getHeight() );
        System.out.println();
        
        
        
        System.out.println("The area of rec1 is " + rec1.calculateArea());
        System.out.println("The perimeter of rec1 is " + rec1.calculatePerimeter());
    }
}
