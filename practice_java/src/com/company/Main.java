package com.company;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list = new ArrayList<>();
        list.add(new String("this is correct type"));

        hackList(list);
        for (Object e:list) {
            out.println("object type" + e.getClass());
        }
    }
    public static void hackList(List list){
        list.add(new Integer(4));
    }
}
