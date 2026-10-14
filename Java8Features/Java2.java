package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

//class Stream1 implements Predicate<Integer>{
//
//    @Override
//    public boolean test(Integer i) {
//        return i%2==0;
//    }
//}

public class Java2 {
    public static void main(String[] args) {
//          List<Integer> li= Arrays.asList(1,2,3,4,5,6);
//        Stream<Integer> s=li.stream();
//        s.forEach(System.out::println);
//        s.forEach(System.out::println);  //stream shouldnot be use again
//        Stream<Integer> s2=s;       //we cannot reassign the stream once it is used
//        s2.forEach(System.out::println);


                //METHOD1-filter


//        Predicate<Integer> p=new Stream1(); //normal method
//        Stream<Integer> s=li.stream().filter(p);
//        s.forEach(System.out::println);

//        Predicate<Integer> p=new Predicate<Integer>(){ //anonymous method
//            public boolean test(Integer i) {
//                return i%2==0;
//            }
//        };
//        Stream<Integer> s=li.stream().filter(p);
//        s.forEach(System.out::println);

//        Predicate<Integer> p=i->i%2==0;    //using lambda
//        Stream<Integer> s=li.stream().filter(p);
//        s.forEach(System.out::println);

//           Stream<Integer> s=li.stream().filter(i->i%2==0);
//           s.forEach(System.out::println);




    }
}
