package models;

import java.util.ArrayList;

public class Desk {
    ArrayList<Drawer> drawers;

    public Desk() {
        this.drawers = new ArrayList<Drawer>();
    }

    public Drawer getDrawer(int index) {
        return this.drawers.get(index);
    }

    public void addDrawer(Drawer drawer) {
        if (drawer == null) {
            throw new IllegalArgumentException("Cannot add null to desk.");
        }
        this.drawers.add(drawer);
    }

    public String toString() {
        String temp = "The desk contains:\n";
        
        int count = 1;
        for (Drawer drawer : drawers) {
            temp += "<" + count + "> " + drawer + "\n";
            count++;
        }
        return temp;
    }

}
