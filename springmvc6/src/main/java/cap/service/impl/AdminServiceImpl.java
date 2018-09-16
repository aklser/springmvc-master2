package cap.service.impl;

import cap.dao.AdminDAO;
import cap.model.Admin;
import cap.service.AdminService;
import cap.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDAO adminDAO;

    @Override
    public Admin login(Admin admin) {
        return adminDAO.login(admin);
    }

    @Override
    public PageBean findByPage(Integer pageNo, int i) {
        PageBean pageBean=new PageBean();
        pageBean.setTotalRecords(adminDAO.getTotalRecords());
        int pageSize = 0;
        pageBean.setList(adminDAO.findAdmins(pageNo,pageSize));
        pageBean.setPageSize(pageSize);
        pageBean.setPageNo(pageNo);
        return pageBean;
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDAO.addAdmin(admin);
    }

}