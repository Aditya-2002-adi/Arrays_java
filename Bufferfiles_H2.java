import java.io.*;

public class Bufferfiles_H2{
    public static void main(String args[]){
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum");
        try {
            System.out.println("Initially file is empty.");

            FileOutputStream f = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\fillll.txt");
            BufferedOutputStream b = new BufferedOutputStream(f);
            System.out.println("Now we are Writing Data into file. ");

            String s =
                   "payload 101010111100101000010100101010010101001001,IP:129.10.10.0, Headed data:101000000101001001010010101010100111";
            byte by[] = s.getBytes();
            b.write(by);
            b.flush();
            b.close();
            f.close();
            System.out.println(" Succesfully data has been written.!!!");
            System.out.println();
        }
        
        catch (IOException e) {
            System.out.println(e);
        }
        try{

        FileInputStream fi=new FileInputStream("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\fillll.txt");
            BufferedInputStream bin=new BufferedInputStream(fi);
            int i;
            System.out.println("Reading Data from file: ");
            while((i=bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fi.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}
