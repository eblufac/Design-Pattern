package com.behavioral.iterator.Entity;

import com.behavioral.iterator.Interface.Container;
import com.behavioral.iterator.Interface.Iterator;

/**
 * @author lgy
 * @version 1
 * @description
 * @date 2019/12/5 12:00
 */
public class NameRepository implements Container {

    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index ++];
            }
            return null;
        }
    }
}
