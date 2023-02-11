import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

public class pointFrame {

	public static void main(String[] args) {

		Frame mf = new Frame("MENU");
		mf.setSize(1920, 1080);
		mf.setLayout(null);
		mf.setBackground(Color.DARK_GRAY);
		mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mf.setUndecorated(true);
		
		
		//버튼 생성
		//자동배치가 꺼져있는 Frame에 들어가게 될 자식 컴포넌트들은 
		//반드시 위치와 크기값이 설정되어 있어야 한다.
		Button btnOk = new Button("포인트");
		btnOk.setBounds(300, 300, 500, 500);
		Button btnClose = new Button("바로결제 payment");
		btnClose.setBounds(1100, 300, 500, 500);
	
		//만들어둔 버튼들에 대해서 이벤트 감지자 추가
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("포인트 조회");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				mf.dispose();//프레임종료
				System.out.println("결제화면으로 넘어감");
			}
		});
		
		
		//생성된 버튼을 d에 추가
		mf.add(btnOk);
		mf.add(btnClose);
		
		mf.setVisible(true);
		
		
		mf.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

	}

}
