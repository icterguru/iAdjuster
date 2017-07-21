package passwordHashingTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash_Admin {
	
	// public class PasswordHash_Admin extends TestCase{  does not require @Test annotation

	@Test
	public void testMD5Hash_Admin() {
		
		String password = "Admin";
		Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
		 String hashedPassword = passwordEncoder.encodePassword(password, null);
		
		System.out.println("Md5 Hashed Admin: " + hashedPassword);
		
		assertEquals(hashedPassword, "e3afed0047b08059d0fada10f400c1e5");
	}

	// public class testBCryptHash_Admin extends TestCase{  does not require @Test annotation

		@Test
		public void testBCryptHash_Admin() {
			
			String password = "Admin";
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			 String hashedPassword = passwordEncoder.encode(password);
			
			System.out.println("BCrypt Hashed Admin: " + hashedPassword);
			
		//	assertEquals(hashedPassword, "$2a$10$E6eYWF7Ycpia/ZfdeFaT5OZXQhZO5qWbcW.f0xXcSTCOQiBZiIkAe");
		}

		
}
