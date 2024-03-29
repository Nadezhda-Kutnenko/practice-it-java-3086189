package _01_04;

import java.util.ArrayList;

public class MenuBuilder {
  public static void main(String[] args) {
    String menuTitle = "My Dream Menu:";
    System.out.println(menuTitle);
    ArrayList<MenuItem> menu = new ArrayList<>();
    MenuItem starter = new MenuItem("green salad");
    menu.add(starter);
    MenuItem mainCourse = new MenuItem("tom yam");
    menu.add(mainCourse);
    MenuItem dessert = new MenuItem("cheesecake");
    menu.add(dessert);
    System.out.println(menu);
  }
}
