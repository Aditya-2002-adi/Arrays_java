import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter_H3
{
    public static void main(String[] args)
    {
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum ");
        System.out.println();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,131,4,15,16,17,18,19,20,21,22,23,24,25);
        System.out.println("Without using filter method: Intial list items are... ");
        System.out.println(list);
        Predicate<Integer> condition = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer n) {
                if (n % 5 == 0) {
                    return true;
                }
                return false;
            }
        };
        System.out.println();
        System.out.println("List of integers that are divisble by 5 are After using filter method --");
        list.stream().filter(condition).forEach(System.out::println);
    }
}