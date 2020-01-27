package com.coterie.rest_services.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * Groups
 */
public class Groups {

    @Id
  public String _id;
  public String dateFrom;
  public String dateTo;
  public String time;
  public String location;
  public String city;
  public String what;
  public String [] keywords;
  public String [] members;
  public Comments [] comments;


    public Groups() {
    }

    public Groups(String _id, String dateFrom, String dateTo, String time, String location, String city, String what, String[] keywords, String[] members, Comments[] comments) {
        this._id = _id;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.time = time;
        this.location = location;
        this.city = city;
        this.what = what;
        this.keywords = keywords;
        this.members = members;
        this.comments = comments;
    }

    public String get_id() {
        return this._id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDateFrom() {
        return this.dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return this.dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWhat() {
        return this.what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public String[] getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String[] getMembers() {
        return this.members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }

    public Comments[] getComments() {
        return this.comments;
    }

    public void setComments(Comments[] comments) {
        this.comments = comments;
    }

    public Groups _id(String _id) {
        this._id = _id;
        return this;
    }

    public Groups dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public Groups dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public Groups time(String time) {
        this.time = time;
        return this;
    }

    public Groups location(String location) {
        this.location = location;
        return this;
    }

    public Groups city(String city) {
        this.city = city;
        return this;
    }

    public Groups what(String what) {
        this.what = what;
        return this;
    }

    public Groups keywords(String[] keywords) {
        this.keywords = keywords;
        return this;
    }

    public Groups members(String[] members) {
        this.members = members;
        return this;
    }

    public Groups comments(Comments[] comments) {
        this.comments = comments;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Groups)) {
            return false;
        }
        Groups groups = (Groups) o;
        return Objects.equals(_id, groups._id) && Objects.equals(dateFrom, groups.dateFrom) && Objects.equals(dateTo, groups.dateTo) && Objects.equals(time, groups.time) && Objects.equals(location, groups.location) && Objects.equals(city, groups.city) && Objects.equals(what, groups.what) && Objects.equals(keywords, groups.keywords) && Objects.equals(members, groups.members) && Objects.equals(comments, groups.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id, dateFrom, dateTo, time, location, city, what, keywords, members, comments);
    }

    @Override
    public String toString() {
        return "{" +
            " _id='" + get_id() + "'" +
            ", dateFrom='" + getDateFrom() + "'" +
            ", dateTo='" + getDateTo() + "'" +
            ", time='" + getTime() + "'" +
            ", location='" + getLocation() + "'" +
            ", city='" + getCity() + "'" +
            ", what='" + getWhat() + "'" +
            ", keywords='" + getKeywords() + "'" +
            ", members='" + getMembers() + "'" +
            ", comments='" + getComments() + "'" +
            "}";
    }


}