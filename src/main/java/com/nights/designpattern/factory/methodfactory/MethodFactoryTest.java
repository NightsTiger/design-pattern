package com.nights.designpattern.factory.methodfactory;

import com.nights.designpattern.factory.ICourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:21
 */
public class MethodFactoryTest {

    public static void main(String[] args) {
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.createCourse();
        javaCourse.record();


        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonCourseFactory.createCourse();
        pythonCourse.record();

    }

}
