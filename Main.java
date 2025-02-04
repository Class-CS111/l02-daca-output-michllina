// PARTNER NAME: Michelle Mendoza
// PARTNER NAME: N/A
// CS111 SECTION #: CS 111 3033
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNumber, countryOB, termsandcond, birthMonth, validMonth, validDay, validYr, expireDay, expireMonth, expireYr;
		char sex;
		int uscinum1, uscinum2, uscinum3, birthDay, birthYr; 
// putting all the String variables together

		surname = "SPECIMEN";
		givenName = "TEST V";
		category = "C09";
		cardNumber ="SRC0000000725";
		countryOB = "Ethiopia";
		termsandcond = "None";
		birthMonth = "JAN";
		validMonth = "01";
		validDay = "01";
		validYr = "80";
		expireDay = "05";
		expireMonth = "10";
		expireYr = "11";

	// now the int variables together
		uscinum1 = 000;
		uscinum2 = 000;
		uscinum3 = 725;
		birthDay = 01;
		birthYr = 1920;

	// then the one character lol
	sex = 'M';

		//INPUT SECTION
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                      " + surname + "");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+ uscinum1 + "-" + uscinum2 + "-" + uscinum3 + "	       " + category + "        " + cardNumber + " ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + countryOB + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsandcond + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+ birthDay + " " + birthMonth + " " + birthYr + "      " + sex + "");
		System.out.println("║                       Valid From:     " + validDay + "/" + validMonth + "/" + validYr + "");
		System.out.println("║                       Card Expires:   " + expireDay + "/"+ expireMonth + "/" + expireYr +"");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}

// why is there an x: before the ID card