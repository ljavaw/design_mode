package com.example.demo.iterator_pattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-12 23:01
 * @modified by:
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
