package com.ratedplate.controller.admin;

import com.ratedplate.model.*;
import com.ratedplate.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SteveGreen on 05/09/15.
 */
@Controller
public class SetupTestObjects {


    @Autowired UserService userService;
    @Autowired PlateService plateService;
    @Autowired EstablishmentService establishmentService;
    @Autowired PlateRatingService plateRatingService;
    @Autowired EstabRatingService estabRatingService;

    @RequestMapping(value= "/setup")
    public ModelAndView setupTestObjects(){

        List<Object> setupObjects = new ArrayList<Object>();

        //add user to db
        User user = new User("SomeName", "someOther");
        Establishment estab = new Establishment("ANewEstab", "Norwich", 90, 90);
        Plate plate = new Plate("A new plate");
        PlateRating platerating = new PlateRating("A rating for a plate");
        EstabRating estabRating = new EstabRating("An estab rating");
        try {
            userService.addUserToDatabase(user);
            establishmentService.addEstabToDatabase(estab);
            plateService.addPlateToDatabase(plate);
            plateRatingService.addPlateRatingToDatabase(platerating);
            estabRatingService.addEstabRatingToDatabase(estabRating);
        } catch (Exception e) {
            e.printStackTrace();
        }

         List<User> users = userService.getAllUsers();
        List<Plate> plates = plateService.getAllPlates();
        List<Establishment> estabs = establishmentService.getAllEstablishments();
//        List<PlateRating> plateratings = plateRatingService.getAllPlateratings();
//        List<EstabRating> estabratings = estabRatingService.getAllEstabRatings();



        ModelAndView mav = new ModelAndView("setupPage");
        mav.addObject("Users", users);
        mav.addObject("Plates", plates);
        mav.addObject("Estabs", estabs);

        System.out.println(mav.toString());
        return mav;
    }

}
