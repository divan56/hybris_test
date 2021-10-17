package myownapp.daos;

import myownapp.model.PraiseModel;

import java.util.List;

public interface PraiseDAO {
    List<PraiseModel> getAllPraises();
    List<PraiseModel> getPraiseByOverlordId(String id);
}
