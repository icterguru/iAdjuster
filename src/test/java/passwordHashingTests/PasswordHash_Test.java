package passwordHashingTests;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash_Test {
	
	// public class PasswordHash extends TestCase{  does not require @Test annotation

	@Test
	public void testMD5Hash_Test() {
		
		String password = "Test";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		String hashedPassword = passwordEncoder.encodePassword(password, null);
		System.out.println("Md5 Hashed Test: " + hashedPassword);
		
		assertEquals(hashedPassword, "0cbc6611f5540bd0809a388dc95a615b");
	}

	@Test
	public void testBCryptHash_Test() {
		
		String password = "Test";
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		 String hashedPassword = passwordEncoder.encode(password);
		
		System.out.println("BCrypt Hashed Test: " + hashedPassword);
		
	//	assertEquals(hashedPassword, "$2a$10$sc5nFLALIwiaWAXkSngC..nxlKJb51fWc9abIfKEeZemrdtBIo87S");
	}
	
}
