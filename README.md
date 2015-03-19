CleanParamFilter
================
파라미터를 깔끔하게 만드는 필터

* *이 프로젝트는 Google Code로부터 이전되었습니다.*
* CleanParamFilter 소개 - http://blog.mr.hanul.co/2011/02/clean-param-filter.html

1. 불필요한 공백 제거 기능
  * 앞뒤 공백 제거
  * 다중 공백 제거

2. Get 방식으로 전송된 파라미터의 인코딩 설정 (charset param)

※ 설정 방법 (web.xml)

```xml
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
```

Commiter
----
*Mr. 하늘* (_mr@hanul.co_) - http://mr.hanul.co
