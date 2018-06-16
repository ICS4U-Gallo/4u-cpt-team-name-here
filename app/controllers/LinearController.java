    package controllers;
import models.Linear;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Menu.*;

import javax.inject.Inject;

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
        equation.x = Double.parseDouble(linearForm.data().get("x"));
        equation.y = Double.parseDouble(linearForm.data().get("y"));
        equation.b = Double.parseDouble(linearForm.data().get("b"));
        equation.m = Double.parseDouble(linearForm.data().get("m"));
        return redirect(routes.LinearController.linear());
    }

    public Result show(){
        return ok(show.render(equation));
    }

    public Result solveM(){
        equation.solveM();
        return redirect(routes.LinearController.show());
    }
    public Result solveB(){
        equation.solveB();
        return redirect(routes.LinearController.show());
    }

}
