package de.uni_bremen.pi2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Iterator;

public class ArrayTest{

    private static void printArray(Array A){
        Iterator it=A.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
public static void main(String[]args){
    Array<Integer> test1=new Array<>(0);
    System.out.println(test1.capacity());
    System.out.println(test1.size());

    Array<String> test2 =new Array<>(10);
    System.out.println(test2.capacity());
    System.out.println(test2.size());

    test1.set(2,2);
    test1.set(5,10);
    test1.set(10,15);
    System.out.println(test1.capacity());
    System.out.println(test1.size());

    test2.set(3,"abc");
    test2.set(5,"jdg");
    test2.set(7,"dhe");
    test2.set(21,"irh");
    test2.set(57,"jlg");
    System.out.println(test2.capacity());
    System.out.println(test2.size());



}
}