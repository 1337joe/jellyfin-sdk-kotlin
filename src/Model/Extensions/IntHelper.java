package MediaBrowser.Model.Extensions;

public final class IntHelper
{
	/** 
	 Tries the parse culture invariant.
	 
	 @param s The s.
	 @param result The result.
	 @return <c>true</c> if XXXX, <c>false</c> otherwise.
	*/
	public static boolean TryParseCultureInvariant(String s, tangible.RefObject<Integer> result)
	{
		return Integer.TryParse(s, NumberStyles.Any, CultureInfo.InvariantCulture, result);
	}
}