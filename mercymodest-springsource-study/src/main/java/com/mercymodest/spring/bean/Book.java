package com.mercymodest.spring.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 书 实体
 * @author MercyModest
 * @version V1.0.0
 */
@Data
public class Book {

	/**
	 * 图书编号
	 */
	private String bookNum;

	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 书名
	 */
	private String name;
}
