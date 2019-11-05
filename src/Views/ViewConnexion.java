package Views;

import Controllers.ControllerConnexion;
import Tools.NodeIniter;
import Tools.Paths;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class ViewConnexion {
    private Group root;
    private VBox titleConnexion;
    private TextField fieldLogin;
    private PasswordField fieldMdp;
    private Label lblLogin, lblMdp;
    private VBox vBoxMainContainer;
    private Button btnValider, btnRetour;

    ViewConnexion(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){

        titleConnexion = NodeIniter.initTitle(Paths.titleConnexion);

        lblLogin = NodeIniter.initLabel("Login :");
        fieldLogin = NodeIniter.initTextField();

        lblMdp = NodeIniter.initLabel("Mot de passe :");
        fieldMdp = NodeIniter.initPasswordField();

        btnValider = NodeIniter.initButton("Connexion");
        btnRetour = NodeIniter.initButton("Retour");

        addToVBox();

    }

    void addToVBox(){
        vBoxMainContainer = NodeIniter.initVBox();
        vBoxMainContainer.getChildren().add(titleConnexion);
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(NodeIniter.initLabelAndFieldHBox(lblMdp,fieldMdp));
        vBoxMainContainer.getChildren().add(btnValider);
        vBoxMainContainer.getChildren().add(btnRetour);
    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(NodeIniter.initBackground());
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerConnexion controllerConnexion){
        btnValider.setOnMouseClicked(controllerConnexion);
        btnRetour.setOnMouseClicked(controllerConnexion);
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public Button getBtnRetour() {
        return btnRetour;
    }

    public TextField getFieldLogin() {
        return fieldLogin;
    }

    public PasswordField getFieldMdp(){
        return fieldMdp;
    }
}
