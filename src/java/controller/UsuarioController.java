package controller;

import entity.Usuario;
import Session.beans.UsuarioFacade;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "usuarioController")
@ViewScoped
public class UsuarioController extends AbstractController<Usuario> {

    public UsuarioController() {
        // Inform the Abstract parent controller of the concrete Usuario Entity
        super(Usuario.class);
    }

}
