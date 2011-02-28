
CleanParamFilter
================

파라미터를 깔끔하게 만드는 필터

(1) 불필요한 공백 제거 기능
  앞뒤 공백 제거
  다중 공백 제거

(2) Get 방식으로 전송된 파라미터의 인코딩 설정 (charset param)

※ 설정 방법 (web.xml)

  <filter>
    <display-name>CleanParamFilter</display-name>
    <filter-name>param-clean</filter-name>
    <filter-class>co.hanul.mr.dev.web.CleanParamFilter</filter-class>
    <init-param>
      <param-name>charset</param-name>
      <param-value>UTF-8</param-value>
    </init-param>
  </filter>

  <filter-mapping>
    <filter-name>param-clean</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>

