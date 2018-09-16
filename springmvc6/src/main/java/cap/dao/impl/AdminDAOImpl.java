package cap.dao.impl;

import cap.dao.AdminDAO;
import cap.model.Admin;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository(value = "adminDAO")
public class AdminDAOImpl implements AdminDAO {
    private JdbcTemplate jdbcTemplate;

    @Resource(name = "jdbcTemplate")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Admin login(Admin admin) {
        String sql = "select * from admin where username=? and password=?";
        return this.jdbcTemplate.queryForObject(sql, new Object[]{admin.getUsername(), admin.getPassword()}, ParameterizedBeanPropertyRowMapper.newInstance(Admin.class));

    }

    @Override
    public List<Admin> findAdmins(int pageNo,int pageSize) {
        return this.jdbcTemplate.query("from Student").setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
    }

    @Override
    public int getTotalRecords() {
        String sql="select count(*) from Student";
        String count;
        count = this.jdbcTemplate.query(sql).uniqueResult().toString();
        return Integer.parseInt(count);
    }

    @Override
    public void addAdmin(Admin admin) {
        // TODO Auto-generated method stub
        this.jdbcTemplate.save(admin);

    }

}