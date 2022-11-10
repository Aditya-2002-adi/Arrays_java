import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;






 class Linkeds {
    String n;

    public Linkeds(String n) {
        this.n = n;
    }

}
public class Linked{
    public static void main(String[] args) {
        LinkedList<String> s=new LinkedList<String>();
        List<Linkeds> s2=new LinkedList<>();
        Linkeds l=new Linkeds("hii");
        Linkeds l1=new Linkeds("mehnaaz");

        s2.add(l);
        s2.add(l1);

        for(Linkeds m:s2){
            System.out.println(m);
        }


        s.add("hi");
        s.add("meh");
        s.add("233");
        s.add("12134");

        /*
         for(String m:s){
             System.out.println(m);
         }

*/
        Iterator<String>it=s.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        //by reversing the elemys using desending the iterator


        Iterator<String>itd=s.descendingIterator();
        while(itd.hasNext()){
            System.out.println(itd.next());

        }

        // by using objects


    }
}
