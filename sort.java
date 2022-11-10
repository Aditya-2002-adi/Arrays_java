public class sort {
    public static void main(String[] args) {
        int data[] = {10, 9, 12, 14, 15};
        int n = 5;
        int i, j, smallest;
        int temp;

        if (n < 2) return;  // nothing to sort!!

        for (i = 0; i < n - 1; i++) {
            // find smallest in unsorted part of array
            smallest = i;
            for (j = i + 1; j < n; j++)
                if (data[smallest] > data[j]) smallest = j;

            // put it at front of unsorted part of array (swap)
            temp = data[i];
            data[i] = data[smallest];
            data[smallest] = temp;
        }

        for (i = 0; i < 5; i++) {
            System.out.println(data[i]);
        }

        int o=1;
        System.out.println(o++);


int m=1;
        System.out.println(++m);

    }
}
