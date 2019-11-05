package Views;

import Controllers.ControllerInformation;
import Models.User;
import Tools.NodeIniter;
import Tools.Paths;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class ViewInformation {
    private Group root;
    private VBox titleInformation;
    private Label lblLogin, lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail, fieldLogin, fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;;
    private Button btnRetour;
    private VBox vBoxMainContainer;
    private User user;

    ViewInformation(Group root, User user){
        this.root=root;
        this.user = user;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){

        titleInformation = NodeIniter.initTitle(Paths.titleInformation);

        lblLogin = NodeIniter.initLabel(Paths.lblLogin);
        fieldLogin = NodeIniter.initText(user.getLogin());

        lblNom = NodeIniter.initLabel(Paths.lblNom);
        fieldNom = NodeIniter.initText(user.getNom());

        lblPrenom = NodeIniter.initLabel(Paths.lblPrenom);
        fieldPrenom = NodeIniter.initText(user.getPrenom());

        lblAdresse = NodeIniter.initLabel(Paths.lblAdresse);
        fieldAdresse = NodeIniter.initText(user.getAdresse());

        lblCodePostal = NodeIniter.initLabel(Paths.lblCodeVille);
        fieldCodePostal = NodeIniter.initText(user.getCodeVille());

        lblVille = NodeIniter.initLabel(Paths.lblVille);
        fieldVille = NodeIniter.initText(user.getVille());

        lblEmail = NodeIniter.initLabel(Paths.lblEMail);
        fieldEmail = NodeIniter.initText(user.getAdresse());

        btnRetour = NodeIniter.initButton(Paths.btnRetour);

        initVBox();

    }

    void initVBox(){
        vBoxMainContainer = NodeIniter.initVBox();
        vBoxMainContainer.getChildren().add(titleInformation);
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblNom,fieldNom));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblPrenom,fieldPrenom));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblAdresse,fieldAdresse));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblCodePostal,fieldCodePostal));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblVille,fieldVille));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndTextHBox(lblEmail,fieldEmail));
        vBoxMainContainer.getChildren().add(btnRetour);
    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(NodeIniter.initBackground());
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerInformation controllerInformation){
        btnRetour.setOnMouseClicked(controllerInformation);
    }

    public Button getBtnRetour() {
        return btnRetour;
    }
}
