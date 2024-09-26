package Com.arrays.logicalsection;

import java.util.Scanner;

public class FirstDay2 
{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter how many element you want to store: ");
    int size = sc.nextInt();
    int [] arr = new int [size];
    char ch;
    int index = 0;
    
    do {
    	System.out.print("Enter the element you want to store: ");
    	arr[index++] = sc.nextInt();
    	System.out.println("Enter the choice if you want to more element: ");
    	System.out.print("Press [y/Y] or [n/N]: ");
    	ch = sc.next().charAt(0);
    }while(ch == 'y'|| ch == 'Y');
    
    for(int i=0; i<size; i++)
    {
    	System.out.print(arr[i]+", ");
    }
    
	}
}
