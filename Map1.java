import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("name1", "anagh");
        map.put("in", "India");
        map.putIfAbsent("namex", "anagh");
        // map.put("in", "India"); duplicate
        // key not allowed values can be same

        map.remove("name1");
        System.out.println(map.containsKey("in"));
        System.out.println(map.containsKey("pn"));
        System.out.println(map);
    }
}
