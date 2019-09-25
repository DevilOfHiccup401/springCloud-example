package cn.sml.eurekaconsumerfeign.infc.impl;

import cn.sml.eurekaconsumerfeign.infc.DoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoController {
    @Autowired
    DoClient doClient;

    @GetMapping("/consumer")
    public String open(){
        return doClient.consumer();
    }
}
