package marketstrail.facades;

import marketstrail.data.StoreData;
import markettrail.model.StoreModel;

import java.util.List;

public interface StoreFacade {
    List<StoreData> getStores();

    StoreData getStoreByCode(String code);
}
