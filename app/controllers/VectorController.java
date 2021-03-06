package controllers;

import models.Vector;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;
import views.html.Vector.showVector;
import views.html.Vector.vector;

import javax.inject.Inject;

import static java.lang.Double.NaN;

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
        try {
            vectors.x1 = Double.parseDouble(vectorForm.data().get("x1"));
        }
        catch (NumberFormatException e){
            vectors.x1 = NaN;
        }
        try {
            vectors.y1 = Double.parseDouble(vectorForm.data().get("y1"));
        }
        catch (NumberFormatException e){
            vectors.y1 = NaN;
        }
        try {
            vectors.z1 = Double.parseDouble(vectorForm.data().get("z1"));
        }
        catch (NumberFormatException e){
            vectors.z1 = NaN;
        }
        try {
            vectors.x2 = Double.parseDouble(vectorForm.data().get("x2"));
        }
        catch (NumberFormatException e){
            vectors.x2 = NaN;
        }
        try {
            vectors.y2 = Double.parseDouble(vectorForm.data().get("y2"));
        }
        catch (NumberFormatException e){
            vectors.y2 = NaN;
        }
        try {
            vectors.z2 = Double.parseDouble(vectorForm.data().get("z2"));
        }
        catch (NumberFormatException e){
            vectors.z2 = NaN;
        }
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
