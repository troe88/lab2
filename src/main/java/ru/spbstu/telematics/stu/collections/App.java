package ru.spbstu.telematics.stu.collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start" );
        Vector<String> my_vector = new Vector<String>();
        my_vector.add("0");
        my_vector.add("1");
        my_vector.add("2");
        my_vector.add("3");
        my_vector.add("4");
        my_vector.add("5");
        my_vector.add("6");
        my_vector.add("7");
        my_vector.add("8");
        my_vector.add("9");
        my_vector.add("10");
        my_vector.add("11");
        my_vector.add("12");
        my_vector.add("13");
        my_vector.add("14");
        my_vector.add("15");
        my_vector.add("16");
        my_vector.add("qwe", 5);
        System.out.println(my_vector.size());
        System.out.println( "End" );
    }
}
