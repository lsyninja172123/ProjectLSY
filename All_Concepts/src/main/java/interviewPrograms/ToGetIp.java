package interviewPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ToGetIp {
	public static void main(String[] args) throws UnknownHostException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the URL");
		InetAddress ip;
		try {
			String url = scanner.nextLine();
			ip = InetAddress.getByName(url);
			System.out.println(ip);
		} catch (UnknownHostException e) {
			System.out.println("Invalid Address");
		}
		
	}
}
