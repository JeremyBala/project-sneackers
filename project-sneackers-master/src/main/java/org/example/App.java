package org.example;

import org.example.core.Conf;
import org.example.core.Template;
import org.example.middlewares.LoggerMiddleware;
import spark.Spark;

import java.util.HashMap;

public class App {

    public static HomeSystem homeSystem;
    public static void main(String[] args) {
        initialize();

        homeSystem = new HomeSystem();

        Sneakers sneakers = new Sneakers();
        sneakers.setBrand("Nike");
        sneakers.setSneakersSize(42);
        homeSystem.addItem(sneakers);

        sneakers = new Sneakers();
        sneakers.setBrand("Adidas");
        sneakers.setSneakersSize(43);
        homeSystem.addItem(sneakers);

        Socks socks = new Socks();
        socks.setBrand("Artengo");
        socks.setSocksSize(41);
        homeSystem.addItem(socks);

        //Affiche le contenu du html
        HomeSystemController homeSystemController = new HomeSystemController();
        Order order = new Order();
        Dashboard dashboard = new Dashboard();


        Spark.get("/", (req, res) -> homeSystemController.list(req, res));
        Spark.get("/order/:id", (req, res) -> order.order(req, res));
        Spark.get("/dashboard/:id", (req, res) -> dashboard.dashboard(req, res));


        // Route pour traiter le formulaire
        Spark.post("/treatForm", (req, res) -> {
            String marque = req.queryParams("marque");
            String sneakersSize = req.queryParams("taille");
            String marqueSockets = req.queryParams("marque");
            String socketsSize = req.queryParams("taille");

            // Faites quelque chose avec les données, par exemple imprimez-les
            System.out.println("Marque : " + marque);
            System.out.println("Size : " + sneakersSize);
            System.out.println("Taille : " + marqueSockets);
            System.out.println("Taille : " + socketsSize);

            // Vous pouvez également rediriger l'utilisateur vers une autre page
            res.redirect("/confirmation");

            return null;
        });

        // Route de confirmation
        Spark.get("/confirmation", (req, res) -> {
            return "Formulaire traité avec succès ! Merci.";
        });
    }

    static void initialize() {
        Template.initialize();

        // Display exceptions in logs
        Spark.exception(Exception.class, (e, req, res) -> e.printStackTrace());

        // Serve static files (img/css/js)
        Spark.staticFiles.externalLocation(Conf.STATIC_DIR.getPath());

        // Configure server port
        Spark.port(Conf.HTTP_PORT);
        final LoggerMiddleware log = new LoggerMiddleware();
        Spark.before(log::process);
    }
}
