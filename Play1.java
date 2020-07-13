package com.company;
import java.io.*;

public class Play1 {

    public static void main(String[] args) {
	// write your code here
        Point point1 = new Point();
        File file = new File("motionfile.txt");
        BufferedInputStream bis = null;
        FileInputStream fis= null;

        try {
            //FileInputStream to read the file
            fis = new FileInputStream(file);
            /*Passed the FileInputStream to BufferedInputStream For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);
            /*available() method of BufferedInputStream returns 0 when there are no more bytes
             * present in the file to be read*/
            while (bis.available() > 0) {
                switch ((char) bis.read()) {
                    default:
                        System.out.println("Incorrect Input");
                        point1.display();
                        break;
                    case 'R':
                        point1.toRight();
                        System.out.println(point1.toString());
                        point1.display();
                        break;
                    case 'L':
                        point1.toLeft();
                        System.out.println(point1.toString());
                        point1.display();
                        break;
                    case 'B':
                        point1.toBottom();
                        System.out.println(point1.toString());
                        point1.display();
                        break;
                    case 'T':
                        point1.toTop();
                        System.out.println(point1.toString());
                        point1.display();
                        break;
                }
            }

        }

        catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try {
                if (bis != null && fis != null) {
                    fis.close();
                    bis.close();
                }
            } catch (IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
