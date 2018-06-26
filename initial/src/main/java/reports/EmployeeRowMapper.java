import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import reports.OrgStructure;

public class EmployeeRowMapper implements RowMapper
{
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        OrgStructure org = new OrgStructure();
        org.setUniqueId(rs.getString(1));
        System.out.println("================="+rs.getString(1));
        /*customer.setCustId(rs.getInt("CUST_ID"));
        customer.setName(rs.getString("NAME"));
        customer.setAge(rs.getInt("AGE"));*/
        return org;
    }

}
