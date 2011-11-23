package org.slc.sli.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/appselector")
public class AppSelectorController {

    @RequestMapping(method = RequestMethod.POST)
    public String returnApps(ModelMap model) {
        System.out.println(model.toString());
        model.addAttribute("message", "Select an application");
        HashMap<String, String> appToUrlMap = new HashMap<String, String>();

        //TODO: Retrieve the applications from a service
        appToUrlMap.put("Dashboard", "studentlist");
        appToUrlMap.put("FakeApp", "/fakeapp");
        model.addAttribute("appToUrl", appToUrlMap);
        return "SelectApp";
    }

}
