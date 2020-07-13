package guiTest;
// awt와  swing을 섞어서 사용.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// awt 해당 운영체제의 특징을 따라 화면 구성.
import javax.swing.JButton;	
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;	//
// 스윙이 참조되어 있는 것을 알 수 있다. 모든 운영체제에서 동일한 느낌의 프레임 사용.
public class JGugudan extends JFrame implements ActionListener {
	// JFrame 타이틀이 없는 생성자.
	JTextField tf;	// JTextField의 tf 변수 설정.
	JTextArea ta;	// JTextArea의 ta 변수 설정.
	public JGugudan() {
		super("구구단");	// 윈도우 창의 제목표시
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //꼭 두번째에 놔두기 
		// setDefaultCloseOperation 프레임의 닫기 버튼을 눌렸을떄 기본 동작을 설정.
		// setDefaultCloseOperation의 4가지 상수.
		// DISPOSE_ON_CLOSE 윈도우를 종료시 모든 자원을 반납
		// DO_NOTHING_ON_CLOSE 윈도우를 종료할때 아무일도 하지 않음.
		// EXIT_ON_CLOSE 윈도우 종료시 강제 종료.
		// HIDE_ON_CLOSE 윈도우 종료시 윈도우를 숨김.
		setLayout(new FlowLayout());	// FlowLayout을 사용.
		tf = new JTextField(10);		// tf 텍스트 필드 선언,생성. 구구단의 몇단을 입력하는 부분.
		JButton b1 = new JButton("구구단");	// 버튼의 이름 설정.
		ta = new JTextArea(25,20);			// ta 텍스트 에어리어 선언 생성. 15행 20열의 텍스트 에어리어를 생성. 
		tf.addActionListener(this); //tf칸에서 enter쳐도 답 나오게끔 ,,
		add(tf);	// 텍스트필드 넣기
		add(b1);	// 버튼 넣기.
		add(ta);	// 텍스트 에어리어 넣기.
		b1.addActionListener(this);	// tf칸에 text를 넣고, 버튼을 눌러도 동작이 되게 유도.
		setSize(300,400);	// 창의 크기 지정.
		setVisible(true);	// 보이도록 설정.
	}
	public void actionPerformed(ActionEvent e) {
		ta.setText(""); //초기화 텍스트에어리어에 초기부터는 아무것도 뜨지 않도록 .
		//예외처리, 숫자 이외에 입력은 출력 되지 않기에.
		try{
			for(int i=1; i<=9; i++) {
				int v = Integer.parseInt(tf.getText()); //형변환 ,,
				// tf에 입력되는 text를 Integer의 parseInt를 통해서 int로 형변환.
					ta.append(v+"*"+i+"="+v*i+"\n");
					// 생성되는 구구단 문장을 text로 ta에 추가.텍스트 에어리어에.
			}
		}catch(NumberFormatException n) { //n 변수 암거나 지정ㅎㅐ서,,
			//int아닌 string형 입력 시 숫자를 입력하세요
			ta.append("숫자를 입력하세요."); 
			// 해당 문장이 text로 ta에 추가.
		}
	}
	public static void main(String[] args) {
		new JGugudan();

	}

}
