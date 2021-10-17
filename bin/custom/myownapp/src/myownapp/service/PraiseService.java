package myownapp.service;

import myownapp.model.PraiseModel;

import java.util.List;

public interface PraiseService {
    List<PraiseModel> getAllPraises();
    PraiseModel getPraiseByOverlordId(String id);
}
