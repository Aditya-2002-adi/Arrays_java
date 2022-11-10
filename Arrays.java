import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] A = {15, 67, 13, 12, 14};
        int n = 5;
        int a = -1;
        int x = 16;

        for (int i = 0; i < A.length; i++) {
            if(x>A[i] && a<A[i]){
               a=A[i];
            }
        }
        System.out.println(a);
    }}
