package myownapp.service;

import myownapp.model.OverlordModel;

import java.util.List;

public interface OverlordService {
    List<OverlordModel> getAllOverlords();

    OverlordModel getOverlordById(String id);
}
