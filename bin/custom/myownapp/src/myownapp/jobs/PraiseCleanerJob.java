package myownapp.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
import myownapp.model.PraiseModel;
import myownapp.service.PraiseService;

import java.util.List;
import java.util.logging.Logger;

public class PraiseCleanerJob extends AbstractJobPerformable<CronJobModel> {
    private PraiseService praiseService;
    private ModelService modelService;

    public void setPraiseService(PraiseService praiseService) {
        this.praiseService = praiseService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    Logger LOG = Logger.getLogger(PraiseCleanerJob.class.getName());
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        List<PraiseModel> praises = praiseService.getAllPraises();
        LOG.info("*****************");
        LOG.info("STARTING TO DELETE ALL PRAISES FROM DB");
        LOG.info("*****************");
        for (PraiseModel praise : praises) {
            modelService.remove(praise);
        }
        if(praises.isEmpty()) {
            LOG.info("DELETE COMPLETE");
            return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
        }
        return new PerformResult(CronJobResult.UNKNOWN, CronJobStatus.FINISHED);
    }
}
