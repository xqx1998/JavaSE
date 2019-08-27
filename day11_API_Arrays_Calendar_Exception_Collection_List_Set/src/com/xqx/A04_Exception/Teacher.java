package com.xqx.A04_Exception;


/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 17:52
 * description:
 */
public class Teacher {
    public void checkScoreException(int score) throws ScoreException {
        if (score<0 || score>150){
            throw new ScoreException("·ÖÊý³¬³ö·¶Î§");
        }
    }
}
