package myownapp.controller;

import myownapp.data.OverlordData;
import myownapp.facade.OverlordFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller
public class OverlordController {
    @Autowired
    private OverlordFacade overlordFacade;
    @RequestMapping("/overlords")
    public String showAllOverlords(Model model) {
        List<OverlordData> overlords = overlordFacade.getAllOverlords();
        model.addAttribute("overlords", overlords);
        return "OverlordList";
    }
    @RequestMapping("/overlords/{overlordId}")
    public String showOverlordDetails(@PathVariable final String overlordId, final Model model) throws UnsupportedEncodingException {
        final String decodedId = URLDecoder.decode(overlordId, "UTF-8");
        final OverlordData overlordData = overlordFacade.getOverlordById(decodedId);
        model.addAttribute("overlord", overlordData);
        return "OverlordDetails";
    }
}
