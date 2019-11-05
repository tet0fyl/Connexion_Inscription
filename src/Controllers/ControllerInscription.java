package Controllers;

import Models.Form;
import Models.ModelUser;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerInscription implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private ModelUser modelUser;
    private Form form;

    public ControllerInscription(ViewHandler launcher, ModelUser modelUser){
        this.launcher=launcher;
        this.modelUser=modelUser;

        this.launcher.setEventHandlerInscription(this);

        form = new Form(this.launcher.getViewInscription().getListTextField(),this.launcher.getViewInscription().getBtnValider());
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        System.out.println(launcher.getViewInscription().getBtnValider().isArmed());

        if(mouseEvent.getSource().equals(launcher.getViewInscription().getBtnValider()) && form.getBtnValidation().isArmed()){
                modelUser.initUser(launcher.getViewInscription().getListTextField());
                launcher.launchViewConnexion();
        }
    }



}
