package cn.sml.eurekaconsumerribbonhystrix.infc;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DoController {

    @Autowired
    ConsumerService consumerService;
    @GetMapping("/consumer")
    public String  dc(){
        return consumerService.consumer();
    }

}

@Service
class ConsumerService{
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "fallback") //hystrix容错保护-服务降级
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/open",String.class);
    }
    public String fallback(){
        return "fallback";
    }
}
