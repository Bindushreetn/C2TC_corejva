package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInter {

	public static void main(String[] args) {
		List<Integer> item=Arrays.asList(1,2,3,4,5,6);
		/*Consumer<Integer> c=new Consumer<Integer>()
				{
			       public void accept(Integer i) {
				}
			       {
			    	   char[] i;
					System.out.println(i);
			       }
				};*/
         Consumer<Integer> c1=n ->System.out.println(n);
         item.forEach(c1);
	}

}
