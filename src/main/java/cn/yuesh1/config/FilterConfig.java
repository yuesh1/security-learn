package cn.yuesh1.config;

import javax.servlet.DispatcherType;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.DelegatingFilterProxyRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * <br/> author: dengzihui   <br/> create: 2022-08-20 16:32
 **/
@Configurable
public class FilterConfig {

  @Bean
  public DelegatingFilterProxyRegistrationBean delegatingFilterProxyRegistrationBean() {
    DelegatingFilterProxyRegistrationBean registration = new DelegatingFilterProxyRegistrationBean(
        "myFilter");
    registration.setOrder(100);
    registration.addUrlPatterns("/*");
    registration.setDispatcherTypes(DispatcherType.ASYNC, DispatcherType.ERROR,
        DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.REQUEST);
    return registration;
  }
}
