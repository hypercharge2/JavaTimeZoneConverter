//This program will be used to convert between all of the USA time zones. 
//This program was made by Hunter Barney and posted on GitHub at( insert github profile)


package timeConvert;



import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	
	public static <JDatePanelImpl> void main(String[] args) {
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy hh:mma z");
		df.setTimeZone(TimeZone.getDefault());
		
		JFrame window = new JFrame("Time Zone Convert");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setVisible(true);
		
		ImageIcon icon = new ImageIcon("src/res/icon.jpg");
		window.setIconImage(icon.getImage());
		
		
		JPanel mainpnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		window.add(mainpnl);
		
		BoxLayout layout = new BoxLayout(mainpnl, BoxLayout.Y_AXIS);
		mainpnl.setLayout(layout);
		JLabel dateformat = new JLabel("Format is MM-DD-YYYY HH:MM(A/PM) Time zone");
		JLabel dateinpl = new JLabel("Enter date and time");
		
		JFormattedTextField dateinp = new JFormattedTextField(df.format(date));
		mainpnl.add(dateformat);
		mainpnl.add(dateinpl);
		mainpnl.add(dateinp);
		
		JLabel tzl = new JLabel("Convert Timezone");
		mainpnl.add(tzl);
		
		JTextField timezonei = new JTextField();
		timezonei.setColumns(5);
		mainpnl.add(timezonei);
		
		JLabel outputl = new JLabel("Output:");
		mainpnl.add(outputl);
		
		JLabel output = new JLabel("");
		mainpnl.add(output);
		
		JButton verify = new JButton();
		verify.setText("Submit");
		verify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valid = DateValidate.test(dateinp.getText());
				if(valid == true) {
					String preconvert, postconvert;
					preconvert = dateinp.getText();
					postconvert = DateConvert.convert(preconvert, timezonei.getText());
					output.setText(postconvert);
					window.pack();
				}
			}
		});
		mainpnl.add(verify);
		
		window.pack();
		
		
	}

}
