package com.Project.JIRA_lite.Controllers;

import com.Project.JIRA_lite.Entity.DashboardTools;
import com.Project.JIRA_lite.Service.DashboardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashBoardController {
    private final DashboardService dashboardService;

    DashBoardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<DashboardTools> getDashBoardDetails() {
        return this.dashboardService.getAvailableDashboardTools();
    }
}
