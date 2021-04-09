package sandboxmain;

import java.util.ArrayList;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 fi = n -> {
			return n *n;
			
		};
		System.out.println(fi.sqr(5));
	}

}
