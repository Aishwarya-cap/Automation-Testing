package Capgemini.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
	
	public static void main(String[] args) {
		
		App app=new App();
		String regex="^(.+)@(.+)$";
		String email=app.userEmail("abc@gmail.com");
		Pattern pattern=Pattern.compile(regex);
		
		Matcher match=pattern.matcher(email);
		System.out.println("Is it Match::"+match.matches());
		System.out.println(email);
		int pwd=app.userPassword(23535);
		System.out.println(pwd);
		app.login();
		
	}
	
    private static void matcher(String email) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}