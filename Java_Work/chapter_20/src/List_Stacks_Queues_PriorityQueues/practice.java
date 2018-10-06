/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List_Stacks_Queues_PriorityQueues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author User
 */
public class practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Seattle");
        list.add("Portland");
        list.add("Los Angeles");
        list.add("Atlana");
        list.add("Dhaka");
        list.add("Comilla");
        System.out.println(list);
        
        List<String> sublist = new ArrayList<>();
        sublist = list.subList(0,4);
        System.out.println(sublist);
    }
}
