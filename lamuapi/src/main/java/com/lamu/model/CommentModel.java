package com.lamu.model;

import java.io.Serializable;
import java.util.Date;

public class CommentModel implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.uuid
     *
     * @mbggenerated
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.prodution_id
     *
     * @mbggenerated
     */
    private String produtionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment
     *
     * @mbggenerated
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment_user
     *
     * @mbggenerated
     */
    private String commentUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.uuid
     *
     * @return the value of comment.uuid
     * @mbggenerated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.uuid
     *
     * @param uuid the value for comment.uuid
     * @mbggenerated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.prodution_id
     *
     * @return the value of comment.prodution_id
     * @mbggenerated
     */
    public String getProdutionId() {
        return produtionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.prodution_id
     *
     * @param produtionId the value for comment.prodution_id
     * @mbggenerated
     */
    public void setProdutionId(String produtionId) {
        this.produtionId = produtionId == null ? null : produtionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment
     *
     * @return the value of comment.comment
     * @mbggenerated
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment
     *
     * @param comment the value for comment.comment
     * @mbggenerated
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment_user
     *
     * @return the value of comment.comment_user
     * @mbggenerated
     */
    public String getCommentUser() {
        return commentUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment_user
     *
     * @param commentUser the value for comment.comment_user
     * @mbggenerated
     */
    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.date
     *
     * @return the value of comment.date
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.date
     *
     * @param date the value for comment.date
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }
}