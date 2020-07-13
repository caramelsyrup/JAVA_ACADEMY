package guiTest;
// awt��  swing�� ��� ���.
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// awt �ش� �ü���� Ư¡�� ���� ȭ�� ����.
import javax.swing.JButton;	
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;	//
// ������ �����Ǿ� �ִ� ���� �� �� �ִ�. ��� �ü������ ������ ������ ������ ���.
public class JGugudan extends JFrame implements ActionListener {
	// JFrame Ÿ��Ʋ�� ���� ������.
	JTextField tf;	// JTextField�� tf ���� ����.
	JTextArea ta;	// JTextArea�� ta ���� ����.
	public JGugudan() {
		super("������");	// ������ â�� ����ǥ��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //�� �ι�°�� ���α� 
		// setDefaultCloseOperation �������� �ݱ� ��ư�� �������� �⺻ ������ ����.
		// setDefaultCloseOperation�� 4���� ���.
		// DISPOSE_ON_CLOSE �����츦 ����� ��� �ڿ��� �ݳ�
		// DO_NOTHING_ON_CLOSE �����츦 �����Ҷ� �ƹ��ϵ� ���� ����.
		// EXIT_ON_CLOSE ������ ����� ���� ����.
		// HIDE_ON_CLOSE ������ ����� �����츦 ����.
		setLayout(new FlowLayout());	// FlowLayout�� ���.
		tf = new JTextField(10);		// tf �ؽ�Ʈ �ʵ� ����,����. �������� ����� �Է��ϴ� �κ�.
		JButton b1 = new JButton("������");	// ��ư�� �̸� ����.
		ta = new JTextArea(25,20);			// ta �ؽ�Ʈ ����� ���� ����. 15�� 20���� �ؽ�Ʈ ���� ����. 
		tf.addActionListener(this); //tfĭ���� enter�ĵ� �� �����Բ� ,,
		add(tf);	// �ؽ�Ʈ�ʵ� �ֱ�
		add(b1);	// ��ư �ֱ�.
		add(ta);	// �ؽ�Ʈ ����� �ֱ�.
		b1.addActionListener(this);	// tfĭ�� text�� �ְ�, ��ư�� ������ ������ �ǰ� ����.
		setSize(300,400);	// â�� ũ�� ����.
		setVisible(true);	// ���̵��� ����.
	}
	public void actionPerformed(ActionEvent e) {
		ta.setText(""); //�ʱ�ȭ �ؽ�Ʈ���� �ʱ���ʹ� �ƹ��͵� ���� �ʵ��� .
		//����ó��, ���� �̿ܿ� �Է��� ��� ���� �ʱ⿡.
		try{
			for(int i=1; i<=9; i++) {
				int v = Integer.parseInt(tf.getText()); //����ȯ ,,
				// tf�� �ԷµǴ� text�� Integer�� parseInt�� ���ؼ� int�� ����ȯ.
					ta.append(v+"*"+i+"="+v*i+"\n");
					// �����Ǵ� ������ ������ text�� ta�� �߰�.�ؽ�Ʈ ����.
			}
		}catch(NumberFormatException n) { //n ���� �ϰų� ����������,,
			//int�ƴ� string�� �Է� �� ���ڸ� �Է��ϼ���
			ta.append("���ڸ� �Է��ϼ���."); 
			// �ش� ������ text�� ta�� �߰�.
		}
	}
	public static void main(String[] args) {
		new JGugudan();

	}

}
