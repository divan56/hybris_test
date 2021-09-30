package marketstrail.service;

import markettrail.model.CustomStoreModel;

import java.util.List;

public interface StoreService {
    List<CustomStoreModel> getAllStores();

    CustomStoreModel getStoreByCode(String code);

}
