/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.info;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.NamingException;
import tai.ultis.DBUtils;

/**
 *
 * @author Windows
 */
public class InfoDAO implements Serializable {

    public InfoDTO getInfo() throws NamingException, SQLException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select name,description from tbl_Info where seq = 1";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                if(rs.next()){
                    String name = rs.getString("name");
                    String description = rs.getString("description");
                    InfoDTO dto = new InfoDTO(name, description);
                    return dto;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
}
