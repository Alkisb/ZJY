import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class day1 {
    public static void main(String[] args) {
         int a = 1+1;
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("asuydfyuasdfuasyfdas");
        System.out.println("secend");
        System.out.println("hello world");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        String s1 = list.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(s1);
        String[] split = s1.split(",");
        List<String> list1 = Arrays.asList(split);
        System.out.println(list1);
        System.out.println("dev-zjy");
        List<Integer> collect = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println(collect);
    }
}
