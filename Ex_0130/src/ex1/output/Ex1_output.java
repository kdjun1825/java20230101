package ex1.output;

import java.io.PrintStream;

public class Ex1_output {

	public static void main(String[] args) {

		PrintStream ps = System.out;
		ps.write('a');
		
		byte[] b_write = {'b', 'c', 'd'};
		
		try {
			
			ps.write(b_write);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
