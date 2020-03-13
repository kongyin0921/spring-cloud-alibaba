package spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import spring.cloud.alibaba.consumer.service.factory.EchoServiceFallBackFactory;
import spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;
//import spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;

/**
 * @Auther: kong
 * @ClassName: EchoService
 * @Date: 2020/3/7 09:43
 * @Description: TODO
 */
@FeignClient(value = "service-provider",fallback = EchoServiceFallBackFactory.class)
public interface EchoService {

    @GetMapping(value = "/echo/{string}")
    public String ehco(@PathVariable("string")String string);

    @GetMapping("lb")
    public String lb();
}
