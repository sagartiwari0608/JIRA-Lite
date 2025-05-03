package com.Project.JIRA_lite.Repository;

import com.Project.JIRA_lite.Entity.DashboardTools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepo extends JpaRepository<DashboardTools,Integer> {

}
