package com.yesjun.ch11;

import java.util.HashSet;

class HashItem {
    private int id;
    private String name;

    public HashItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        HashItem temp = (HashItem)obj;
        return id == temp.id;
    }
    @Override
    public int hashCode() {
        return id % 3;
    }
    @Override
    public String toString() {
        return "HashItem [id=" + id
                + ", name=" + name
                + ", hashCode=" + (id % 3) + "]";
    }
}

public class HashTest {
    public static void main(String[] args) {
        HashSet<HashItem> hSet = new HashSet<HashItem>();

        for(int i=1; i<=1000; i++) {
            hSet.add(new HashItem(i*100, "name"));
        }
        for(HashItem item : hSet) {
            System.out.println(item); // toString()
        }
    }
}
