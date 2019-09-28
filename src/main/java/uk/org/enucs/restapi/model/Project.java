package uk.org.enucs.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * The type Project.
 */
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

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets amount pledged.
     *
     * @return the amount pledged
     */
    public float getAmountPledged() {
        return amountPledged;
    }

    /**
     * Sets amount pledged.
     *
     * @param amountPledged the amount pledged
     */
    public void setAmountPledged(float amountPledged) {
        this.amountPledged = amountPledged;
    }

    /**
     * Gets blurb.
     *
     * @return the blurb
     */
    public String getBlurb() {
        return blurb;
    }

    /**
     * Sets blurb.
     *
     * @param blurb the blurb
     */
    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    /**
     * Gets by.
     *
     * @return the by
     */
    public String getBy() {
        return by;
    }

    /**
     * Sets by.
     *
     * @param by the by
     */
    public void setBy(String by) {
        this.by = by;
    }

    /**
     * Gets country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets country.
     *
     * @param country the country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets end time.
     *
     * @return the end time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets end time.
     *
     * @param endTime the end time
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets percentage funded.
     *
     * @return the percentage funded
     */
    public int getPercentageFunded() {
        return percentageFunded;
    }

    /**
     * Sets percentage funded.
     *
     * @param percentageFunded the percentage funded
     */
    public void setPercentageFunded(int percentageFunded) {
        this.percentageFunded = percentageFunded;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
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
