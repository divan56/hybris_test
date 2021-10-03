package myownapp.facade;

import myownapp.data.OverlordData;

import java.util.List;

public interface OverlordFacade {
    List<OverlordData> getAllOverlords();

    OverlordData getOverlordById(String id);
}
