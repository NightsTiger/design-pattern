package com.nights.designpattern.factory.abstractfactory;

import com.nights.designpattern.factory.ICourse;

/**
 * @author : dingwenqiang
 * @date : 2019/5/15 00:26
 */
public interface ILearnFactory {

    INote createNote();

    ICourse createCourse();

}
