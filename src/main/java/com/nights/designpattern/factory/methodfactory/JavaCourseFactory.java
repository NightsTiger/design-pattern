package com.nights.designpattern.factory.methodfactory;

import com.nights.designpattern.factory.ICourse;
import com.nights.designpattern.factory.JavaCourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:19
 */
public class JavaCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new JavaCourse();
    }

}
