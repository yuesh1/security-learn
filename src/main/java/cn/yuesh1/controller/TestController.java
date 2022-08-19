package cn.yuesh1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/> @author: yuesh1   <br/> create: 2022-08-19 17:32
 **/
@RestController
public class TestController {

  @GetMapping("/test")
  public Object test() {
    return "hello security!";
  }
}
