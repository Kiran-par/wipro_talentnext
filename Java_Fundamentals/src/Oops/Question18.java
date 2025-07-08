package Oops;
import java.util.*;

public class Question18 {
    public static void main(String[] args) {
        String[] names = new String[5]; // All elements are null by default

        Optional<String> firstName = Optional.ofNullable(names[0]);

        if (firstName.isPresent()) {
            System.out.println(firstName.get().length());
        } else {
            System.out.println("Element is null");
        }
    }
}
