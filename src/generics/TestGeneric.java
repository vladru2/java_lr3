package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestGeneric {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2345", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);

        String[] test = new String[]{"str1, str2, str3"};
        List<String> test2 = new ArrayList<>();
        test2 = fromArrayToList(test);

        test2.forEach(System.out::println);
    }

    public static  <T> List<T> fromArrayToList(T[] a) {
        return Arrays.stream(a).collect(Collectors.toList());
    }
}
