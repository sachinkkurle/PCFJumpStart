package learnavinash.security;

import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		String encodedPassword = encoder.encode("password");
		System.out.println(encodedPassword);
	}
}
