package NestedClasses;
interface i1{
    int add(int a,int b);
}
//class a1 implements i1{
//    @Override
//    public int add(int a, int b) {
//        return a+b;
//    }
//}
public class Ananonymous2 {
    public static void main(String[] args) {
//        a1 obj=new a1();      //normal class
//        System.out.println(obj.add(3,4));

//            i1 obj=new i1(){   //anonymous class
//                public int add(int a, int b) {
//                  return a+b;
//               }
//           };
//          System.out.println(obj.add(5,8));

        i1 obj1=(a,b)->(a+b);   //lambda
        System.out.println(obj1.add(7,3));
    }
}
