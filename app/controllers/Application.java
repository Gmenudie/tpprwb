package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {

    public static Result index() {
        return status(488,	"Strange response type");	
    }

     public static Result show() {
        return ok(show.render("This is sparta! (and my application also)", "(BTE) Best Title Ever"));	
    }
    public static Result display() {
        return ok(display.render(Item.page()));	
    }

   /* public	static Result hello(String name)	{	
		return redirect(controllers.routes.Application.show(name+" is tested"));	
	}*/	

}
