public class hash {
    public static void main(String[] args) {


        int[] aliner = arrayL();
        int[] aquadratic = arrayQ();

        System.out.println("Linear probing: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(aliner[i] + " ");
        }
        System.out.println("Quadratic probing: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(aquadratic[i] + " ");
        }
    }


        public static int[] arrayL() {
            int[] arr = {1, 20, 22, 34, 31, 41, 18, 19};
            int hash = 10;
            int hasha[] = new int[hash];


            for (int i = 0; i < hash; i++) {
                hasha[i] = -1;
            }
            int key = 0;
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                key = arr[j] % hash;
                if (hasha[key] == -1) {
                    hasha[key] = arr[j];
                }
                else {
                    index = (arr[j] + j) % hash;
                    hasha[index] = arr[j];


                }
            }
            return hasha;
        }
    public static int[] arrayQ() {
        int arr[] = { 50, 700, 76, 85,
                92, 73, 101,12 };
        int hash = 10;
        int hasha[] = new int[hash];


        for (int i = 0; i < hash; i++) {
            hasha[i] = -1;
        }
        int key = 0;
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            key = arr[j] % hash;
            if (hasha[key] == -1) {
                hasha[key] = arr[j];
            } else {
                index = (arr[j] + (j*j)) % hash;
                hasha[index] = arr[j]; }
        }
        return hasha;
    }

    }




