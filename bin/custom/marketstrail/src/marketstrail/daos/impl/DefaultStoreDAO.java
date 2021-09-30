package marketstrail.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import marketstrail.daos.StoreDAO;
import markettrail.model.CustomStoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component(value = "storeDAO")
public class DefaultStoreDAO implements StoreDAO {

    @Autowired
  private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomStoreModel> getAllStores() {
        final String queryString = "SELECT {p:" + CustomStoreModel.PK + "} "//
                + "FROM {" + CustomStoreModel._TYPECODE + " AS p} ";
      final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<CustomStoreModel> search(query).getResult();
    }

    @Override
    public List<CustomStoreModel> getStoreByCode(String code) {
        final String queryString = "SELECT {p:" +CustomStoreModel.PK + "}"
                + "FROM {" + CustomStoreModel._TYPECODE + " AS p}"
                + "WHERE {p:" + CustomStoreModel.CODE + "}=?code ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("code", code);
        return flexibleSearchService.<CustomStoreModel>search(query).getResult();
    }
}
