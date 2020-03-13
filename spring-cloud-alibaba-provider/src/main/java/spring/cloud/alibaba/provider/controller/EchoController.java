package spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: kong
 * @ClassName: EchoController
 * @Date: 2020/3/6 22:08
 * @Description: TODO
 */
@RestController
public class EchoController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Provider " + string;
    }

    @GetMapping("lb")
    public String lb(){
        return "port:"+port;
    }
}
