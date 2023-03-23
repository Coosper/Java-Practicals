
/**
 * Many Rectangles
 *
 * @author Kacper Marszelewski
 * @version 01/02/2023
 */
public class ManyRectangles
{
    public static void main(String[] args) 
    {
        Rectangle rec1 = new Rectangle(10,20);
        Rectangle rec2 = new Rectangle(30,50);
        Rectangle rec3 = new Rectangle(60,90);
        Rectangle rec4 = new Rectangle(90,120);
        
        System.out.println("The length of rec1 is " + rec1.getLength() );
        System.out.println("The height of rec1 is " + rec1.getHeight() );
        System.out.println();
        System.out.println("The length of rec2 is " + rec2.getLength() );
        System.out.println("The height of rec2 is " + rec2.getHeight() );
        System.out.println();
        System.out.println("The length of rec3 is " + rec3.getLength() );
        System.out.println("The height of rec3 is " + rec3.getHeight() );
        System.out.println();
        System.out.println("The length of rec4 is " + rec4.getLength() );
        System.out.println("The height of rec4 is " + rec4.getHeight() );
        System.out.println();
        
        //Rectangle 1
        rec1.setLength(12);
        rec1.setHeight(22);
        //Rectangle2
        rec2.setLength(32);
        rec2.setHeight(52);
        //Rectangle3
        rec3.setLength(62);
        rec3.setHeight(92);
        //Rectangle4
        rec4.setLength(92);
        rec4.setHeight(122);
        
        System.out.println("The new length of rec1 is " + rec1.getLength() );
        System.out.println("The new height of rec1 is " + rec1.getHeight() );
        System.out.println();
        System.out.println("The new length of rec2 is " + rec2.getLength() );
        System.out.println("The new height of rec2 is " + rec2.getHeight() );
        System.out.println();
        System.out.println("The new length of rec3 is " + rec3.getLength() );
        System.out.println("The new height of rec3 is " + rec3.getHeight() );
        System.out.println();
        System.out.println("The new length of rec4 is " + rec4.getLength() );
        System.out.println("The new height of rec4 is " + rec4.getHeight() );
        System.out.println();
        
        System.out.println("The area of rec1 is " + rec1.calculateArea());
        System.out.println("The perimeter of rec1 is " + rec1.calculatePerimeter());
        System.out.println("The area of rec2 is " + rec2.calculateArea());
        System.out.println("The perimeter of rec2 is " + rec2.calculatePerimeter());
        System.out.println("The area of rec3 is " + rec3.calculateArea());
        System.out.println("The perimeter of rec3 is " + rec3.calculatePerimeter());
        System.out.println("The area of rec4 is " + rec4.calculateArea());
        System.out.println("The perimeter of rec4 is " + rec4.calculatePerimeter());
        
        
    }
}
