package ex3.object.input;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import ex3.object.output.Person;

public class ObjectInputMain {

	public static void main(String[] args) {

		
		Person p = null;
		String path = "C:\\Users\\Cheetah\\embedded_kdj/person.kdj";
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(path);
			ois = new ObjectInputStream(fis);
			
			p = (Person)ois.readObject();
			
			System.out.println(p.getName());
			System.out.println(p.getAge());
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}

}
