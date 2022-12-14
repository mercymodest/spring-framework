package com.mercymodest.spring.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * book pojo
 *
 * @author ZGH.MercyModest
 * @version V1.0.0
 * @created 2022/11/09
 */
@Data
public class Book {

	/**
	 * id
	 */
	private Long id;

	/**
	 * 书名
	 */
	private String name;

	/**
	 * 价格
	 */
	private BigDecimal price;
}