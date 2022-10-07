import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGamePayne extends JFrame {
	private JTextField textField;
	public GuessingGamePayne() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Игра Угадай число");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Александр , Угадай число!");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 38);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Введите число от 1 до 100");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(22, 36, 198, 38);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(242, 36, 97, 38);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ответить");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(153, 135, 107, 38);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Здесь будет ответ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 184, 390, 38);
		getContentPane().add(lblNewLabel_2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
