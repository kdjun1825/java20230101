package ex4.base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;


public class Base_Main {

	public static void main(String[] args) {

		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();
		String text = "암호화 작업 start";
		
		byte[] encodeByte = encoder.encode(text.getBytes());
		System.out.println("암호화 된 내용:" + new String (encodeByte));
		
		
		//복호화
		byte[] decodeByte = decoder.decode(encodeByte);
		System.out.println("복호화 된 내용:" + new String (decodeByte));
		
	}

}
