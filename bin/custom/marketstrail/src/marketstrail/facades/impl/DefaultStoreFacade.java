package marketstrail.facades.impl;

import de.hybris.platform.core.model.product.ProductModel;
import marketstrail.data.ElectronicData;
import marketstrail.data.StoreData;

import marketstrail.facades.StoreFacade;
import marketstrail.service.StoreService;
import markettrail.jalo.Store;
import markettrail.model.ElectronicModel;
import markettrail.model.StoreModel;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;

public class DefaultStoreFacade implements StoreFacade {
    private StoreService storeService;

    @Override
    public List<StoreData> getStores() {
       List<StoreModel> storeModels = storeService.getAllStores();
       List<StoreData>  storeFacadeData = new ArrayList<>();

       for(StoreModel sm : storeModels){
           final StoreData sd = new StoreData();
           sd.setCode(sm.getCode());
           sd.setName(sm.getName());
           sd.setEmployees(sm.getEmployees());
           sd.setLocation(sm.getLocation());
           storeFacadeData.add(sd);
       }
         return storeFacadeData;
    }

    @Override
    public StoreData getStoreByCode(String code) {
        if(code == null) {
            throw new IllegalArgumentException("Name can't be null");
        }

        final StoreModel storeModel = storeService.getStoreByCode(code);
        if(storeModel == null) {
            return null;
        }
        List<ElectronicData> electronicDataList = new ArrayList<>();
        if(storeModel.getProducts() != null) {
            for (ElectronicModel eld : storeModel.getProducts()) {
                final ElectronicData ed = new ElectronicData();
                ed.setName(eld.getName());
                ed.setPrice(Integer.valueOf(eld.getPrice()));
                ed.setCategory(String.valueOf(eld.getSegmentType()));
                electronicDataList.add(ed);
            }
        }
            final StoreData storeData = new StoreData();
            storeData.setName(storeModel.getName());
            storeData.setCode(storeModel.getCode());
            storeData.setLocation(storeModel.getLocation());
            storeData.setEmployees(storeModel.getEmployees());
            storeData.setProducts(electronicDataList);

            return storeData;
    }

    @Required
    public void setStoreService(StoreService storeService) {
        this.storeService = storeService;
    }
}
