package com.example.demo.IteratorPattern;

/**
 * @author: ljavaw
 * @description:
 * @create: 2019-06-12 22:59
 * @modified by:
 **/
public class NameRepository implements Container{

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
