import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	
    	Scanner in = new Scanner(System.in);
    	int num = in.nextInt();
    	
    	int position = 1;
    	List<Integer> list = new ArrayList<Integer>();
    	while(num > 0) {
    		
    		if(num%2 == 1) {
    			list.add(position);
    		}
    		num /= 2;
    		position++;
    	}
    	
    	System.out.println(list.size());
    	for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
    }
}