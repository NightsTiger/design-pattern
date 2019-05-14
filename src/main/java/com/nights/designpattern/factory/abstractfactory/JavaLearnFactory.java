package com.nights.designpattern.factory.abstractfactory;

import com.nights.designpattern.factory.ICourse;
import com.nights.designpattern.factory.JavaCourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:27
 */
public class JavaLearnFactory implements ILearnFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public ICourse createCourse() {
        return new JavaCourse();
    }
}
