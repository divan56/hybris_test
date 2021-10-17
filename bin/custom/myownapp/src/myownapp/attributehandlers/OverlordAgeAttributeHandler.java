package myownapp.attributehandlers;

import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import myownapp.model.OverlordModel;

public class OverlordAgeAttributeHandler extends AbstractDynamicAttributeHandler<Integer, OverlordModel> {
    @Override
    public Integer get(final OverlordModel overlord){
        return 5021 - overlord.getYearOfBirth();
    }
}
