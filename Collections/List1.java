package Collections;

import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l.add(5);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.add(5,50);
        System.out.println(l);
        System.out.println(l.get(3));
        l.set(0,0);
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        l.remove(Integer.valueOf(50));
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(30));
        l.clear();
        l.add(5);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        System.out.println(l.indexOf(10));
        System.out.println(l.lastIndexOf(30));
        System.out.println(l.equals(l2));
        l2.add(50);
        System.out.println(l.addAll(l2));
        l.addAll(0,l2);
        System.out.println(l);
        l.removeAll(l2);
        System.out.println(l);
        l.add(50);
        l.retainAll(l2);
        System.out.println(l);
        l.removeIf(n->n>25);
        System.out.println(l);
        l.add(30);
        l.add(40);
        l.add(20);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        Collections.shuffle(l);
        System.out.println(l);
        l.sort(null);
        // (or)
        l.sort(Comparator.naturalOrder());
        System.out.println(l);






    }
}
