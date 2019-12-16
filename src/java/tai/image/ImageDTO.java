/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.image;

import java.io.Serializable;

/**
 *
 * @author Windows
 */
public class ImageDTO implements Serializable{
    private String imageID;
    private String entryID;
    private String descriptionPic;

    public ImageDTO(String imageID, String entryID, String descriptionPic) {
        this.imageID = imageID;
        this.entryID = entryID;
        this.descriptionPic = descriptionPic;
    }

    public ImageDTO() {
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getEntryID() {
        return entryID;
    }

    public void setEntryID(String entryID) {
        this.entryID = entryID;
    }

    public String getDescriptionPic() {
        return descriptionPic;
    }

    public void setDescriptionPic(String descriptionPic) {
        this.descriptionPic = descriptionPic;
    }
    
    
}
