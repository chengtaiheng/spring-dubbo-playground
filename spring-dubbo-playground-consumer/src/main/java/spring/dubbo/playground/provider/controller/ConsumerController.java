package spring.dubbo.playground.provider.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;
import spring.dubbo.playground.common.DubboService;

@RestController
public class ConsumerController {

    @Reference(version = "1.0.0")
    private DubboService dubboService;

    @PostMapping("ins")
    public String ins(){
        return dubboService.ins();
    }

    @DeleteMapping("del")
    public String del(){
        return dubboService.del();
    }

    @PutMapping("update")
    public String upda(){
        return dubboService.upd();
    }

    @GetMapping("select")
    public String select() {
        return dubboService.sel();
    }

}
