package Test;

import java.util.HashSet;

public class FindDuplicateelementUsingHashSet {

	public static void main(String[] args){
		
		//int[] a={2,1,3,2,4,2,3,4,5,5};
		int[] a={10,3,4,9,2,5,3,10,4,9,1,5,7};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int no:hs)
		{
			System.out.print(no+" ");
		}
		
	}
}
