package spring.cloud.alibaba.consumer.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: kong
 * @ClassName: ConsumerConfiguration
 * @Date: 2020/3/6 22:39
 * @Description: TODO
 */
@Configuration
public class ConsumerConfiguration {


    @Bean
    @LoadBalanced  //负载均衡功能
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
