package com.adele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {
    public void executeUpdate(String sql, PreparedStatementSetter pss) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(sql);
            pss.setter(pstmt);

            pstmt.executeUpdate();
        } finally {
            if(pstmt != null) {
                pstmt.close();
            }

            if(con != null) {
                con.close();
            }
        }
    }

    public Object executeQuery(String sql, PreparedStatementSetter pss, RowMapper rowMapper) throws SQLException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = ConnectionManager.getConnection();
            pstmt = con.prepareStatement(sql);
            pss.setter(pstmt);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                return rowMapper.map(rs);
            } else {
                return null;
            }
        } finally {
            if(rs != null) {
                rs.close();
            }
            if(pstmt != null) {
                pstmt.close();
            }
            if(con != null) {
                con.close();
            }
        }
    }
}
