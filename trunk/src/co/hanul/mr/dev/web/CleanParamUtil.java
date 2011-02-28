package co.hanul.mr.dev.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CleanParamUtil {
	private CleanParamUtil() {
	}

	private static final Pattern blankPattern = Pattern.compile("[ ][ ]+");

	/**
	 * 문자열을 깔끔하게 함 (불필요한 공백 제거)
	 * 
	 * @param string
	 * @return resultName
	 */
	public static final String cleanString(String string) {

		// 앞 뒤의 공백 제거
		string = string.trim();

		// 중복 공백 축소 (정규 표현식으로 처리)
		Matcher blankMatcher = blankPattern.matcher(string);

		StringBuffer sb = new StringBuffer();
		while (blankMatcher.find()) {
			blankMatcher.appendReplacement(sb, " ");
		}
		blankMatcher.appendTail(sb);

		return sb.toString();
	}

}
