import java.io.*;

public class Files {
    public static void main(String[] args) {

        //delete a file means f.delete
        // read data from file  using scanner
        try {
            FileWriter f = new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\fillll.txt");

            f.write("Hi  im tabuuuu");
            f.close();

        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();

        }

        //with output stream  we can write in files in bytes..
        try {
            FileOutputStream fo = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\fillll.txt");
            fo.write(65); //byte stream
            /* if we take string then we can nconvert into byte array and then we cna use it to wirte*/
            String ta = "     my name is tabbu";
            byte b[] = ta.getBytes();
            fo.write(b);
            fo.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


        ///----------------Input stream
        try {
            FileInputStream FI = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\fillll.txt");

            int i = 0;
            while ((i = FI.read()) != -1) {
                char c = (char) i; //converting int to char
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
        //----Buffer output stream writes data more effiectively
        try {
            FileOutputStream o = new FileOutputStream("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\fillll.txt");
            BufferedOutputStream bout = new BufferedOutputStream(o);
            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            o.close();
            System.out.println("success");


        } catch (IOException e) {
            e.printStackTrace();
        }

       /* //=-----input stream same as input but useing buffer inp as it

        //Using sequnce input stream read data from multiple streams

        try{
            FileOutputStream f2 = new FileOutputStream("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\fillll.txt");
            FileOutputStream f1 = new FileOutputStream("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\fill.txt");
            FileInputStream f=new FileInputStream("C:\\\\Users\\\\DELL\\\\OneDrive\\\\Desktop\\\\fll.txt");

            /*SequenceInputStream ss=new SequenceInputStream(f2,f1);
            int i=0;
            while((i=ss.read())!=-1) {

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        //char streams
        try {
            Writer w = new FileWriter("output.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //file writer or char oriented..
        try{
            FileWriter fw=new FileWriter("D:\\testout.txt");
            fw.write("Welcome to javaTpoint."); //with put converting into bytes
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Success...");

*/


}}







