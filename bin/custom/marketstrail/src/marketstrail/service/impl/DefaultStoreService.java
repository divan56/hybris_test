package marketstrail.service.impl;

import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import marketstrail.daos.StoreDAO;
import marketstrail.daos.impl.DefaultStoreDAO;
import markettrail.model.CustomStoreModel;
import marketstrail.service.StoreService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.logging.Logger;

public class DefaultStoreService implements StoreService {
   private StoreDAO storeDAO;

    @Override
    public List<CustomStoreModel> getAllStores() {
        return storeDAO.getAllStores();
    }

    @Override
    public CustomStoreModel getStoreByCode(String code) {
        List<CustomStoreModel> store = storeDAO.getStoreByCode(code);
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
