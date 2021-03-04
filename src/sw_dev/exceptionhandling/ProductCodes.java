package sw_dev.exceptionhandling;

import java.util.Scanner;

/**
 * Demonstrates the use of a try-catch block.
 */

/*
A product code includes:
- a character in the tenth position that represents the zone from which that product was made
- a four-digit integer in positions 4 through 7 that represents the district in which it will be sold.

Due to some reorganization, products from zone R are banned from being
sold in districts with a designation of 2000 or higher.

Example Codes:
123456789ABCD   <- code position #. I used hex to represent 10,11,12,13
_____________
TRD1704A7R-12   <- Valid code and not banned
TRV2475A5R-14   <- Valid code but banned (District 'R' but district code of 2475
TRL2k74A5R-11   <- District is not an integer (NumberFormatException)
TRQ2949A6M-04   <- Valid code
TRV2105A2       <- Improper Length (StringIndexOutOfBoundsException)
 */
public class ProductCodes
{
   //-----------------------------------------------------------------
   //  Counts the number of product codes that are entered with a
   //  zone of R and and district greater than 2000.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String code;
      char zone;
      int district, valid = 0, banned = 0;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter product code (XXX to quit): ");
      code = scan.nextLine();

      while (!code.equalsIgnoreCase("XXX"))
      {
         //try
         {
            zone = code.charAt(9);
            district = Integer.parseInt(code.substring(3, 7));
            valid++;
            if (zone == 'R' && district > 2000)
               banned++;
         }
         
         //catch (StringIndexOutOfBoundsException exception)
         {
            System.out.println("Improper code length: " + code);//  + " " + exception.toString());
         }
         //catch (NumberFormatException exception)
         {
            System.out.println("District is not numeric: " + code );
         }


         System.out.print("Enter product code (XXX to quit): ");
         code = scan.nextLine();
      }

      System.out.println("# of valid codes entered: " + valid);
      System.out.println("# of banned codes entered: " + banned);
   }
}
