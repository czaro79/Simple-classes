import models.Desk;
import models.Drawer;
import models.Item;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Dzban");
        Drawer drawer = new Drawer();
        drawer.add(item);
        Desk desk = new Desk();
        desk.addDrawer(drawer);
        System.out.println(desk);
    }
}