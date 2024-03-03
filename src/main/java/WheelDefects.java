


import java.util.ArrayList;
import java.util.HashSet;

public class WheelDefects {

    public static void main(String[] args)
    {

        ArrayList<String> ArrList = new ArrayList<String>();

        ArrList.add("g");
        ArrList.add("h");
        ArrList.add("h");
        ArrList.add("r");
        ArrList.add("k");
        ArrList.add("k");
        ArrList.add("b");

       System.out.println("Original ArrayList is : "
                + ArrList);
        HashSet<String> hset = new HashSet<String>(ArrList);

        System.out.println("ArrayList  Values are : "
                + hset);
    }
}
