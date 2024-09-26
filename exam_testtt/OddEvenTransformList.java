package exam_testtt;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenTransformList {

    public static void main(String[] args) {
        
            List<Integer> list = new ArrayList<>();
            list.add(7);
            list.add(5);
            list.add(2);
            list.add(6);
            
            System.out.println(transformList(list,3));
           
        }
    

    public static List<Integer> transformList(List<Integer> list, int transformations) {
    	List<Integer> al=new ArrayList<Integer>();
        
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j)%2==0)
                {
                	al.add(list.get(j)-3);
                }
                else {
                	//System.out.println();
                	al.add(list.get(j)+3);
                }
            }
        
		return al;
    }
}
