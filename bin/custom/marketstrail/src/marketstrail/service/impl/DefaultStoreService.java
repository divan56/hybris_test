package marketstrail.service.impl;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import marketstrail.daos.StoreDAO;
import marketstrail.daos.impl.DefaultStoreDAO;
import marketstrail.service.StoreService;
import markettrail.model.StoreModel;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.logging.Logger;

public class DefaultStoreService implements StoreService {
   private StoreDAO storeDAO;

    @Override
    public List<StoreModel> getAllStores() {
        return storeDAO.getAllStores();
    }

    @Override
    public StoreModel getStoreByCode(String code) {
        List<StoreModel> store = storeDAO.getStoreByCode(code);
        if(store.size()!=1){
            throw new UnknownIdentifierException(
                    "There is " + store.size() + " stores with " + code +" found!");
        }
        return store.get(0);
    }

    @Required
    public void setStoreDAO(DefaultStoreDAO storeDAO) {
    }
}
