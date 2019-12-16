/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.image;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.naming.NamingException;
import tai.ultis.DBUtils;

/**
 *
 * @author Windows
 */
public class ImageDAO implements Serializable{
    public List<ImageDTO>  getImage(String entryID) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select imageID,descriptionPic from tbl_Image where entryID = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, entryID);
                rs = pst.executeQuery();
                List<ImageDTO> list = new ArrayList<>();
                while (rs.next()) {
                    String imageID = rs.getString("imageID");
                    String descriptionPic = rs.getString("descriptionPic");
                    ImageDTO dto = new ImageDTO(imageID, entryID, descriptionPic);
                    list.add(dto);
                }
                return list;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
}
