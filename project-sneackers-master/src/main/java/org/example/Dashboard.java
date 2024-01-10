package org.example;

import org.example.core.Template;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class Dashboard {
    public String dashboard(Request request, Response response){



        Map<String, Object> model = new HashMap<>();
        model.put("items", App.homeSystem.getItems());
        return Template.render("dashboard.html", model);
    }
}
