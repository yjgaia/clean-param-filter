package co.hanul.mr.dev.web;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 파라미터를 깔끔하게 만드는 필터
 */
public class CleanParamFilter implements Filter {

	private String charset;

	public void init(FilterConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
	}

	public void doFilter(
			ServletRequest request,
			ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		// 파라미터들을 받아서,
		Map<String, String[]> params = request.getParameterMap();
		Set<String> set = params.keySet();

		int i;
		for (String name : set) {
			if (params.get(name) instanceof String[]) {
				String[] paramsArray = (String[]) params.get(name);

				for (i = 0; i < paramsArray.length; i++) {
					// 공백을 모두 제거한다.
					paramsArray[i] = CleanParamUtil.cleanString(paramsArray[i]);
					// 인코딩 설정
					paramsArray[i] = new String(
						paramsArray[i].getBytes("ISO-8859-1"),
						charset);
				}
			}
		}
		System.out.println("테스트 입니다.");
		chain.doFilter(request, response);
	}

	public void destroy() {
	}

}
