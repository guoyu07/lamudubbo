package com.lamu.model;

import java.io.Serializable;

public class ProductionModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.uuid
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.despriction
     *
     * @mbggenerated
     */
    private String despriction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.price
     *
     * @mbggenerated
     */
    private Float price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.discount
     *
     * @mbggenerated
     */
    private Integer discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.unit
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.recommand
     *
     * @mbggenerated
     */
    private Integer recommand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production.keyword
     *
     * @mbggenerated
     */
    private String keyword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.uuid
     *
     * @return the value of production.uuid
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.uuid
     *
     * @param uuid the value for production.uuid
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.name
     *
     * @return the value of production.name
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.name
     *
     * @param name the value for production.name
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.despriction
     *
     * @return the value of production.despriction
     * @mbggenerated
     */
    public String getDespriction() {
        return despriction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.despriction
     *
     * @param despriction the value for production.despriction
     * @mbggenerated
     */
    public void setDespriction(String despriction) {
        this.despriction = despriction == null ? null : despriction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.price
     *
     * @return the value of production.price
     * @mbggenerated
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.price
     *
     * @param price the value for production.price
     * @mbggenerated
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.discount
     *
     * @return the value of production.discount
     * @mbggenerated
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.discount
     *
     * @param discount the value for production.discount
     * @mbggenerated
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.unit
     *
     * @return the value of production.unit
     * @mbggenerated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.unit
     *
     * @param unit the value for production.unit
     * @mbggenerated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.recommand
     *
     * @return the value of production.recommand
     * @mbggenerated
     */
    public Integer getRecommand() {
        return recommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.recommand
     *
     * @param recommand the value for production.recommand
     * @mbggenerated
     */
    public void setRecommand(Integer recommand) {
        this.recommand = recommand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production.keyword
     *
     * @return the value of production.keyword
     * @mbggenerated
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production.keyword
     *
     * @param keyword the value for production.keyword
     * @mbggenerated
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}