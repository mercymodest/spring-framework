package com.mercymodest.spring.factory;

import com.mercymodest.spring.bean.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-02 22:31
 */
public class StudentFactoryBean  implements FactoryBean<Student> {

	@Override
	public Student getObject() throws Exception {
		return new Student();
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
