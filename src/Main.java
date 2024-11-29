import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> points = new ArrayList<>();
        points.add(87);
        points.add(95);
        points.add(56);
        points.add(78);

        CustomMutableClass customMutableClass = new CustomMutableClass(10);
        ImmutableClass ic1 = new ImmutableClass("Ivan", points, customMutableClass);

        System.out.println(ic1);
        System.out.println(customMutableClass.getValue());
        System.out.println();

        customMutableClass.setValue(11);
        System.out.println(ic1);
        System.out.println(customMutableClass.getValue());
        System.out.println();

        points.remove(0);
        System.out.println(ic1);
        System.out.println(points);
        System.out.println();

        Map<ImmutableClass, Integer> map1 = new HashMap<>();
        map1.put(ic1, 1);
        System.out.println(map1.containsKey(ic1));
        System.out.println();

        points.clear();
        customMutableClass.setValue(1111);
        System.out.println(map1.containsKey(ic1));
    }
}