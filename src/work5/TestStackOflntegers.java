package work5;

public class TestStackOflntegers {

	public static void main(String[] args) {
		StackOflntegers stack=new StackOflntegers(); 
		for (int i = 0; i < 10; i++) 
			stack.push(i); 
		while (!stack.emptyO) 
			System.out.print(stack.pop() + "");
	}

}
