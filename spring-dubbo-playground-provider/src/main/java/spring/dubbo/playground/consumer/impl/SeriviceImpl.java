package spring.dubbo.playground.consumer.impl;

import org.apache.dubbo.config.annotation.Service;
import spring.dubbo.playground.common.DubboService;

@Service(version = "1.0.0",interfaceClass = DubboService.class)
public class SeriviceImpl  implements DubboService {

    @Override
    public String ins(){
        return "插入了一条数据";
    }

    @Override
    public String del(){
        return  "删除了一条数据";
    }

    @Override
    public String upd() {
        return "更新了一条数据";
    }

    @Override
    public String sel(){
        return "删除了一条数据";
    }
}
