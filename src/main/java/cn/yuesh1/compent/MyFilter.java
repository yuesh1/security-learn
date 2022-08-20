package cn.yuesh1.compent;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;

/**
 * <br/> author: dengzihui   <br/> create: 2022-08-20 16:28
 **/
@Component("myFilter")
public class MyFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    Filter.super.init(filterConfig);
    System.out.println("My own init!");
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    System.out.println("do filter start!!");
    filterChain.doFilter(servletRequest, servletResponse);
    System.out.println("do filter end!!");
  }

  @Override
  public void destroy() {
    Filter.super.destroy();
    System.out.println("My own destory!");

  }
}
