package com.Project.JIRA_lite.Controllers;

import com.Project.JIRA_lite.Entity.DashboardTools;
import com.Project.JIRA_lite.Service.DashboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DashBoardController {
    private final DashboardService dashboardService;

    DashBoardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    //    @RequestMapping(value = "/", method = RequestMethod.GET)
    @CrossOrigin("http://localhost:5173")
    @GetMapping(value = "/tools")
    @ResponseBody
    public List<DashboardTools> getDashBoardDetails() {
        return this.dashboardService.getAvailableDashboardTools();
    }
//
//    @PostMapping(value = "/tools")
//    @ResponseBody
//    public DashboardTools addNewTool(){
//
//    }

}
