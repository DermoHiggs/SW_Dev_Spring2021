package sw_dev.exceptionhandling.customexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedExceptionExample1Fixed2 {
    public static void main(String args[])  {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("B:/myfile.txt");

            int k;

            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }

        }
        catch(FileNotFoundException fnfe){
            System.out.println("The specified file is not " +
                    "present at the given path");
        }
        catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }
        finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
