package com.nights.designpattern.factory.simplefactory;

import com.nights.designpattern.factory.ICourse;
import com.nights.designpattern.factory.JavaCourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/9 08:16
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse javaCourse = factory.createCourse(JavaCourse.class);
        javaCourse.record();

    }

}
