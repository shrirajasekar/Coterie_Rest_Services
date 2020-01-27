package com.coterie.rest_services.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Comments {

    @Id
  public String _id;
  public String commentId;
  public String time;
  public String commentMessage;
  public String user;
  public String likes;
  public String [] likedBy;
  public String [] replyCommentIds;


    public Comments() {
    }

    public Comments(String _id, String commentId, String time, String commentMessage, String user, String likes, String[] likedBy, String[] replyCommentIds) {
        this._id = _id;
        this.commentId = commentId;
        this.time = time;
        this.commentMessage = commentMessage;
        this.user = user;
        this.likes = likes;
        this.likedBy = likedBy;
        this.replyCommentIds = replyCommentIds;
    }

    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCommentMessage() {
        return this.commentMessage;
    }

    public void setCommentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLikes() {
        return this.likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String[] getLikedBy() {
        return this.likedBy;
    }

    public void setLikedBy(String[] likedBy) {
        this.likedBy = likedBy;
    }

    public String[] getReplyCommentIds() {
        return this.replyCommentIds;
    }

    public void setReplyCommentIds(String[] replyCommentIds) {
        this.replyCommentIds = replyCommentIds;
    }

    public Comments _id(String _id) {
        this._id = _id;
        return this;
    }

    public Comments commentId(String commentId) {
        this.commentId = commentId;
        return this;
    }

    public Comments time(String time) {
        this.time = time;
        return this;
    }

    public Comments commentMessage(String commentMessage) {
        this.commentMessage = commentMessage;
        return this;
    }

    public Comments user(String user) {
        this.user = user;
        return this;
    }

    public Comments likes(String likes) {
        this.likes = likes;
        return this;
    }

    public Comments likedBy(String[] likedBy) {
        this.likedBy = likedBy;
        return this;
    }

    public Comments replyCommentIds(String[] replyCommentIds) {
        this.replyCommentIds = replyCommentIds;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Comments)) {
            return false;
        }
        Comments comments = (Comments) o;
        return Objects.equals(_id, comments._id) && Objects.equals(commentId, comments.commentId) && Objects.equals(time, comments.time) && Objects.equals(commentMessage, comments.commentMessage) && Objects.equals(user, comments.user) && Objects.equals(likes, comments.likes) && Objects.equals(likedBy, comments.likedBy) && Objects.equals(replyCommentIds, comments.replyCommentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, commentId, time, commentMessage, user, likes, likedBy, replyCommentIds);
    }

    @Override
    public String toString() {
        return "{" +
            " _id='" + get_id() + "'" +
            ", commentId='" + getCommentId() + "'" +
            ", time='" + getTime() + "'" +
            ", commentMessage='" + getCommentMessage() + "'" +
            ", user='" + getUser() + "'" +
            ", likes='" + getLikes() + "'" +
            ", likedBy='" + getLikedBy() + "'" +
            ", replyCommentIds='" + getReplyCommentIds() + "'" +
            "}";
    }
  

}
