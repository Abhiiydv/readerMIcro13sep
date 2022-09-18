package com.reader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseBook {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pId;
	
	private String readerName;
	
	private String readerEmailId;
	
	private Integer bookId;
	
	private Integer price;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getReaderEmailId() {
		return readerEmailId;
	}

	public void setReaderEmailId(String readerEmailId) {
		this.readerEmailId = readerEmailId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public PurchaseBook(Integer pId, String readerName, String readerEmailId, Integer bookId, Integer price) {
		super();
		this.pId = pId;
		this.readerName = readerName;
		this.readerEmailId = readerEmailId;
		this.bookId = bookId;
		this.price = price;
	}

	public PurchaseBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
