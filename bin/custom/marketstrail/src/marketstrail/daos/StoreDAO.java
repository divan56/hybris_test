package marketstrail.daos;


import markettrail.model.StoreModel;

import java.util.List;

public interface StoreDAO {
    List<StoreModel> getAllStores();

    List<StoreModel> getStoreByCode(String code);
}
