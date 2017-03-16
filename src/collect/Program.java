package collect;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress ia = InetAddress.getLocalHost();
		
		System.out.println(ia);
	}

}
                                  