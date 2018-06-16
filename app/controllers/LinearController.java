package controllers;
import models.Linear;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Menu.*;

import javax.inject.Inject;

import static java.lang.Double.NaN;

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
        try {
            equation.x = Double.parseDouble(linearForm.data().get("x"));
        }
        catch(NumberFormatException e){
            equation.x = NaN;
        }
        try {
            equation.y = Double.parseDouble(linearForm.data().get("y"));
        }
        catch(NumberFormatException e){
            equation.y = NaN;
        }
        try {
            equation.b = Double.parseDouble(linearForm.data().get("b"));
        }
        catch(NumberFormatException e){
            equation.b = NaN;
        }
        try {
            equation.m = Double.parseDouble(linearForm.data().get("m"));
        }
        catch(NumberFormatException e){
            equation.m = NaN;
        }
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
