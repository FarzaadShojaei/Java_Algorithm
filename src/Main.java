import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

     //   HashMap<String,Integer> map1=new HashMap<>();
     //   HashMap<String,Integer> map2=new HashMap<>();
     //   map1.put("value",11);
     //   map2=map1;


     //   map1.put("value",22);
     //   System.out.println(map1);
    //    System.out.println(map2);
     //   Cookie cookieOne=new Cookie("green");
     //   Cookie cookieTwo=new Cookie("Blue");

      //  cookieOne.setColor("Yellow");

     //   System.out.println(cookieOne.getColor());
     //   System.out.println(cookieTwo.getColor());


       LinkedList mylinkedlist=new LinkedList(2);
        mylinkedlist.append(1);
        mylinkedlist.append(2);
        mylinkedlist.append(3);


        mylinkedlist.prepend(1);
        System.out.println(mylinkedlist.removeLast().value);
        System.out.println(mylinkedlist.removeFirst().value);
        System.out.println(mylinkedlist.get(2) + "\n");
        mylinkedlist.printList();



    }
}