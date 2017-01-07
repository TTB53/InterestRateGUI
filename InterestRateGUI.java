import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class InterestRateGUI {

	private JFrame frame;
	private JTextField creditLimit;
	private JTextField percentRate;
	private JLabel lblOutput;
	private JButton btnCalculate;
	private JTextField monthlyIncome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterestRateGUI window = new InterestRateGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterestRateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 322, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextField creditLimit = new JTextField();
		creditLimit.setBounds(212, 65, 105, 28);
		frame.getContentPane().add(creditLimit);
		creditLimit.setColumns(10);
		
		JLabel lblCreditLimit = new JLabel("Credit Limit");
		lblCreditLimit.setBounds(8, 71, 114, 16);
		frame.getContentPane().add(lblCreditLimit);
		
		JLabel lblAPR = new JLabel("Annual Percentage Rate");
		lblAPR.setBounds(8, 117, 192, 16);
		frame.getContentPane().add(lblAPR);
		
		JTextField percentRate = new JTextField();
		percentRate.setBounds(212, 111, 105, 28);
		frame.getContentPane().add(percentRate);
		percentRate.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float intRateperMonth=0;
				float intRateperDay = 0;
				float percentage = 0;
				
				
				float mIncome = Float.parseFloat(monthlyIncome.getText());
				float cLimit = Float.parseFloat(creditLimit.getText());
				float pRate = Float.parseFloat(percentRate.getText());
				
				pRate = pRate/100;
				
				intRateperMonth = (pRate/12);
				Double.toString(intRateperMonth);
				
				intRateperDay = (pRate/365);
				Double.toString(intRateperDay);
				
				percentage = (intRateperMonth/mIncome);
				
				lblOutput.setText("<html><p>" + "Your estimated interest per month is " + intRateperMonth +"<br><br>" + "Your estimated interest per day is " 
				+ intRateperDay + "<br><br>" + "\n\n Your interest rate is "+ percentage + " of your monthly income.</p></html>");
				
			}
		});
		btnCalculate.setBounds(8, 199, 149, 37);
		frame.getContentPane().add(btnCalculate);
		
		lblOutput = new JLabel("Output");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(6, 276, 309, 191);
		frame.getContentPane().add(lblOutput);
		
		JLabel lblNewLabel = new JLabel("Montly Income");
		lblNewLabel.setBounds(8, 25, 109, 16);
		frame.getContentPane().add(lblNewLabel);
		
		monthlyIncome = new JTextField();
		monthlyIncome.setBounds(212, 25, 105, 28);
		frame.getContentPane().add(monthlyIncome);
		monthlyIncome.setColumns(10);
	}
}
