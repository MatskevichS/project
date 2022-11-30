package by.stormnet.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("fdf");
        lists.add("gfgdh");
        boolean isContain = lists.contains("dsfdsf");
        String second = lists.get(1);
        boolean empty = lists.isEmpty();
        lists.remove(1);

        for (String elem : lists) {
            System.out.println(elem);
        }

        int size = lists.size();
        String [] objects = (String[]) lists.toArray();

        List<Integer> list2 = new LinkedList<>();

        Deque<Deque> list3 = new LinkedList<>();


        Set<Float> sets = new HashSet<>();
        Float next = sets.iterator().next();
        Set<Boolean> sets2 = new LinkedHashSet<>();
        Set<Long> sets3 = new TreeSet<>();

        Queue<Short> queue = new PriorityQueue<>();
        Deque<Byte> deque = new ArrayDeque<>();
        Byte aByte = deque.removeLast();

        List<ArrayDeque<String>> lists5 = new ArrayList<>();


        Map<String, Integer> maps = new HashMap<>();
        maps.put("asd", 3);
        maps.put("asdre", 7);
        Set<String> strings = maps.keySet();
        Collection<Integer> values = maps.values();

        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry :  entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }

        Map<String, Map<String, List<Short>>> maps2 = new HashMap<>();

        Iterator<String> iterator = lists.iterator();

        if(iterator.hasNext()) {
            String next1 = iterator.next();
        }


    }
}
