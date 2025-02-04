package Introduction;

import java.util.ArrayList;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		System.out.println(num);
		
		String name = "Surbhi";
		System.out.println(name);
		
		double decimalValue = 9.99;
		System.out.println(decimalValue);
		
		//array
		
		int[] arr = {1,2,3,4,5,6};
				System.out.println(arr[0]);
		String[] name1 = {"Surbhi","Dhanush","Manushi"};
		System.out.println(name1.length);
		
		//for loop
		
		int[] loop = {1,2,3,4,5,6};
		for(int i = 0; i< loop.length; i++) {
			System.out.println(loop[i]);
			
		}
		
		int[] value = {10,20,30,40,50};
		for (int j = 0; j< value.length; j++) {
			System.out.println(value[j]);
		}
		
		// create object of the class , object.methods
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Dhanush");
		a.add("Mario");
		a.add("Peach");
		a.add("Bowser");
		a.add("Gumbas");
		System.out.println(a.get(3));
		System.out.println(a);
	}

}
