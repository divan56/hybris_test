package myownapp.facade.impl;

import myownapp.data.OverlordData;
import myownapp.data.PlanetData;
import myownapp.facade.OverlordFacade;
import myownapp.model.OverlordModel;
import myownapp.model.PlanetModel;
import myownapp.service.OverlordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DefaultOverlordFacade implements OverlordFacade {
    @Autowired
   private OverlordService overlordService;

    @Override
    public List<OverlordData> getAllOverlords() {
        List<OverlordModel> overlordModels = overlordService.getAllOverlords();
        List<OverlordData> overlordsData = new ArrayList<>();
        if (overlordModels == null) {
            return null;
        }

        for (OverlordModel om : overlordModels) {
            OverlordData od = new OverlordData();
            Set<PlanetModel> planets = om.getPlanets();
            Set<PlanetData> planetsData = new HashSet<>();

            for (PlanetModel pm : planets) {
                PlanetData pd = new PlanetData();
                pd.setAge(pm.getAge());
                pd.setId(pm.getId());
                pd.setName(pm.getName());
                pd.setType(String.valueOf(pm.getPlanetType()));
                planetsData.add(pd);
            }
            od.setId(om.getId());
            od.setName(om.getName());
            od.setAge(om.getAge());
            od.setPower(om.getPower());
            od.setPlanets(planetsData);
            overlordsData.add(od);
        }
        return overlordsData;
    }

    @Override
    public OverlordData getOverlordById(String id) {
        OverlordModel overlord = overlordService.getOverlordById(id);
        OverlordData overlordData = new OverlordData();

        overlordData.setId(overlord.getId());
        overlordData.setName(overlord.getName());
        overlordData.setPower(overlord.getPower());
        overlordData.setAge(overlord.getAge());

        Set<PlanetData> planetsData = new HashSet<>();
        for (PlanetModel pm : overlord.getPlanets()) {
            PlanetData pd = new PlanetData();
            pd.setAge(pm.getAge());
            pd.setId(pm.getId());
            pd.setName(pm.getName());
            pd.setType(String.valueOf(pm.getPlanetType()));
            planetsData.add(pd);
        }
        overlordData.setPlanets(planetsData);
        return overlordData;
    }

    @Required
    public void setOverlordService(OverlordService overlordService) {
        this.overlordService = overlordService;
    }
}
