
    /**
     *
     */

import java.text.DecimalFormat;
import java.util.*;

    /**
     * @author John Nyagaka & Ayebilla Avoka
     *
     */
    public class circumArea {
        public static void main(String[]args) {
            //Creates a DecimalFormat using the given pattern and the symbols for the default locale
            DecimalFormat twoDP = new DecimalFormat(".##");
            System.out.println("Enter the radius of a circle in meter: ");
            Scanner inputStr = new Scanner(System.in);

            //int radius = Integer.parseInt( inputStr);  // converts a String into an int value
            //int radius = (int)( inputStr);
            int radius = inputStr.nextInt();
            //circumference = 2*PI*radius

            double circumference = 2 * Math.PI * radius;
            //area = radius^2 *PI
            double area = radius * radius *Math.PI;
            System.out.println("The circumference is: "+twoDP.format(circumference) );
            System.out.println("The area is: "+twoDP.format(area) );

        }
    }

