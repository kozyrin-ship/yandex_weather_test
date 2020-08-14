package org.talend;
import shippeo.get_weather_0_1.Get_Weather;
import javax.swing.JOptionPane; 
public class TalendWeather {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String city, email;
		city = JOptionPane.showInputDialog("Where do you live? ");
		email = JOptionPane.showInputDialog("What is your email address? ");
		Get_Weather talendJob=new Get_Weather();
		talendJob.runJob(new String[]{"--context_param city="+city,"--context_param email_recipient="+email });
	}
}
