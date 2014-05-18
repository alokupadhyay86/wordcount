package net.deepvalue.test2;

import java.sql.ResultSet;
import java.sql.SQLException;

import net.deepvalue.test.Test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class TestUtils
{

    public static void testUtils()
    {

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        Test t = new Test() {public void print()
        {
            System.out.println("Overridden Test");
        }};
        /*jdbcTemplate.query("a", new RowMapper()
        {
            
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException
            {
               
                return null;
            }
        });*/
    }
    
    public static void print()
    {
        System.out.println("TestUtils");
    }
}
