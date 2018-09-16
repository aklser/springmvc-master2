package cap.service;

import cap.model.Admin;
import cap.util.PageBean;

public interface AdminService {
    public Admin login(Admin admin);

    PageBean findByPage(Integer pageNo, int i);
    void addAdmin(Admin admin);
}