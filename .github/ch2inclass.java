package ch2a2;
import javax.swing.JOptionPane;
public class ch2inclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number_tix_int;
		final int PRICE = 75;
		final int fee = 20;
		final double tax= .07;
		double taxAnt;
		double subtotal;
		double total;
		double ticket_total;
		String ticket_total_str;
		
		String number_tix_str = JOptionPane.shuwinput("Enter number of tickets: ");
		number_tix_int = Integer.parseInt(number_tix_str);
		ticket_total=number_tix_int* PRICE;
		subtotal = ticket_total*fee;
		taxAnt= subtotal*tax;
		ticket_total_str=String.format("%,2f", total);
		JOptionPane.showMessageDiolog(null, "total $" + ticket_total_str);
		

	}

}
