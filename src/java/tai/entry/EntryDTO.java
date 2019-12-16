/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.entry;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Windows
 */
public class EntryDTO implements Serializable {

    private String entryID;
    private String entryName;
    private String publishedDate;
    private String entryContent;
    private int entryType;

    public EntryDTO() {
    }

    public EntryDTO(String entryID, String entryName, String publishedDate, String entryContent, int entryType) {
        this.entryID = entryID;
        this.entryName = entryName;
        this.publishedDate = publishedDate;
        this.entryContent = entryContent;
        this.entryType = entryType;
    }

    public String getEntryID() {
        return entryID;
    }

    public void setEntryID(String entryID) {
        this.entryID = entryID;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getEntryContent() {
        return entryContent;
    }

    public void setEntryContent(String entryContent) {
        this.entryContent = entryContent;
    }

    public int getEntryType() {
        return entryType;
    }

    public void setEntryType(int entryType) {
        this.entryType = entryType;
    }

    
    

   
}
