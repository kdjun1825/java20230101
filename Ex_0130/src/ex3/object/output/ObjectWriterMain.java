package ex3.object.output;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriterMain {

	public static void main(String[] args) {

		Person p  = new Person();
		p.setName("김동준");
		p.setAge(23);
		
		
		String path = "C:\\Users\\Cheetah\\embedded_kdj/person.kdj";
		
		
		//객체를 통째로 출력하는데 사용하는 outputstream
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
