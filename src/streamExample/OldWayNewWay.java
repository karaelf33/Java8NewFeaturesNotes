package streamExample;

import java.util.*;

public class OldWayNewWay {
    public static void main(String[] args) {


        //Old way before java 8
        System.out.println("Old way before java 8");
        List<String> list = Arrays.asList("args","anna","mehmet","bbbb","cccc","dslffds","sdsfdsff");
        List<String> filtered=new ArrayList<>();
        for (String name:list){
            if (name.length()==4) filtered.add(name);
        }

        Collections.sort(filtered);
        filtered.forEach(System.out::println);

        Iterator<String> iter=filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());

        //new way after java 8
        System.out.println("new way after java 8");
        List<String> list2 = Arrays.asList("args","anna","mehmet","bbbb","cccc","dslffds","sdsfdsff");
        list2.stream().filter(n->n.length()==4).sorted().forEach(System.out::println);

    }
}
