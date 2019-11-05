package Controllers;

import Models.Form;
import Models.User;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;


public class ControllerInscription implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private User user;
    private Form form;

    public ControllerInscription(ViewHandler launcher, User user){
        this.launcher=launcher;
        this.user = user;

        this.launcher.setEventHandlerInscription(this);

        form = new Form(this.launcher.getViewInscription().getListTextField(),this.launcher.getViewInscription().getBtnValider());
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewInscription().getBtnValider())){
                user.initUser(launcher.getViewInscription().getListTextField());
                launcher.launchViewConnexion();
        }

        if(mouseEvent.getSource().equals(launcher.getViewInscription().getBtnExit())){
            launcher.getPrimaryStage().close();
        }
    }



}
