package controllers;
import models.Linear;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Menu.*;

import javax.inject.Inject;
import java.util.Set;

public class LinearController extends Controller {
    @Inject
    FormFactory formFactory;

    static Linear equation = new Linear(0,0,0,0);

    public Result index(){
        return ok(index.render());
    }

    public Result linear(){
        Form<Linear> linearForm = formFactory.form(Linear.class);
        return ok(linear.render(equation, linearForm));
    }

    public Result save(){
        Form<Linear> linearForm = formFactory.form(Linear.class).bindFromRequest();
        equation.x = Integer.parseInt(linearForm.data().get("x"));
        equation.y = Integer.parseInt(linearForm.data().get("y"));
        equation.b = Integer.parseInt(linearForm.data().get("b"));
        equation.m = Integer.parseInt(linearForm.data().get("m"));
        return redirect(routes.LinearController.linear());
    }

    public Result show(){
        return ok(show.render(equation));
    }

    public Result solveM(){
        equation.solveM();
        return redirect(routes.LinearController.show());
    }

}
