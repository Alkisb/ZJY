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
        System.out.println("dev-zjy2");
        System.out.println("dev-xxx");
//        List<Integer> collect = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
        List<Integer> collect1 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Integer i = collect1.get(0);
        List<Integer> collect = collect1.stream().map(x -> x + 2).collect(Collectors.toList());
        System.out.println(collect);
    }
}
