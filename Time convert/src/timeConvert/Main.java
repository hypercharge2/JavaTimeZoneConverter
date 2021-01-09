//This program will be used to convert between all of the USA time zones. 
//This program was made by Hunter Barney and posted on GitHub at( insert github profile)


package timeConvert;


import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.FlowLayout;
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
		
		JPanel mainpnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		window.add(mainpnl);
		
		JLabel dateinpl = new JLabel("Enter date and time");
		
		JFormattedTextField dateinp = new JFormattedTextField(df.format(date));
		mainpnl.add(dateinpl);
		mainpnl.add(dateinp);
		
		window.pack();
		
		
	}

}
