import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        l.add("mm");

        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //Vector
        Vector<String> V = new Vector<String>();

        //Stack we need to use pop and push operations
        Stack<Integer> S = new Stack<Integer>();
        S.push(1);

        S.pop();
        S.push(2);
        S.pop();
        Iterator<Integer> imm = S.iterator();
        while (imm.hasNext()) {
            System.out.println(imm.next());
        }
        //V


        ArrayList<String> a = new ArrayList<String>();

        a.add("tavu");
        a.add("mehnaaz");
        Iterator<String> im = a.iterator();
        while (im.hasNext()) {
            System.out.println(im.next());

        }

        //Queue


        Queue<String> Q = new PriorityQueue<String>();
        Q.add("my");
        Q.remove("my");

        //use same itratror function here also

        //Dequeue
        // We can add elements form both sides that is D
        //it implements..Array Dequee
        /*for(String str:d)
        {
            System.out.println(d);
        }*/


//set we can implment set by hashset,treeset,linkedHashset cant have duplicate elements
        //sorted-set have treeset

    }
}


