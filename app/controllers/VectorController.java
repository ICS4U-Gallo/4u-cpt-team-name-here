package controllers;

import models.Vector;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Vector.showVector;
import views.html.Vector.vector;

import javax.inject.Inject;

public class VectorController extends Controller {
    @Inject
    FormFactory formFactory;

    static Vector vectors = new Vector(0,0,0,0,0,0);

    public Result vector (){
        Form<Vector> vectorForm = formFactory.form(Vector.class);
        return ok(vector.render(vectors, vectorForm));
    }
    public Result save(){
        Form<Vector> vectorForm = formFactory.form(Vector.class).bindFromRequest();
        vectors.x1 = Integer.parseInt(vectorForm.data().get("x1"));
        vectors.y1 = Integer.parseInt(vectorForm.data().get("y1"));
        vectors.z1 = Integer.parseInt(vectorForm.data().get("z1"));
        vectors.x2 = Integer.parseInt(vectorForm.data().get("x2"));
        vectors.y2 = Integer.parseInt(vectorForm.data().get("y2"));
        vectors.z2 = Integer.parseInt(vectorForm.data().get("z2"));
        return redirect(routes.VectorController.vector());
    }

    public Result show(){
        return ok(showVector.render(vectors));
    }

    public Result dotProduct(){
        vectors.dotProduct();
        return redirect(routes.VectorController.show());
    }
    public Result crossProduct(){
        vectors.crossProduct();
        return redirect(routes.VectorController.show());
    }
}
