package guiTest;
// awt�� swing�� ��� ���.
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// awt�� action event�� �߻���Ŵ.
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
// �������� ���, ���� ���� ����.

public class JPannelTest extends JFrame implements ActionListener {
	//JFrame : x �ݱ� ��� ���� 
	JTextField tf1;
	public JPannelTest() {
		
		super("���θ� �׽�Ʈ");					// ������ Ÿ��Ʋ�� �ؽ�Ʈ ����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf1 = new JTextField(20);			// �ؽ�Ʈ�� �Է��ϴ� ���׸� â �κ�.
		JTextArea ta = new JTextArea(5,20); //tf1�� �ٷ� �ؿ� ���� �Ǵ� �ؽ�Ʈ ��� �κ�. ��,�� ��ŭ �ؽ�Ʈ�� �־�����.
		TextArea tta= new TextArea(10,10); // ta �ٷ� �ؿ� �ؽ�Ź �־����� �κ�. ��ũ���� �����.
		// ��ư�� �����ӿ��� ���� ��ܿ� ��ġ��.
		JButton b1 = new JButton("��ư1");	// b1 ��ü ����,����.
		JButton b2 = new JButton("��ư2");	// b2 ��ü ����,����. ��ư
		Container con = getContentPane();
		add(b1);						// �����ӿ� b1�� �߰�
		add(b2);						// �����ӿ� b2�� �߰�	��ư.
		add(tf1);						// JtextField�� �߰�.
		add(ta);						
		add(tta);
		
		b1.addActionListener(this);
		b2.addActionListener(this); //button�� actionperformed����
		
		setSize(300,400);			// �������� ũ��.
		setVisible(true);			// �������� ���̵���.
		setLayout(new FlowLayout());	
	}

	public void actionPerformed(ActionEvent e) {	//ActionListener�����ϴµ� actionPerformed�޼���� �ݵ�� �ʿ�.
		// ActionEvent e �� �Ű������� �Ͽ�, ���콺 Ű���� ���� �̺�Ʈ�� ���� �� �ֵ��� ����.
		String str = e.getActionCommand();	// getActionCommand�� e�� �̺�Ʈ�� String���� return�Ѵ�. str�� ����.
		Container con = getContentPane();	// 
		if(str.equals("��ư1")) {
			System.out.println("��ư1 Ŭ��");
			//JFrame : ���������� �� ���ٲ� ,,  -> container�� getContentPane �̿��ؼ� ���ٲ�
			getContentPane().setBackground(Color.blue); 
			//con.setBackground(Color.blue); 
			System.out.println(tf1.getText());
		}else {
			System.out.println("��ư2 Ŭ��");
			 //���� ���ٷ� ǥ���ϰų� getContentPane()�ϰų� ,, 
			con.setBackground(Color.CYAN);
			tf1.setText(""); //set�� ������ �ǹ� -> ��ȣ��ó�� ��������� ������.
			//get�� �������°� ,, 
		}
	}
	
	
	public static void main(String[] args) {
		new JPannelTest();

	}

}
