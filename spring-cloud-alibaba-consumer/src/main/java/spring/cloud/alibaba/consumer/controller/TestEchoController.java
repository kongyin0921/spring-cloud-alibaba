package spring.cloud.alibaba.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.alibaba.consumer.service.EchoService;

import javax.annotation.Resource;

/**
 * @Auther: kong
 * @ClassName: TestEchoController
 * @Date: 2020/3/7 09:42
 * @Description: TODO
 */
@RefreshScope
@RestController
public class TestEchoController {
    @Autowired
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "feign/echo/{string}")
    public String echo(@PathVariable("string")String string){
        return echoService.ehco(string);
    }

    @GetMapping("nacos/config")
    public String echo(){
        return echoService.ehco(username);
    }


    @GetMapping("lb")
    public String lb(){
        return echoService.lb();
    }
}
