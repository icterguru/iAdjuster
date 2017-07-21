package passwordHashingTests;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash_M0kter {
	
	// public class PasswordHash_M0kter extends TestCase{  does not require @Test annotation

	@Test
	public void testMD5Hash_M0kter() {
		
		String password = "M0kter";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(password, null);
		System.out.println("Md5 Hashed M0kter: " + hashedPassword);
		
		assertEquals(hashedPassword, "8fa7674754731810502e97527a4809c8");
	}


			@Test
			public void testBCryptHash_Mokter() {
				
				String password = "M0kter";
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				 String hashedPassword = passwordEncoder.encode(password);
				
				System.out.println("BCrypt Hashed M0kter: " + hashedPassword);
				
			//	assertEquals(hashedPassword, "$2a$10$sc5nFLALIwiaWAXkSngC..nxlKJb51fWc9abIfKEeZemrdtBIo87S");
			}
}
