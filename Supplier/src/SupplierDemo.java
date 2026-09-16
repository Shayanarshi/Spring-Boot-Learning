import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
Supplier in Java8:
        => It supplies the data.
        => It is not taking input but return values.
        => get() method belongs to Supplier
*/
public class SupplierDemo {
        public static void main(String[] args) {
//        Supplier<String> msg = ()->"Welcome to Java8";
//        System.out.println("Message is : "+msg.get());

//        List<Integer> nums = Arrays.asList(3,8,2,9,5,7,4,6);
//        Predicate<Integer> isEven = n-> n%2==0;
//        Consumer<Integer> c = n-> System.out.println(n*n);
//        nums.stream().filter(isEven).forEach(c);

//
//        TreeSet<Integer> set = new TreeSet<>();
//
//        set.add(50);
//        set.add(40);
//        set.add(30);
//        set.add(20);
//        set.add(10);
//
//        System.out.println("Set is : "+ set);


//            TreeMap<Integer,String> map = new TreeMap<Integer,String>();
//            map.put(50,"Fifty");
//            map.put(40,"Fourty");
//            map.put(30,"Thirty");
//            map.put(20,"Twenty");
//            map.put(10,"Ten");
//            System.out.println("Map is "+map);

            List<Integer> nums = Arrays.asList(7,3,9,4,6,2,5);
//            int res = nums.stream().min(Integer :: compare).get();
//            System.out.println("Min value " +res);

//
//             int sum = nums.stream().reduce(0,(a,b)->a+b);
//            System.out.println("Sum of Nums : "+sum);
//
//             int summ = nums.stream().mapToInt(n->n).sum();
//            System.out.println("Sum : "+ summ);


            double average = nums.stream().mapToInt(n->n).average().getAsDouble();
            System.out.println("Average : "+ average);




    }
}
