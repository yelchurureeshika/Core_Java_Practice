package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
class ForEachMethod implements Consumer<Integer> {
    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}
public class Java1 {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(1,2,3,4,5);
//        Consumer c=new ForEachMethod();
//        c.accept(1);
//        Consumer<Integer> obj=i->System.out.println(i);
//        li.forEach(obj);
        li.forEach(i->System.out.println(i));






//        for(int i=0;i<li.size();i++){   //normal for loop
//            System.out.println(li.get(i));
//        }
//        //(or)
//        for(int k:li){        //enhanced for loop
//            System.out.println(k);
//        }
//        //(or)
//        li.forEach(l->System.out.println(l));  //foreach method it is inbuilt method
    }
}
