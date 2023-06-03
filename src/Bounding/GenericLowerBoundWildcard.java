package Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundWildcard {
    public static void main(String[] args) {
        System.out.println("-----------wildcard ile alt sınır-------------");
        List<Integer> integerList=new ArrayList<>();
        addElements(integerList);
        System.out.println(integerList);

        List<Number> numberList=new ArrayList<>();
        addElements(numberList);
        System.out.println(numberList);

        List<Double> doubleList=new ArrayList<>();
        // addElements(doubleList);---> CTE :Integerın parentlarını kabul eder.

        System.out.println("-----------wildcard ile üst sınır-------------");
        multiplyByTwo(integerList);
        multiplyByTwo(doubleList);
        multiplyByTwo(numberList);

        System.out.println("--------------? vs Object------------");
        List<String> stringList=new ArrayList<>();
        printElements(integerList);//List<?>
        printElements(stringList);
        //-------------print object----------------
        List<Object> objectList=new ArrayList<>();
        printElementsObject(objectList);
        //printElementsObject(stringList);//-->List<Object> List<String> in parentı değildir.

    }

    //Integer data tipinin super classları(parentları) ile oluşturlan liste eleman ekleme
    //Integer,Number,Object
    //wildcard:?:bilinmeyen data tipi
    public static void addElements(List<? super Integer> list){ // Wildcard'ı LowerBound(alt sınır) belirlemek için super keyword'ü ile kullanırız.
        for(int i=1;i<=10;i++){
            list.add(i);
        }
    }

    //upperboundda wildcard kullanımı
    public static void multiplyByTwo(List<? extends Number> list){ // Wildcard'ı UpperBound(üst sınır) belirlemek için extends keyword'ü ile kullanırız.
        // list.add(1);-->listte değişikliğe izin vermez.

        list.stream().map(t->2*t.doubleValue()).forEach(System.out::println);
    }

    //wildcard kısıtlaması:wildcard okunabilirliği artırır ancak bazı kıstlamaları var
    public static void printElements(List<?> listOfUnknown){
        // listOfUnknown.add("Java"); --> "?" tür bilinmediği için izin vermiyor.
        // add metodu gibi işlemlere izin vermez.
        // okumaya izin verir. salt-okunur değil ama böyle düşünülebilir.
        // türden bağımsız işlemlere izin verir. size,clear,remove...
        // listOfUnknown.size();

        // listOfUnknown.add(null);//-->null :data tipi yok
        for (Object object:listOfUnknown){
            System.out.println(object);
        }
    }

    //List<?>  vs  List<Object>
    public static void printElementsObject(List<Object> listOfUnknown){
        listOfUnknown.add("Java");
        for (Object object:listOfUnknown){
            System.out.println(object);
        }

    }

    // Önemli: T ile ? tamamen aynı manada değildir.

}
