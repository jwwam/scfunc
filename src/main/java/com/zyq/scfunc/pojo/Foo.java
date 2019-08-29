package com.zyq.scfunc.pojo;

import lombok.Data;

/**
 * @ClassName: Foo
 * @Auther: zhangyingqi
 * @Date: 2019/8/27 15:16
 * @Description:
 */
@Data
public class Foo {

    private String value;

    Foo() {
    }

    public String lowercase() {
        return value.toLowerCase();
    }

    public Foo(String value) {
        this.value = value;
    }

    public String uppercase() {
        return value.toUpperCase();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}