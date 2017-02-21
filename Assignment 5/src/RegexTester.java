
public class RegexTester
{

	public static void main(String[] args)
	{

		String regexSSN = "^\\d{3,3}-?\\d{3,3}-?\\d{4,4}-?$";   //TODO add a regex for Social Security Numbers
		String regex9000 = "(9000|9001)\\d{5}";  //TODO add a regex for GGC 9000 numbers here
		String regexZipPlus4 = "^(\\d{5}|\\d{5}-\\d{4})$"; //TODO add a regex for zip+4 zipcodes here

		System.out.println("All of the following tests should return true, "
				+ "the negative tests are negated (meaning that they should "
				+ "also return true)");
		System.out.println("192-192-5555".matches(regexSSN)); // the following tests should all match
		System.out.println("444-183-1212".matches(regexSSN));
		System.out.println("032-431-9375".matches(regexSSN));
		System.out.println("122-650-4343".matches(regexSSN));
		System.out.println("900012389".matches(regex9000));
		System.out.println("900112389".matches(regex9000));
		System.out.println("900012390".matches(regex9000));
		System.out.println("900050000".matches(regex9000));
		System.out.println("30043".matches(regexZipPlus4));
		System.out.println("30043-1234".matches(regexZipPlus4));
		System.out.println();

		System.out.println(!"192-XYZ-5555".matches(regexSSN)); // the following tests should NOT match
		System.out.println(!"00-192-5555".matches(regexSSN));
		System.out.println(!"90005000".matches(regex9000));        // too short!
		System.out.println(!"900250000".matches(regex9000));       // must be 9000* or 9001*
		System.out.println(!"9002500001".matches(regex9000));      // to big
		System.out.println(!"9001FOO00".matches(regex9000));       // no alpha allowed
		System.out.println(!"30043-12345".matches(regexZipPlus4));  // too long
		System.out.println(!"300430-1234".matches(regexZipPlus4));  // too long
		System.out.println(!"30043-12".matches(regexZipPlus4));     // too short
		System.out.println(!"300FO-1234".matches(regexZipPlus4));   // no alpha allowed
		System.out.println(!"30043=1234".matches(regexZipPlus4));   // missing hyphen


	}

}
