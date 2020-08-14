import java.util.*;

public class Task
{
	public static void main(String[] args) {
		System.out.println("Hello RAGHAV");
		
		
		Random rnum = new Random();
		
		
        int n, temp;
        
        
        n = 10;
        int a[] = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
            a[i] = rnum.nextInt(500);
        }
        
        
        
        
        System.out.println("Order:");
         for (int i = 0; i < n ; i++) 
        {
            System.out.print(a[i] + ",");
        }
        
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        
        System.out.println("\nAscending Order:");
        
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n - 1]);
		  
     }
}
