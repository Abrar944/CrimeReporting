 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crimereporting;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LogInController implements Initializable {


 @FXML
    private AnchorPane parent;

    @FXML
    private TextField username;

    @FXML
    private PasswordField userpassword;

    @FXML
    private Button forgetpassword;

    @FXML
    private Button register;
    @FXML
    private ImageView img;

    @FXML
    void forget(ActionEvent event) {

    }

    void regis(ActionEvent event) throws IOException {
try{
    FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Register.fxml"));
    Parent root1 = (Parent)fxmlloader.load();
    Stage stage = new Stage();
    stage.setTitle("Register");
    stage.setScene(new Scene(root1));
    stage.show();
}
catch (Exception e)
{
  System.out.print("Can't load fxml file");
}

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void register(ActionEvent event) {
    try{
    FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Register.fxml"));
    Parent root1 = (Parent)fxmlloader.load();
    Stage stage = new Stage();
    stage.setTitle("Register");
    stage.setScene(new Scene(root1));
    stage.show();
}
catch (Exception e)
{
    System.out.println("Can't load fxml file");
}
    }

        
    

   
     // Initializes the controller class.
     
}

