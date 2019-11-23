/*
 * EasyBimehLandingLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ir.notifaano.server.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class SummaryNotic 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -1141973046712815043L;
    private int id;
    private int insuranceCentreId;
    private int articleType;
    private String title;
    private String summary;
    private String articleGroup;
    private int metaMediaFileId;
    private String metaMediaFileUrl;
    private String publishPersianDate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("insuranceCentreId")
    public int getInsuranceCentreId ( ) { 
        return this.insuranceCentreId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("insuranceCentreId")
    public void setInsuranceCentreId (int value) { 
        this.insuranceCentreId = value;
        notifyObservers(this.insuranceCentreId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("articleType")
    public int getArticleType ( ) { 
        return this.articleType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("articleType")
    public void setArticleType (int value) { 
        this.articleType = value;
        notifyObservers(this.articleType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("summary")
    public String getSummary ( ) { 
        return this.summary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("summary")
    public void setSummary (String value) { 
        this.summary = value;
        notifyObservers(this.summary);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("articleGroup")
    public String getArticleGroup ( ) { 
        return this.articleGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("articleGroup")
    public void setArticleGroup (String value) { 
        this.articleGroup = value;
        notifyObservers(this.articleGroup);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metaMediaFileId")
    public int getMetaMediaFileId ( ) { 
        return this.metaMediaFileId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metaMediaFileId")
    public void setMetaMediaFileId (int value) { 
        this.metaMediaFileId = value;
        notifyObservers(this.metaMediaFileId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("metaMediaFileUrl")
    public String getMetaMediaFileUrl ( ) { 
        return this.metaMediaFileUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("metaMediaFileUrl")
    public void setMetaMediaFileUrl (String value) { 
        this.metaMediaFileUrl = value;
        notifyObservers(this.metaMediaFileUrl);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("publishPersianDate")
    public String getPublishPersianDate ( ) { 
        return this.publishPersianDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("publishPersianDate")
    public void setPublishPersianDate (String value) { 
        this.publishPersianDate = value;
        notifyObservers(this.publishPersianDate);
    }
 
}