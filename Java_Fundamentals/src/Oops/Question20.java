package Oops;
import java.util.*;

public class Question20 {
    String name;

    public static void main(String[] args) {
        Question20 q = new Question20(); // 'name' is null by default

        Optional<String> n = Optional.ofNullable(q.name);

        System.out.println(
            n.orElseThrow(() -> new NullPointerException("Invalid employee: name is null"))
        );
    }
}
