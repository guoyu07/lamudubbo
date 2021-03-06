package com.lamu.dao;

import com.lamu.entity.SystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int countByExample(SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int deleteByExample(SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int insert(System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int insertSelective(System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    List<System> selectByExample(SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    System selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") System record, @Param("example") SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") System record, @Param("example") SystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(System record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(System record);
}