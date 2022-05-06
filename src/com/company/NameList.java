package com.company;

import java.util.ArrayList;

public class NameList {
    private ArrayList<String> names = new ArrayList<>();
    public void addName(String name) {
        names.add(name);
    }

    public ArrayList<String> getNames() {
        return names;
    }
}
