package ex5.work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class GameLoad {

	Rsp rsp;
	
	public Rsp scoreLoad(String id) {
		
		String path = "C:\\Users\\Cheetah\\embedded_kdj/RspGAME/" + id + ".sav";
		File f = new File(path);
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		if(!f.exists()) {
			
			
			try {
				
				fis = new FileInputStream(path);
				ois = new ObjectInputStream(fis);
				rsp = (Rsp) ois.readObject();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
		return rsp;
		
	}
	
	
	
	
	
}
