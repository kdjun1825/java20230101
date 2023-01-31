package ex5.work2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GameSave {

	public void scoreWriter(Rsp rsp	) {
		//경로/ rsp폴더를 만들어서  /유저.sav 파일 만들기
		
		String path = "C:\\Users\\Cheetah\\embedded_kdj/RspGAME/" + rsp.getId() + ".sav";
		
		File f = new File("C:\\Users\\Cheetah\\embedded_kdj/RspGAME/");
		
		if(!f.exists()) {
			f.mkdirs();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(rsp);
			System.out.println("저장완료");
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
			
		}finally {
			
			try {
				
				oos.close();
				fos.close();
				
			} catch (Exception e2) {
				
				// TODO: handle exception
				e2.printStackTrace();
			}
			
		}
		
		
		
	}
	
}
