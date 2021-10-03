package myownapp.daos;

import myownapp.model.OverlordModel;

import java.util.List;

public interface OverlordDAO {
    List<OverlordModel> getAllOverlords();

    List<OverlordModel> getOverlordById(String id);
}
