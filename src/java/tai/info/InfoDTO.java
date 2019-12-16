/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.info;

import java.io.Serializable;

/**
 *
 * @author Windows
 */
public class InfoDTO implements Serializable{
    private String name;
    private String description;

    public InfoDTO() {
    }

    public InfoDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
