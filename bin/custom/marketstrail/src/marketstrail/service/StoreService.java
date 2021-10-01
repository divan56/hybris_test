package marketstrail.service;

import markettrail.model.StoreModel;

import java.util.List;

public interface StoreService {
    List<StoreModel> getAllStores();

    StoreModel getStoreByCode(String code);

}
