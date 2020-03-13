package spring.cloud.alibaba.consumer.service.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import spring.cloud.alibaba.consumer.service.fallback.EchoServiceFallback;

/**
 * @Auther: kong
 * @ClassName: EchoServiceFallBackFactory
 * @Date: 2020/3/7 20:19
 * @Description: TODO
 */
@Component
public class EchoServiceFallBackFactory implements FallbackFactory<EchoServiceFallback> {
    @Override
    public EchoServiceFallback create(Throwable throwable) {
        return new EchoServiceFallback(throwable);
    }
}
