package com.lamu.dao;

import com.lamu.entity.ProductionPic;
import com.lamu.entity.ProductionPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductionPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    long countByExample(ProductionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int deleteByExample(ProductionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int insert(ProductionPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int insertSelective(ProductionPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    List<ProductionPic> selectByExample(ProductionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    ProductionPic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ProductionPic record, @Param("example") ProductionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ProductionPic record, @Param("example") ProductionPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ProductionPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table production_pic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProductionPic record);
}