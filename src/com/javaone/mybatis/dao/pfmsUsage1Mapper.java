package com.javaone.mybatis.dao;

import com.javaone.mybatis.model.pfmsUsage1;
import com.javaone.mybatis.model.pfmsUsage1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pfmsUsage1Mapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int countByExample(pfmsUsage1Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int deleteByExample(pfmsUsage1Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int insert(pfmsUsage1 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int insertSelective(pfmsUsage1 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	List<pfmsUsage1> selectByExample(pfmsUsage1Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	pfmsUsage1 selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByExampleSelective(@Param("record") pfmsUsage1 record,
                                 @Param("example") pfmsUsage1Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByExample(@Param("record") pfmsUsage1 record,
                        @Param("example") pfmsUsage1Example example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByPrimaryKeySelective(pfmsUsage1 record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pfmsdb_usage1
	 * @mbggenerated  Mon Mar 16 21:45:39 CST 2015
	 */
	int updateByPrimaryKey(pfmsUsage1 record);
}