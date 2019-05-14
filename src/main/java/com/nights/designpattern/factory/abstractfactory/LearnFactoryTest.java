package com.nights.designpattern.factory.abstractfactory;

import com.nights.designpattern.factory.ICourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:28
 */
public class LearnFactoryTest {

    public static void main(String[] args) {

        ILearnFactory javaLearnFactory = new JavaLearnFactory();
        ICourse javaCourse = javaLearnFactory.createCourse();
        javaCourse.record();
        INote javaNote = javaLearnFactory.createNote();
        javaNote.edit();


        ILearnFactory pythonLearnFactory = new PythonLearnFactory();
        ICourse pythonCourse = pythonLearnFactory.createCourse();
        pythonCourse.record();
        INote pythonNote = pythonLearnFactory.createNote();
        pythonNote.edit();


    }

}
