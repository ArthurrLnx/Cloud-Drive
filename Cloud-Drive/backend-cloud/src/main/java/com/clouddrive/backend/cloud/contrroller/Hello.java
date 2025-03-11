package com.clouddrive.backend.cloud.contrroller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "ola aaaa" +new Date();
    }

}
