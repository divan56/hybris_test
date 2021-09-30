package markettrail.daos;

import markettrail.model.CustomStoreModel;

import java.util.List;

public interface StoreDAO {
    List<CustomStoreModel> getAllStores();

    List<CustomStoreModel> getStoreByCode(String code);
}
