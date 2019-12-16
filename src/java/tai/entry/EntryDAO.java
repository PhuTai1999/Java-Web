/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tai.entry;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.naming.NamingException;
import tai.ultis.DBUtils;

/**
 *
 * @author Windows
 */
public class EntryDAO implements Serializable {

    private List<EntryDTO> list;

    public List<EntryDTO> getList() {
        return list;
    }

    public void get3Entry() throws NamingException, SQLException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select entryID,entryName,publishedDate,entryContent,entryType "
                        + "from tbl_Entry order by publishedDate DESC";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                int count = 0;
                this.list = new ArrayList<>();
                while (rs.next() && count < 3) {
                    String entryID = rs.getString("entryID");
                    String entryName = rs.getString("entryName");
                    String date = rs.getString("publishedDate");
                    String arr[] = date.split("[-]+");
                    String publishedDate = arr[2] + "-" + arr[1] + "-" + arr[0];
                    String entryContent = rs.getString("entryContent");
                    int entryType = rs.getInt("entryType");
                    EntryDTO dto = new EntryDTO(entryID, entryName, publishedDate, entryContent, entryType);
                    this.list.add(dto);
                    count++;
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
    }

    public EntryDTO getEntry(String entryID) throws NamingException, SQLException {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select entryID,entryName,publishedDate,entryContent,entryType "
                        + "from tbl_Entry where entryID = ?";
                pst = con.prepareStatement(sql);
                pst.setString(1, entryID);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String entryName = rs.getString("entryName");
                    String date = rs.getString("publishedDate");
                    String arr[] = date.split("[-]+");
                    String publishedDate = arr[2] + "-" + arr[1] + "-" + arr[0];
                    String entryContent = rs.getString("entryContent");
                    int entryType = rs.getInt("entryType");
                    EntryDTO dto = new EntryDTO(entryID, entryName, publishedDate, entryContent, entryType);
                    return dto;
                }
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

    public void getAllEntry() throws NamingException, SQLException {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select entryID,entryName,publishedDate,entryContent,entryType "
                        + "from tbl_Entry order by publishedDate DESC";
                st = con.createStatement();
                rs = st.executeQuery(sql);
                this.list = new ArrayList<>();
                while (rs.next()) {
                    String entryID = rs.getString("entryID");
                    String entryName = rs.getString("entryName");
                    String date = rs.getString("publishedDate");
                    String arr[] = date.split("[-]+");
                    String publishedDate = arr[2] + "-" + arr[1] + "-" + arr[0];
                    String entryContent = rs.getString("entryContent");
                    int entryType = rs.getInt("entryType");
                    EntryDTO dto = new EntryDTO(entryID, entryName, publishedDate, entryContent, entryType);
                    this.list.add(dto);
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
    }
}
