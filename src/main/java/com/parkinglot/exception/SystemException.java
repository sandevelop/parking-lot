package com.parkinglot.exception;

public class SystemException extends Exception
{

	private static final long serialVersionUID = 1966294444132346471L;
	final ErrorCode errorCode;
	
	
	public SystemException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}
	
	public SystemException(String errorMsg) {
		super(errorMsg);
		this.errorCode = null;
	}
	
	public ErrorCode getErrorCode()
	{
		return this.errorCode;
	}
}
