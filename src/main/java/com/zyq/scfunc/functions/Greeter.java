package com.zyq.scfunc.functions;

/**
 * @ClassName: Greeter
 * @Auther: zhangyingqi
 * @Date: 2019/8/26 17:38
 * @Description:
 */
import java.util.function.Function;

public class Greeter implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to Spring Cloud Function!!!";
    }

}