package com.xqx.LlistTest;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 19:58
 * description:
 */
public class CheckAgeException {
    public void checkAgeException(int age) throws AgeException {
        if (age<0)
            throw new AgeException("�����쳣������С��0");
    }
}
