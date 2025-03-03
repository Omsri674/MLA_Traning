package com.mla;

import java.util.*;

interface Inf{

    void ShowData();
}
class Imp1 implements Inf{

    String name;
    String email;
    String city;
    String username;

    public Imp1(String n, String e, String c, String un){
        this.name = n;
        this.email = e;
        this.city = c;
        this.username = un;
    }

   

    @Override
    public void ShowData() {
        System.out.println("Impl{" +
                "name='" + this.name + '\'' +
                ", email='" + this.email + '\'' +
                ", city='" + this.city + '\'' +
                ", username='" + this.username + '\'' +
                '}');
    }
}

public class Abstr
{
    public static void  main(String[] sri)
    {
    	
    	int[] weer = new int[45];
        int[] arr = {56, 23, 45, 67, 78, 98, 76, 54, 32, 21, 10};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");


        }
        System.out.println();
        System.out.println(weer[weer.length]);

        Imp1 obj = new Imp1("Eswar","eswar@gmail.com","erode","eswar123");
        obj.ShowData();

    }

}