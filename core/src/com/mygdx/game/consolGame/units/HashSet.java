package com.mygdx.game.consoleGame.units;

import com.mygdx.game.consoleGame.util.*;

public class HashSet {
    public static void main(String[] args) {
        MySet work = new MySet();
        System.out.println(work.add(1));
        System.out.println(work.add(2));
        System.out.println(work.get(1));
        System.out.println(work.isEmpty());
        System.out.println(work.toString());

        Iterator<Integer>iterator= work.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);

        }

    }
}
class MySet {
    private HashMap<Integer, Object> myDB = new HashMap<>();
    private static final Object work = new Object();
    public boolean add(int elem){
        return myDB.put(elem, work)==null;
    }
    public boolean del(int elem) {
        return myDB.remove(elem)==work;
    }

    public boolean isEmpty () {
        return myDB.isEmpty();
    }

    public String toString() {
        return myDB.keySet().toString();
    }

    public boolean contains (int elem) {
        return myDB.containsKey(elem);
    }

    public int get (int index) {
        Object[] a=myDB.keySet().toArray();
        return (int) a[index];
    }

    public Iterator<Integer> iterator(){
        return myDB.keySet().iterator();
    }

}
