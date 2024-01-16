//The date is 16/01/24

import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse
{
	public static void main(String[] args)
	{
		LocalDateTime time1, time2;
		int seconds1, seconds2, difference;
		
		time1 = LocalDateTime.now();
		seconds1 = time1.getSecond();
		
		JOptionPane.showMessageDialog(null, "Is stealing ever justified?");
		
		time2 = LocalDateTime.now();
		seconds2 = time2.getSecond();
		
		difference = seconds2 - seconds1;
		JOptionPane.showMessageDialog(null, "End Seconds: " + seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + difference + "Seconds for you to answer");
	}
}