package myownapp.events.listeners;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import myownapp.events.objects.OverlordPraiseEvent;
import myownapp.model.PraiseModel;

public class OverlordPraiseEventListener extends AbstractEventListener<OverlordPraiseEvent> {
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected void onEvent(OverlordPraiseEvent overlordPraiseEvent) {
        PraiseModel praise = modelService.create(PraiseModel.class);
        praise.setOverlordId(overlordPraiseEvent.getOverlordId());
        praise.setMessage(overlordPraiseEvent.getMessage());
        modelService.save(praise);
    }
}
