package com.springboot.events;

import org.springframework.context.ApplicationEvent;

public class TranscationNotificationEvent extends ApplicationEvent {
	protected String transactionNo;
	protected String accountType;
	protected String operationType;
	protected String amount;
	protected String mobileNo;
	protected String machineNo;
	
	public String getMachineNo() {
		return machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	public TranscationNotificationEvent(Object source) {
		super(source);
	}

	public String getTransactionNo() {
		return transactionNo;
	}


	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getOperationType() {
		return operationType;
	}


	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "TransactionEvent [transactionNo=" + transactionNo + ", accountType=" + accountType + ", operationType="
				+ operationType + ", amount=" + amount + ", mobileNo=" + mobileNo + "]";
	}
	

}
