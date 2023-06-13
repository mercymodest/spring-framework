package com.mercymodest.spring.aop;

import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * teacher 实体
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @since 2023/06/13
 */
@ToString
@Component
public class Teacher {

	@Setter
	private Long id;


	private String teacherName;

	public Teacher() {
		System.out.println("Teacher constructor");
	}

	@Value("${os.name}")
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}
