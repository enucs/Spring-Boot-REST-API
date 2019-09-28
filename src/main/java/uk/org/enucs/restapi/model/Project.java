package uk.org.enucs.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    private int id;

    @Column(name = "amount_pledged")
    private float amountPledged;

    private String blurb;

    private String by;

    private String country;

    private String currency;

    @Column(name = "end_time")
    private Date endTime;

    private String location;

    @Column(name = "percentage_funded")
    private int percentageFunded;

    private String state;

    private String title;

    private String type;

    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmountPledged() {
        return amountPledged;
    }

    public void setAmountPledged(float amountPledged) {
        this.amountPledged = amountPledged;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPercentageFunded() {
        return percentageFunded;
    }

    public void setPercentageFunded(int percentageFunded) {
        this.percentageFunded = percentageFunded;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", amountPledged=" + amountPledged +
                ", blurb='" + blurb + '\'' +
                ", by='" + by + '\'' +
                ", country='" + country + '\'' +
                ", currency='" + currency + '\'' +
                ", endTime=" + endTime +
                ", location='" + location + '\'' +
                ", percentageFunded=" + percentageFunded +
                ", state='" + state + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
