package Controllers;

import Models.Form;
import Models.User;
import Views.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class ControllerConnexion implements EventHandler<MouseEvent> {
    private ViewHandler launcher;
    private User user;
    private Form form;

    public ControllerConnexion(ViewHandler launcher, User user){
        this.launcher=launcher;
        this.user = user;

        this.launcher.setEventHandlerConnexion(this);

        form = new Form(this.launcher.getViewConnexion().getListTextFiled(),this.launcher.getViewConnexion().getBtnValider());

    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        if(mouseEvent.getSource().equals(launcher.getViewConnexion().getBtnValider())){

            String txtLogin = launcher.getViewConnexion().getFieldLogin().getText();
            String txtMdp = launcher.getViewConnexion().getFieldMdp().getText();

            if(user.connection(txtLogin,txtMdp)){
                launcher.launchViewInformation();
            }else {
                this.launcher.getViewConnexion().setErrorMsgArea("Mauvais Login ou Mot de Passe !");
            }
        }
        if(mouseEvent.getSource().equals(launcher.getViewConnexion().getBtnRetour())){
            launcher.launchViewInscription();
        }
    }
}
