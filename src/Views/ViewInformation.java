package Views;

import Controllers.ControllerInformation;
import Models.ModelUser;
import Tools.NodeIniter;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class ViewInformation {
    private Group root;
    private Text titleInformation;
    private Label lblLogin, lblNom,lblPrenom,lblAdresse, lblCodePostal,lblVille,lblEmail, fieldLogin, fieldNom,fieldPrenom, fieldAdresse,fieldCodePostal, fieldVille, fieldEmail;;
    private Button btnRetour;
    private VBox vBoxMainContainer;
    private ModelUser modelUser;

    ViewInformation(Group root, ModelUser modelUser){
        this.root=root;
        this.modelUser=modelUser;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){

        titleInformation = NodeIniter.initTitle("Inscription");

        lblLogin = NodeIniter.initLabel("Login :");
        fieldLogin = NodeIniter.initText(modelUser.getLogin());

        lblNom = NodeIniter.initLabel("Nom :");
        fieldNom = NodeIniter.initText(modelUser.getNom());

        lblPrenom = NodeIniter.initLabel("Prenom :");
        fieldPrenom = NodeIniter.initText(modelUser.getPrenom());

        lblAdresse = NodeIniter.initLabel("Adresse :");
        fieldAdresse = NodeIniter.initText(modelUser.getAdresse());

        lblCodePostal = NodeIniter.initLabel("Code Postal :");
        fieldCodePostal = NodeIniter.initText(modelUser.getCodeVille());

        lblVille = NodeIniter.initLabel("Ville :");
        fieldVille = NodeIniter.initText(modelUser.getVille());

        lblEmail = NodeIniter.initLabel("E-Mail :");
        fieldEmail = NodeIniter.initText(modelUser.getAdresse());

        btnRetour = NodeIniter.initButton("RETOUR");

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
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerInformation controllerInformation){
        btnRetour.setOnMouseClicked(controllerInformation);
    }

    public Button getBtnRetour() {
        return btnRetour;
    }
}
