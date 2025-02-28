package JAVA_MLA.src.com.mla;

import java.util.*;

interface Inf{

    void ShowData();
}
class Impl implements Inf{

    String name;
    String email;
    String city;
    String username;

    public Impl(String n, String e, String c, String un){
        this.name = n;
        this.email = e;
        this.city = c;
        this.username = un;
    }

    @Override
    public String toString() {
        return "Impl{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", username='" + username + '\'' +
                '}';
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
        int[] arr = {56, 23, 45, 67, 78, 98, 76, 54, 32, 21, 10};
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");


        }
        System.out.println();

        Impl obj = new Impl("Eswar","eswar@gmail.com","erode","eswar123");
        obj.ShowData();

    }

}