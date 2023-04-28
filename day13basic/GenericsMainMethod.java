package day13basic;

class GenericClass<T extends Comparable<T>>{
    T x;
    T y;
    T z;

    public GenericClass(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    <T> void testMaximum(){
        GenericsMainMethod.maximumValue(x,y,z);
    }
}

public class GenericsMainMethod {
    //Generic method for Integer,Float,String data type to find maximum of 3 values.
    public static <T extends Comparable<T>>void maximumValue(T data1, T data2, T data3){
        T maximum = data1;

        if(data2.compareTo(maximum) > 0)
            maximum = data2;
        if (data3.compareTo(maximum) > 0) {
            maximum = data3;
        }
        System.out.println(maximum + " is largest");
    }

    public static void main(String[] args) {
        System.out.println("Generics Example");

        //int,float,string variables
        int intA = 30, intB = 20, intC = 10;
        float floatA = 10.1f, floatB = 10.8f, floatC = 20.1f;
        String value1 = "Apple", value2 = "Peach", value3 =  "Banana";

        System.out.println();
        System.out.println("Generic method started....");
        maximumValue(intA,intB,intC);
        maximumValue(floatA,floatB,floatC);
        maximumValue(value1,value2,value3);
        System.out.println("....Generic method ended....");
        System.out.println();

        System.out.println();
        System.out.println("class level generic started.....");
        GenericClass<Integer> integerObject = new GenericClass<>(intA,intB,intC);
        integerObject.testMaximum();

        GenericClass<Float> floatObject = new GenericClass<>(floatA,floatB,floatC);
        floatObject.testMaximum();

        GenericClass<String> strinObject = new GenericClass<>(value1,value2,value3);
        strinObject.testMaximum();
        System.out.println(".....class level generic ended");
        System.out.println();
    }
}
