package com.domain.bookstore.vo;

import java.io.Serializable;
import java.util.List;

public class Publisher implements Serializable{
	private int publisherNo;
	private String publisherName;
	private String publisherAddress;
	private String publisherTel;
	
	private List<Book> bookList;

	public Publisher(int publisherNo, String publisherName,
			String publisherAddress, String publisherTel, List<Book> bookList) {
		this.publisherNo = publisherNo;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.publisherTel = publisherTel;
		this.bookList = bookList;
	}

	public Publisher(int publisherNo, String publisherName,
			String publisherAddress, String publisherTel) {
		this.publisherNo = publisherNo;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.publisherTel = publisherTel;
	}

	public Publisher() {
	}

	public int getPublisherNo() {
		return publisherNo;
	}

	public void setPublisherNo(int publisherNo) {
		this.publisherNo = publisherNo;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherAddress() {
		return publisherAddress;
	}

	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}

	public String getPublisherTel() {
		return publisherTel;
	}

	public void setPublisherTel(String publisherTel) {
		this.publisherTel = publisherTel;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Publisher [publisherNo=" + publisherNo + ", publisherName="
				+ publisherName + ", publisherAddress=" + publisherAddress
				+ ", publisherTel=" + publisherTel + ", bookList=" + bookList
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bookList == null) ? 0 : bookList.hashCode());
		result = prime
				* result
				+ ((publisherAddress == null) ? 0 : publisherAddress.hashCode());
		result = prime * result
				+ ((publisherName == null) ? 0 : publisherName.hashCode());
		result = prime * result + publisherNo;
		result = prime * result
				+ ((publisherTel == null) ? 0 : publisherTel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		if (bookList == null) {
			if (other.bookList != null)
				return false;
		} else if (!bookList.equals(other.bookList))
			return false;
		if (publisherAddress == null) {
			if (other.publisherAddress != null)
				return false;
		} else if (!publisherAddress.equals(other.publisherAddress))
			return false;
		if (publisherName == null) {
			if (other.publisherName != null)
				return false;
		} else if (!publisherName.equals(other.publisherName))
			return false;
		if (publisherNo != other.publisherNo)
			return false;
		if (publisherTel == null) {
			if (other.publisherTel != null)
				return false;
		} else if (!publisherTel.equals(other.publisherTel))
			return false;
		return true;
	}	
	
	
}
