import java.util.ArrayList;
 
public class Stars {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Citrus");
        list.add("Durian");
        list.add("Earth");
        list.add("Fruits");
        list.add("Grapes");
        System.out.println(list); //Before stars
        addStars(list); //Stars added
        removeStars(list); //Stars removed 
    }
 
    public static void addStars(ArrayList<String> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.add(i, "*");
        }
        System.out.println(list);
    }
 
    public static void removeStars(ArrayList<String> list) {
        for (int i = list.size() - 2; i >= 0; i -= 2) {
            list.remove(i);
        }
        System.out.println(list);
    }
}
