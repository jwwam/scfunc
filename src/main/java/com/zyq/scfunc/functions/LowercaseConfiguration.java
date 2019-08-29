package com.zyq.scfunc.functions;

import com.zyq.scfunc.pojo.Bar;
import com.zyq.scfunc.pojo.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;
/**
 * @ClassName: LowercaseConfiguration
 * @Auther: zhangyingqi
 * @Date: 2019/8/27 15:13
 * @Description:
 */
@Configuration
public class LowercaseConfiguration {

    @Bean
    public Function<Flux<Foo>, Flux<Bar>> lowercase() {
        return flux -> flux.log().map(value -> Bar.valueOf(value.lowercase()));
    }

}