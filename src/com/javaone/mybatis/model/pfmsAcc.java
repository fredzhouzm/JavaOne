package com.javaone.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class pfmsAcc {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.ACC_NO
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private String accNo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.ACC_USERID
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private Integer accUserid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.ACC_NAME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private String accName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.ACC_TYPE
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private String accType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.AMOUNT
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.STATUS
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pfmsdb_acc.CREATE_TIME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	private Date createTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.ACC_NO
	 * @return  the value of pfmsdb_acc.ACC_NO
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.ACC_NO
	 * @param accNo  the value for pfmsdb_acc.ACC_NO
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo == null ? null : accNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.ACC_USERID
	 * @return  the value of pfmsdb_acc.ACC_USERID
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public Integer getAccUserid() {
		return accUserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.ACC_USERID
	 * @param accUserid  the value for pfmsdb_acc.ACC_USERID
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setAccUserid(Integer accUserid) {
		this.accUserid = accUserid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.ACC_NAME
	 * @return  the value of pfmsdb_acc.ACC_NAME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.ACC_NAME
	 * @param accName  the value for pfmsdb_acc.ACC_NAME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setAccName(String accName) {
		this.accName = accName == null ? null : accName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.ACC_TYPE
	 * @return  the value of pfmsdb_acc.ACC_TYPE
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public String getAccType() {
		return accType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.ACC_TYPE
	 * @param accType  the value for pfmsdb_acc.ACC_TYPE
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setAccType(String accType) {
		this.accType = accType == null ? null : accType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.AMOUNT
	 * @return  the value of pfmsdb_acc.AMOUNT
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.AMOUNT
	 * @param amount  the value for pfmsdb_acc.AMOUNT
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.STATUS
	 * @return  the value of pfmsdb_acc.STATUS
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.STATUS
	 * @param status  the value for pfmsdb_acc.STATUS
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pfmsdb_acc.CREATE_TIME
	 * @return  the value of pfmsdb_acc.CREATE_TIME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pfmsdb_acc.CREATE_TIME
	 * @param createTime  the value for pfmsdb_acc.CREATE_TIME
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}