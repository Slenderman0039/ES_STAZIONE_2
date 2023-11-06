package controller;
import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public class UserController {
    public void startServices() {
        get("/", (req, res) -> "System is working");
        /*Fare lo stesso con stanze etcc
        get("/products" , (req,res)->{
            List<Prodotto> userResult = ProdottoService.getInstance().findAll();
            HttpResponse hr = new HttpResponse("200",new Gson().toJsonTree(userResult),"Lista prodotti");
            return new Gson().toJson(hr);
        });
    */
    }
}
