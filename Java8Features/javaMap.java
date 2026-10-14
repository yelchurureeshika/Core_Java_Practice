package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

//class demo implements Function<Integer,Integer>{
//    @Override
//    public Integer apply(Integer i) {
//        return i*2;
//    }
//}

public class javaMap {
    public static void main(String[] args) {
        //Method2: map
          List<Integer> li= Arrays.asList(1,2,3,4,5,6);
//        demo f = new demo();
//        Stream<Integer> s=li.stream().filter(i->i%2==0).map(f);
//        s.forEach(System.out::println);


//        Function<Integer,Integer> obj=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer i) {
//                return i*2;
//            }
//        };
//        Stream<Integer> s=li.stream().filter(i->i%2==0).map(obj);
//        s.forEach(System.out::println);

        Function<Integer,Integer> obj=i->i*2;
        Stream<Integer> s=li.stream().filter(i->i%2==0).map(obj);
        s.forEach(System.out::println);

//        Stream<Integer> s=li.stream().filter(i->i%2==0).map(i->i*2);
//        s.forEach(System.out::println);
    }
}
