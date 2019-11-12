package services;

import models.ReportModel;

public interface PersistenceServiceI {
    void saveReport(ReportModel report);

    ReportModel getReport();
}
