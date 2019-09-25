package cn.sml.eurekaconsumerfeign.infc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface DoClient {
    @GetMapping("/open")
    String consumer();
}
