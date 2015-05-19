// Filename: Acronym.java
// Program : introducing more powerful enumeration capabilities
// Version : 6.6

package lesson2.methods_code_examples;

public enum Acronym
{
	TTYL("Talk to you later", "2007"),
	ROFL("Rolling on the floor laughing", "2006"),
	LOL("Laugh out loud", "2006"),
	ILY("I love you", "1999"),
	BRB("Be right back", "2000"),
	SMH("Shaking my head", "2008"),
	IMMD("It made my day", "2005"),
	FYI("For your information", "1990"),
	TTFN("Ta Ta for now", "2001"),
	K("OK", "1995");

	private final String meaning;
	private final String appearanceYear;

	Acronym(String inMeaning, String inYear)
	{
		meaning = inMeaning;
		appearanceYear = inYear;
	}

	public String getMeaning()
	{
		return meaning;
	}

	public String getAppearanceYear()
	{
		return appearanceYear;
	}
}

/****************************************************************
 * (C) Copyright by Moran Alkobi, http://moranalkobi.com        *
 ****************************************************************
 * Disclaimer: The author of the sourcecodes and presentations  *
 * has done his best to provide you with good explanations      *
 * and examples to allow you an educational and beneficial      *
 * walk through over the materials of the class.                *
 * With that said, the author makes no warranty of any kind,    *
 * expressed or implied, with regard to these programs or to    *
 * the documentation contained in his lectures and sourcecodes. *
 * The author shall not be held responsible in any way in event *
 * of any incidental or consequential damages arising out of    *
 * the use of these materials.                                  *
 ****************************************************************/