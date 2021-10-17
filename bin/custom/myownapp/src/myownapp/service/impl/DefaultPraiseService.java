package myownapp.service.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import myownapp.daos.PraiseDAO;
import myownapp.model.PraiseModel;
import myownapp.service.PraiseService;

import java.util.List;

public class DefaultPraiseService implements PraiseService {
    private PraiseDAO praiseDAO;

    @Override
    public List<PraiseModel> getAllPraises() {
        return praiseDAO.getAllPraises();
    }

    public void setPraiseDAO(PraiseDAO praiseDAO) {
        this.praiseDAO = praiseDAO;
    }

    @Override
    public PraiseModel getPraiseByOverlordId(String id) {
        List<PraiseModel> praises = praiseDAO.getPraiseByOverlordId(id);
        if (praises.isEmpty()) {
            throw new UnknownIdentifierException("Can't find praise with overlordID " + id);
        }
        if (praises.size() > 1) {
            throw new AmbiguousIdentifierException(praises.size() + " overlords with id " + id + " founded!");
        }
        return praises.get(0);
    }
}
