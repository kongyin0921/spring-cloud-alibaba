package spring.cloud.alibaba.consumer.service.fallback;

import org.springframework.stereotype.Component;
import spring.cloud.alibaba.consumer.service.EchoService;

/**
 * 请求失败返回类实现服务接口
 * @Auther: kong
 * @ClassName: EchoServiceFallback
 * @Date: 2020/3/7 16:40
 * @Description: TODO
 */


public class EchoServiceFallback implements EchoService {

    private Throwable throwable;

    public EchoServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String ehco(String string) {
        return "您的网络有问题";
    }

    @Override
    public String lb() {
        return "网络错误";
    }
}

