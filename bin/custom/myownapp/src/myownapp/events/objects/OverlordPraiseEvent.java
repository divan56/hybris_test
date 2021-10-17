package myownapp.events.objects;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class OverlordPraiseEvent extends AbstractEvent {
    private String overlordId;
    private String message;

    public OverlordPraiseEvent(String overlordId, String message) {
        super();
        this.overlordId = overlordId;
        this.message = message;
    }

    public String getOverlordId() {
        return overlordId;
    }

    public void setOverlordId(String overlordId) {
        this.overlordId = overlordId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
