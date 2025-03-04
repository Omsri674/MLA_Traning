package JAVA_MLA.src.com.mla_tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Streamm2 {

    public static void MaxOrd(List<Order> ord){
        Optional<Order> o = ord.stream().filter(f->f.getYear() == 2020).max(Comparator.comparing(Order::getQty));
        Order or = o.get();
        System.out.println(or.getQty());
    }

    public static void SortedOrd(List<Order> ord){
        Map<String, Long> res = ord.stream().collect(Collectors.groupingBy(Order::getCategy,Collectors.counting()));
        res.forEach((k,v)-> System.out.println(k+" "+v));
    }

    public static void MaxPrice(List<Order> ord){
        Optional<Order> Oo = ord.stream().max(Comparator.comparing(Order::getPrice));
        Order or = Oo.get();
        System.out.println(or.getName()+" "+or.getPrice());
    }

     public static void AvgSpending(List<Order> ord){
        DoubleSummaryStatistics oStat = ord.stream().collect(Collectors.summarizingDouble(Order::getCost));

         System.out.println("Average Spending on the site: "+oStat.getAverage());
     }

     public static void MinPrice(List<Order> ord){
        Optional<Order> Oo = ord.stream().min(Comparator.comparing(Order::getPrice));
        Order or = Oo.get();
        System.out.println("Minimum Price: "+or.getName()+" "+or.getPrice());
     }

     public static void FirstOrder(List<Order> ord){
        Optional<Order> ordO = ord.stream().min(Comparator.comparing(Order::getYear).thenComparing(Order::getMonth));
        Order o = ordO.get();
         System.out.println(o.getName());
     }

    public static void main(String[] args) {

        List<Order> ordl = new ArrayList<>();
        ordl.add(new Order(101,"Laptop",55000,03,2010,"erode","electronic",1));
        ordl.add(new Order(102,"SmartPhone",18000,12,2014,"salem","electronic",4));
        ordl.add(new Order(103,"Shoe",2000,01,2020,"chennai","accessories",6));
        ordl.add(new Order(104,"Pillow",500,05,2020,"coimbatore","accessories",10));
        ordl.add(new Order(105,"Watch",2500,02,2013,"erode","accessories",4));
        ordl.add(new Order(106,"Noddles",50,01,2019,"salem","food",2));
        ordl.add(new Order(107,"Gaming Mouse",1200,03,2024,"erode","electronic",1));
        ordl.add(new Order(108,"Braclet",100,10,2000,"namakkal","accessories",3));
        ordl.add(new Order(109,"Notebook",65,02,2018,"trichy","sationary",8));
        ordl.add(new Order(110,"Crayons",35,11,2000,"erode","sationary",1));

      System.out.println(ordl);
        System.out.println("MAX orders in year 2020");
        Streamm2.MaxOrd(ordl);

        System.out.println();
        System.out.println("Orders count in category wise");
        Streamm2.SortedOrd(ordl);

        System.out.println();
        System.out.println("Maximum Price of the orders");
        Streamm2.MaxPrice(ordl);

        System.out.println(     );
        Streamm2.AvgSpending(ordl);

        System.out.println();
        Streamm2.MinPrice(ordl);

        System.out.println();
        Streamm2.FirstOrder(ordl);
    }
}
