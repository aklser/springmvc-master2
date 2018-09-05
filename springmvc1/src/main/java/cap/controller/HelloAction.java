package cap.controller;

import cap.bean.Admin;
import org.springframework.stereotype.Controller;
import com.opensymphony.xwork2.ActionSupport;
@Controller
public class HelloAction extends ActionSupport {
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String hello() {
        return SUCCESS;
    }
}