package myownapp.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import myownapp.daos.PraiseDAO;
import myownapp.model.PraiseModel;

import java.util.List;

public class DefaultPraiseDAO implements PraiseDAO {
   private FlexibleSearchService flexibleSearchService;

    @Override
    public List<PraiseModel> getAllPraises() {
        String queryString = "SELECT {p: " + PraiseModel.PK + " }" +
                " FROM {" + PraiseModel._TYPECODE + " AS p} ";
        FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        return flexibleSearchService.<PraiseModel> search(query).getResult();
    }

    @Override
    public List<PraiseModel> getPraiseByOverlordId(String id) {
        String queryString = "SELECT {p: " + PraiseModel.PK + " }" +
                " FROM {" + PraiseModel._TYPECODE + " AS p} " +
                " WHERE {p: " + PraiseModel.OVERLORDID + "}?=id";
        FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
        query.addQueryParameter("id", id);
        return flexibleSearchService.<PraiseModel> search(query).getResult();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
