package myownapp.events.listeners;

import de.hybris.platform.servicelayer.event.events.AfterItemCreationEvent;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import myownapp.model.OverlordModel;
import myownapp.model.PraiseModel;

public class NewOverlordEventListener extends AbstractEventListener<AfterItemCreationEvent> {
    private ModelService modelService;

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    protected void onEvent(AfterItemCreationEvent event) {
        if(event != null && event.getSource() != null){
            final Object object = modelService.get(event.getSource());
            if (object instanceof OverlordModel){
                OverlordModel overlord = (OverlordModel) object;
                final PraiseModel praise = modelService.create(PraiseModel.class);
                praise.setOverlordId(overlord.getId());
                String message = "Overlord " + overlord.getName() + " with id " + overlord.getId() +
                        " was born!";
                praise.setMessage(message);
                modelService.save(praise);
            }
        }
    }
}
