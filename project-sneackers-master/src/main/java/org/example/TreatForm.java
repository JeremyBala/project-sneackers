package org.example;

import org.example.core.Template;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class TreatForm {

    public String treatForm(Request request, Response response){



        Map<String, Object> model = new HashMap<>();
        model.put("items", App.homeSystem.getItems());
        return Template.render("treatForm.html", model);
    }
}
