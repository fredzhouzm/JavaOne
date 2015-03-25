package com.javaone.mybatis.dao;

import com.javaone.mybatis.model.pfmsUsage2;
import com.javaone.mybatis.model.pfmsUsage2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pfmsUsage2Mapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int countByExample(pfmsUsage2Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int deleteByExample(pfmsUsage2Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int insert(pfmsUsage2 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int insertSelective(pfmsUsage2 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	List<pfmsUsage2> selectByExample(pfmsUsage2Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	pfmsUsage2 selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByExampleSelective(@Param("record") pfmsUsage2 record,
                                 @Param("example") pfmsUsage2Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByExample(@Param("record") pfmsUsage2 record,
                        @Param("example") pfmsUsage2Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByPrimaryKeySelective(pfmsUsage2 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage2
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByPrimaryKey(pfmsUsage2 record);
}