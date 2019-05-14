package com.nights.designpattern.factory.simplefactory;

import com.nights.designpattern.factory.ICourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:07
 */
public class CourseFactory {

    public ICourse createCourse(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
