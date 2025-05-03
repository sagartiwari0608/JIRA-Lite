package com.Project.JIRA_lite.Service;

import com.Project.JIRA_lite.Entity.DashboardTools;
import com.Project.JIRA_lite.Repository.DashboardRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    private final DashboardRepo dashboardRepo;
    public DashboardService(DashboardRepo dashboardRepo) {
        this.dashboardRepo = dashboardRepo;
    }

    public List<DashboardTools> getAvailableDashboardTools(){
        List<DashboardTools> result =this.dashboardRepo.findAll();
        System.out.println(result);
        result.forEach(item-> System.out.println(item.getName()));
        return result;
    }
}
