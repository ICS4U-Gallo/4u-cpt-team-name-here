package controllers;
import models.Quadratic;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Menu.*;
import views.html.Quadratic.*;

import javax.inject.Inject;

import static java.lang.Double.NaN;

public class QuadraticController extends Controller{
    @Inject
    FormFactory formFactory;

    static Quadratic quadNumbers = new Quadratic(0,0,0);

    public Result index(){
        return ok(index.render());
    }

    public Result quadratic(){
        Form<Quadratic> quadraticForm = formFactory.form(Quadratic.class);
        return ok(quadratic.render(quadNumbers, quadraticForm));
    }

    public Result save(){
        Form<Quadratic> quadraticForm = formFactory.form(Quadratic.class).bindFromRequest();
        try {
            quadNumbers.b = Double.parseDouble(quadraticForm.data().get("b"));
        }
        catch(NumberFormatException e){
            quadNumbers.b = NaN;
        }
        try {
            quadNumbers.a = Double.parseDouble(quadraticForm.data().get("a"));
        }
        catch (NumberFormatException e){
            quadNumbers.a = NaN;
        }
        try {
            quadNumbers.c = Double.parseDouble(quadraticForm.data().get("c"));
        }
        catch (NumberFormatException e){
            quadNumbers.c = NaN;
        }
        return redirect(routes.QuadraticController.quadratic());
    }

    public Result show(){
        return ok(showQuadratic.render(quadNumbers));
    }

    public Result solveX(){
        quadNumbers.solveX();
        return redirect(routes.QuadraticController.show());
    }
}
