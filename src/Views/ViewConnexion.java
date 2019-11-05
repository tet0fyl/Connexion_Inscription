package Views;

import Controllers.ControllerConnexion;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class ViewConnexion {
    private Group root;
    private TextField fieldLogin;
    private PasswordField fieldMdp;
    private Text titleConnexion;
    private Label lblLogin, lblMdp;
    private VBox vBoxMainContainer;
    private Button btnValider;

    ViewConnexion(Group root){
        this.root=root;

        initElementOfTheView();

        clearAndInitRoot();
    }

    void initElementOfTheView(){
        vBoxMainContainer=new VBox();

        titleConnexion = initTitle("Inscription");

        lblLogin = initLabel("Login :");
        fieldLogin = initTextField();

        lblMdp = initLabel("Mot de passe :");
        fieldMdp = initPasswordField();

        btnValider = initButton("Connexion");

        initVBox();

    }

    javafx.scene.control.Button initButton(String text){
        javafx.scene.control.Button b = new javafx.scene.control.Button(text);
        return b;
    }

    Text initTitle(String text){
        Text t = new Text(text);

        return t;
    }

    javafx.scene.control.Label initLabel(String txt){
        javafx.scene.control.Label l = new javafx.scene.control.Label(txt);
        l.setMinWidth(ViewHandler.squareSizeScene/3);
        l.setAlignment(Pos.BOTTOM_RIGHT);
        return l;
    }

    javafx.scene.control.TextField initTextField(){
        javafx.scene.control.TextField tf = new javafx.scene.control.TextField();
        tf.setMinWidth(ViewHandler.squareSizeScene/3);
        tf.setAlignment(Pos.BOTTOM_LEFT);
        return tf;
    }

    PasswordField initPasswordField(){
        PasswordField pf = new PasswordField();
        pf.setMinWidth(ViewHandler.squareSizeScene/3);
        pf.setAlignment(Pos.BOTTOM_LEFT);
        return pf;
    }

    HBox initLabelAndField(javafx.scene.control.Label label, javafx.scene.control.TextField field){
        HBox hbox = new HBox();
        hbox.getChildren().add(label);
        hbox.getChildren().add(field);
        hbox.setAlignment(Pos.CENTER);
        hbox.setMinWidth(ViewHandler.squareSizeScene);
        return hbox;
    }

    void initVBox(){
        vBoxMainContainer.setMinWidth(ViewHandler.squareSizeScene);
        vBoxMainContainer.setAlignment(Pos.CENTER);
        vBoxMainContainer.getChildren().add(titleConnexion);
        vBoxMainContainer.getChildren().add(initLabelAndField(lblLogin,fieldLogin));
        vBoxMainContainer.getChildren().add(initLabelAndField(lblMdp,fieldMdp));
        vBoxMainContainer.getChildren().add(btnValider);
    }

    void clearAndInitRoot(){
        root.getChildren().clear();
        root.getChildren().add(vBoxMainContainer);
    }

    void setEvents(ControllerConnexion controllerConnexion){
        btnValider.setOnMouseClicked(controllerConnexion);
    }

    public Button getBtnValider() {
        return btnValider;
    }

    public TextField getFieldLogin() {
        return fieldLogin;
    }

    public PasswordField getFieldMdp(){
        return fieldMdp;
    }
}
