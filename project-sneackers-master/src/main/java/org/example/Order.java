package org.example;

import org.example.core.Template;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    public String order(Request request, Response response){
        /*
        //Pour récupérer l'id // mettre -1 à cause du velocity
        String idParam = request.params(":id");
        int index = Integer.parseInt(idParam) - 1;

        List<Item> items = App.homeSystem.getItems();
        Item item = items.get(index);*/

        Map<String, Object> model = new HashMap<>();
        return Template.render("order.html", model);
    }
}
