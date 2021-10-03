package myownapp.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import myownapp.daos.OverlordDAO;
import myownapp.model.OverlordModel;
import myownapp.service.OverlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.List;


public class DefaultOverlordService implements OverlordService {
    @Autowired
    private OverlordDAO overlordDAO;

    @Override
    public List<OverlordModel> getAllOverlords() {
        return overlordDAO.getAllOverlords();
    }

    @Override
    public OverlordModel getOverlordById(String id) {
        List<OverlordModel> overlords = overlordDAO.getOverlordById(id);

        if (overlords.isEmpty()) {
            throw new UnknownIdentifierException("No result found with id " + id);
        }
        if (overlords.size() > 1) {
            throw new AmbiguousIdentifierException(overlords.size() + "founded with id " + id);
        }
        return overlords.get(0);
    }

    @Required
    public void setOverlordDAO(OverlordDAO overlordDAO) {
        this.overlordDAO = overlordDAO;
    }
}
