package com.zyq.scfunc.pojo;

/**
 * @ClassName: Bar
 * @Auther: zhangyingqi
 * @Date: 2019/8/27 15:17
 * @Description:
 */
public class Bar {

    private String value;

    Bar() {
    }

    public static Bar valueOf(String value) {
        return new Bar(value);
    }

    Bar(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}