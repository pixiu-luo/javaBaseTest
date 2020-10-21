package com.classInner.AnnoInner;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/13 14:25 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Childnew extends Parent {

    @Override
    int count() {
        ICount iCount = new ICount() {
            @Override
            public int count() {
                return 0;
            }
        };
        int count = iCount.count();
        return count;
    }

}
