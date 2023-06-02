package Generics.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Eğer class'ımız Generic Class ise aynı class'ı farklı data tipleri ile kullanabiliriz.
public class RunnerGeneric {
    public static void main(String[] args) {

        //Generics ile hangi data tipini kullanacağımıza karar verebiliriz.
        //Java 7 ile birlikte aşağıdaki gibi eşitliğin her iki tarafında da data tipini yazmaya gerek kalmadı.
        GenericClass<String> object1 = new GenericClass<>();

//        GenericClass<String> object2 = new GenericClass<>();
//        object2.setType(65);// CTE verdi, String bir değer vermemiz gerekirken, int bir değer verdik.

        GenericClass<Integer> object3 = new GenericClass<>();
        object3.setType(65);
        int n = object3.getType();// CASTING'e gerek kalmadı.

        List<String> list = new ArrayList<>();//List yapısı zaten Generic tipte bir yapıdır.
        list.add("Mürsel");
        list.add("Ebubekir");
//        list.add(100);// String tipinde olduğunu belirttik.
//        list.get(2);
//        list.get(3);//ClassCastException'dan kurtulmuş olduk.

//  NonGenericClass<String> obj=new NonGenericClass();

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Java");
        //  map.put(2,99);//CTE verir.

        //====================ÇOKLU DATA TİPİ İLE GENERIC CLASS======================================

        GenericClassTwoParam<String,Integer> mymap=new GenericClassTwoParam<>();
        mymap.setS("Generic");
        mymap.setU(99);

        System.out.println(mymap.getS()+"  "+mymap.getU());


    }






}