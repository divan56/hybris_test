package myownapp.interceptors;

import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InitDefaultsInterceptor;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import myownapp.events.objects.OverlordPraiseEvent;
import myownapp.model.OverlordModel;

import java.util.logging.Logger;

public class OverlordPraiseInterceptor implements PrepareInterceptor<OverlordModel> {
    private EventService eventService;

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    Logger LOG = Logger.getLogger(OverlordPraiseInterceptor.class.getName());

    @Override
    public void onPrepare(OverlordModel overlordModel, InterceptorContext interceptorContext) throws InterceptorException {
       String message;
        if(overlordModel.getPlanets() != null) {
             message = "Overlord " + overlordModel.getName() + " with id " + overlordModel.getId()
                    + " got into control " + overlordModel.getPlanets().size() + " planets. Congrats!";
        }
        else{
            message = "Overlord " + overlordModel.getName() + " with id " + overlordModel.getId()
                    + " was saved to the database";
        }
            LOG.info("***********************");
            LOG.info("Overlord " + overlordModel.getName() + " with id " + overlordModel.getId()
                    + " was saved to the database");
            LOG.info("***********************");
            eventService.publishEvent(new OverlordPraiseEvent(overlordModel.getId(), message));
    }

}
