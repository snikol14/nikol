package controller;

import entity.Rol;
import Session.beans.RolFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "rolController")
@ViewScoped
public class RolController extends AbstractController<Rol> {

    public RolController() {
        // Inform the Abstract parent controller of the concrete Rol Entity
        super(Rol.class);
    }

}
