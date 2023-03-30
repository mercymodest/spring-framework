package com.mercymodest.spring.factory;

import com.mercymodest.spring.bean.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @create 03-02 22:31
 */
@Component
public class StudentFactoryBean  implements FactoryBean<Student> {

	public StudentFactoryBean() {
		System.out.println("StudentFactoryBean constructor");
	}

	@Override
	public Student getObject() throws Exception {
		return new Student();
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}
}
