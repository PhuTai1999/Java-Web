/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.entrydetails;

import java.io.Serializable;
import java.util.List;
import tai.entry.EntryDTO;
import tai.image.ImageDTO;

/**
 *
 * @author Windows
 */
public class EntryDetailsDTO implements Serializable{
    private EntryDTO entry;
    private List<ImageDTO> listImg;

    public EntryDetailsDTO() {
    }

    public EntryDetailsDTO(EntryDTO entry, List<ImageDTO> listImg) {
        this.entry = entry;
        this.listImg = listImg;
    }

    public EntryDTO getEntry() {
        return entry;
    }

    public void setEntry(EntryDTO entry) {
        this.entry = entry;
    }

    public List<ImageDTO> getListImg() {
        return listImg;
    }

    public void setListImg(List<ImageDTO> listImg) {
        this.listImg = listImg;
    }
    
}
