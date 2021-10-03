package myownapp.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import myownapp.daos.OverlordDAO;
import myownapp.model.OverlordModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class DefaultOverlordDAO implements OverlordDAO {

    @Autowired
    FlexibleSearchService flexibleSearchService;

    @Override
    public List<OverlordModel> getAllOverlords() {
        String queryString = "SELECT {p: " + OverlordModel.PK + " }" +
                " FROM {" + OverlordModel._TYPECODE + " AS p} ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<OverlordModel> search(query).getResult();
    }

    @Override
    public List<OverlordModel> getOverlordById(String id) {
        String queryString = "SELECT {p: " + OverlordModel.PK + " }" +
                " FROM {" + OverlordModel._TYPECODE + " AS p} "
                + "WHERE " + "{p:" + OverlordModel.ID + "}=?id ";
        final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("id", id);
        return flexibleSearchService.<OverlordModel> search(query).getResult();
    }
}
