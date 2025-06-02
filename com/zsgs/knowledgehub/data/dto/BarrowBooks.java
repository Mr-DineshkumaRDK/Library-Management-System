package com.zsgs.knowledgehub.data.dto;

public class BarrowBooks {
	 private String recordId;
	    private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public long getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(long borrowDate) {
		this.borrowDate = borrowDate;
	}

	public long getDueDate() {
		return dueDate;
	}

	public void setDueDate(long dueDate) {
		this.dueDate = dueDate;
	}

	public String getReturnId() {
		return returnId;
	}

	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	private String bookId;
	    private long borrowDate;
	    private long dueDate;
	    private String returnId;
	    private double fineAmount;
}
