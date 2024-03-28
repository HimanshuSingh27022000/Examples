package p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A{
		public static void main(String[]args) {
			List<Integer>data= Arrays.asList(12,34,55);
			List<Integer>newDta=data.stream().map(e->e*2).collect(Collectors.toList());
			System.out.println(newDta);
		}
		}


