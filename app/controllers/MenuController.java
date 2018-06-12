package controllers;
import play.mvc.*;
import views.html.Menu.*;
public class MenuController extends Controller {
    public Result index(){
        return ok(index.render());
    }

    public Result linear(){
        return ok(linear.render());
    }
}
