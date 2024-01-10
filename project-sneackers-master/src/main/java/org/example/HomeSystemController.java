package org.example;

import org.example.core.Template;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class HomeSystemController {

    //Afficher le contenu du html
    public String list(Request request, Response response){


        Map<String, Object> model = new HashMap<>();
        //model.put("items", App.homeSystem.getItems());
        return Template.render("home.html", model);
    }
}
