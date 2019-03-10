/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocerymenu;

/**
 * List of stuff to get at the grocery store
 *
 * @author jjsurfgirl
 */
public class List {

    private final int DEFAULT_SIZE = 5;
    private String[] items;
    private int count;
    private final int GROW_SIZE = 100; // amount to increes

    public List() {
        items = new String[DEFAULT_SIZE];
        this.count = 0;
    }

    public List(int size) {
        // Check if it is full
//        if (count == items.length) {
//            growArray();
//        }
        items = new String[size];
        this.count = 0;
    }

    public int getCount() {
        return this.count;
    }

    public void addItem(String newby) {
        if (count == items.length) {
            growArray();
        }
        items[count++] = newby;
        //count++;
    }

    public void growArray() { // change
        String[] newList = new String[this.count + GROW_SIZE];
        for (int i = 0; i < count; i++) {
            newList[i] = items[i];
        }
        items = newList; // Point items to new list
    }

    public void replaceItem(int index, String newby) {
        if (index > 0 && index <= items.length) {
            items[index - 1] = newby;
        }
        //items[index -1] = newby;
    }

    public void removeItem(int index) {
        for (int i = index - 1; i < count - 1; i++) {
            items[i] = items[i + 1];
        }

    }

    public void insertItem(int index, String newby) {
        // grow List if neeeded
        // move everything from Index down
        //put newby at Index - 1;
        //count++
    }

    public void printList() {
        System.out.println("");
        System.out.println("My grocery List");
        for (int i = 0; i < count; i++) {
            System.out.println(i + 1 + ": " + items[i]);

        }
        System.out.println("");
    }
}
