import java.util.ArrayList;
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
        List<Integer> collect = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println(collect);
    }
}
