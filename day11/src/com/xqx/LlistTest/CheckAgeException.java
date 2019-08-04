package com.xqx.LlistTest;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 19:58
 * description:
 */
public class CheckAgeException {
    public void checkAgeException(int age) throws AgeException {
        if (age<0)
            throw new AgeException("年龄异常，不能小于0");
    }
}
