package cn.zmlio.controller;

import cn.zmlio.model.*;
import cn.zmlio.service.IBaseService;
import cn.zmlio.service.UserManagerService;
import cn.zmlio.utils.DistrictUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ZML on 2015/9/24.
 */


@Controller
public class InitController {

    private IBaseService baseService;


    private UserManagerService userManagerService;

    @Resource
    public void setUserManagerService(UserManagerService userManagerService) {
        this.userManagerService = userManagerService;
    }

    @Resource
    public void setBaseService(IBaseService baseService) {
        this.baseService = baseService;
    }

    @RequestMapping("/init")
    public String init(@RequestParam(required = true,value = "token",defaultValue = "admin")String token){

        if("admin".equals(token)){
            if( userManagerService.getUserNumber()==0){
                fillTables();
            }
        }
        return "redirect:/";
    }

    private void fillTables(){
        
        
        fillAreas();
        createRoles();
        createAdministrator();
    }

    private void fillAreas() {
        try {
            Map<String, Map<String, Set<String>>> provinces= DistrictUtils.getNewestCounties();

            for(String provincesName:provinces.keySet()){
                District provincesObj=new District();

                provincesObj.setDistName(provincesName);

                baseService.saveOrUpdate(provincesObj);

                Map<String, Set<String>> province=provinces.get(provincesName);

                for(String cityName:province.keySet()){
                    District cityObj=new District();
                    cityObj.setParentDist(provincesObj);
                    cityObj.setDistName(cityName);
                    baseService.saveOrUpdate(cityObj);

                    Set<String> city =province.get(cityName);

                    for(String disName:city ){
                        District district=new District();

                        district.setDistName(disName);

                        district.setParentDist(cityObj);

                        baseService.saveOrUpdate(district);
                    }


                }

            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createRoles(){
        Role admininstator=new Role();

        admininstator.setRoleName("ADMIN");

        baseService.saveOrUpdate(admininstator);

    }

    private void createAdministrator() {
        User user =new User();
        user.setUsername("admin");
        user.setPassword("admin");
        user.setEmail("admin@zmlio.cn");
        user.setPhone("12345678901");
        Set<Role> roles=new HashSet<>();
        roles.add((Role) userManagerService.getRoleByName("ADMIN"));
        user.setRoles(roles);
        userManagerService.saveOrUpdateUser(user);

        UserDetail userDetail=new UserDetail();

        userDetail.setUser(user);

        Contacts contacts=new Contacts();

        contacts.setEmail("admin@zmlio.cn");

        contacts.setPhone("12345678901");

        userDetail.setContacts(contacts);
        baseService.saveOrUpdate(contacts);
        baseService.saveOrUpdate(userDetail);
    }

}
