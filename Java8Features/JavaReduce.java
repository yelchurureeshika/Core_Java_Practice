package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
//class demo1 implements BinaryOperator<Integer>{
//
//    @Override
//    public Integer apply(Integer i, Integer j) {
//        return i+j;
//    }
//}
public class JavaReduce {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5,6);
//        BinaryOperator<Integer> b=new demo1();
//        int r= li.stream().filter(i->i%2==0).map(i->i*2).reduce(0,b);
//        System.out.println(r);

//        BinaryOperator<Integer> b=new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer i, Integer j) {
//                return i+j;
//            }
//        };
//        int r= li.stream().filter(i->i%2==0).map(i->i*2).reduce(0,b);
//        System.out.println(r);

        int r= li.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j);
        System.out.println(r);


    }
}

