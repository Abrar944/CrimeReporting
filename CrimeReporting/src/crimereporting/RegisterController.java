/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimereporting;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


/**
 * FXML Controller class
 *
 * @author Admin
 */
public class RegisterController implements Initializable {
 @FXML
    private AnchorPane Parent1;

    @FXML
    private ImageView img;

    @FXML
    private TextField Firstname;

    @FXML
    private TextField Lastname;

    @FXML
    private TextField mailid;

    @FXML
    private TextField number;

    @FXML
    private TextField cardid;

    @FXML
    private PasswordField password2;

    @FXML
    private PasswordField newPassword;

    @FXML
    private Button sumbit;

    @FXML
    void submit(ActionEvent event) {

    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
