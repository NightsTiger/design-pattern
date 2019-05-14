package com.nights.designpattern.factory.methodfactory;

import com.nights.designpattern.factory.ICourse;
import com.nights.designpattern.factory.PythonCourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:20
 */
public class PythonCourseFactory implements ICourseFactory {

    public ICourse createCourse() {
        return new PythonCourse();
    }

}
