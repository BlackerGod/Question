package Day37;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        System.out.println(s);
        s.remove();
        System.out.println(s);
        s.removeLast();
        System.out.println(s);


    }
}
