import java.util.*;


public class CollectionMain {
    public static void main(String[] args) {

        List<String> composers = new ArrayList<>(List.of("Mozart", "Chopin", "Bach"));
        for (String name : composers) {
            System.out.println(name);
        }
        for (int i = composers.size() - 1; i >= 0; i--) {
            System.out.println(composers.get(i));
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(101);
        nums.add(105);
        nums.add(200);
        nums.add(101);

        System.out.println(nums);

        Map<Integer, String> personnel = new HashMap<>();
        personnel.put(123, "Antje");
        personnel.put(123456, "Aziz");
        personnel.put(999, "Jantje");
        personnel.put(1023, "Jantje");
        personnel.put(1023, "Jan");

        System.out.println(personnel);

        System.out.println(personnel.getOrDefault(1023, "unknown"));


    }
}
