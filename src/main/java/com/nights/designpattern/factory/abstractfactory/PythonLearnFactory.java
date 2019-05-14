package com.nights.designpattern.factory.abstractfactory;

import com.nights.designpattern.factory.ICourse;
import com.nights.designpattern.factory.PythonCourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:28
 */
public class PythonLearnFactory implements ILearnFactory {

    public INote createNote() {
        return new PythonNote();
    }

    public ICourse createCourse() {
        return new PythonCourse();
    }
}
