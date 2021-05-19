package restaurant;


import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;
    public Menu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
     public Menu() {
        this.menu = new ArrayList<>();
     }

     //Setters
    public void setMenu(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }

    //Getters
    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    //adding menu items
    public void addMenuItem(MenuItem aMenuItem) {
        this.menu.add(aMenuItem);
    }
}
