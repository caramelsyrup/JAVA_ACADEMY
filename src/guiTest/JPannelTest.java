package guiTest;
// awt와 swing을 섞어서 사용.
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// awt가 action event를 발생시킴.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// 프레임의 모양, 구조 등이 내장.

public class JPannelTest extends JFrame implements ActionListener {
	//JFrame : x 닫기 기능 있음 
	JTextField tf1;
	public JPannelTest() {
		
		super("예로리 테스트");					// 프레임 타이틀바 텍스트 지정.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(20);			// 텍스트를 입력하는 조그만 창 부분.
		JTextArea ta = new JTextArea(5,20); //tf1의 바로 밑에 생성 되는 텍스트 출력 부분. 행,열 만큼 텍스트가 넣어진다.
		TextArea tta= new TextArea(10,10); // ta 바로 밑에 텍스탁 넣어지는 부분. 스크롤이 생긴다.
		// 버튼이 프레임에서 가장 상단에 위치함.
		JButton b1 = new JButton("버튼1");	// b1 객체 선언,생성.
		JButton b2 = new JButton("버튼2");	// b2 객체 선언,생성. 버튼
		Container con = getContentPane();
		add(b1);						// 프레임에 b1을 추가
		add(b2);						// 프레임에 b2를 추가	버튼.
		add(tf1);						// JtextField를 추가.
		add(ta);						
		add(tta);
		
		b1.addActionListener(this);
		b2.addActionListener(this); //button과 actionperformed연결
		
		setSize(300,400);			// 프레임의 크기.
		setVisible(true);			// 프레임이 보이도록.
		setLayout(new FlowLayout());	
	}

	public void actionPerformed(ActionEvent e) {	//ActionListener구현하는데 actionPerformed메서드는 반드시 필요.
		// ActionEvent e 를 매개변수로 하여, 마우스 키보드 등의 이벤트를 받을 수 있도록 지정.
		String str = e.getActionCommand();	// getActionCommand는 e의 이벤트를 String으로 return한다. str에 저장.
		Container con = getContentPane();	// 
		if(str.equals("버튼1")) {
			System.out.println("버튼1 클릭");
			//JFrame : 직접적으로 색 못바꿈 ,,  -> container나 getContentPane 이용해서 색바꿈
			getContentPane().setBackground(Color.blue); 
			//con.setBackground(Color.blue); 
			System.out.println(tf1.getText());
		}else {
			System.out.println("버튼2 클릭");
			 //이케 두줄로 표현하거나 getContentPane()하거나 ,, 
			con.setBackground(Color.CYAN);
			tf1.setText(""); //set은 설정의 의미 -> 괄호안처럼 빈공간으로 만들어라.
			//get은 가져오는것 ,, 
		}
	}
	
	
	public static void main(String[] args) {
		new JPannelTest();

	}

}
