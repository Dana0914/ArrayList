package arraylistpractice;

public class Main {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(0, "item1");
        myList.add(1, "item2");
        myList.add(2, "item3");
        myList.add(3, "item4");
        myList.add(4, "item5");
        myList.add(5, "item6");
        myList.add(6, "item7");
        myList.add(7, "item8");
        myList.add(8, "item9");
        myList.add(9, "item10");
        myList.add(10, "item11");
        myList.remove(10);
        myList.remove(0);
        myList.add("item11");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println(myList);
    }
}
