package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.io.IOException;

import javafx.event.ActionEvent;

public class AfterLogInController {
	@FXML
	private Button logoutbutton;

	@FXML
	private Button savebutton;
	
	@FXML
	private Label wrongReset;
	
	@FXML
	private PasswordField factorypassword;
	
	@FXML
	private PasswordField newpassword ;
	
	@FXML
	private PasswordField reenterpassword;
	
	 public void userSave (ActionEvent event) throws IOException {
	        checkReset();

	    }
	 // Remember to bind checkReset to save button
	 private void checkReset() throws IOException {
	 
	        if(factorypassword.getText().equals("123")){
	        	if(newpassword.getText().equals(reenterpassword.getText())){
	        		wrongReset.setText("Your password has been reset successfully!" );
	        	}
	        	else wrongReset.setText("Your re-enter password is not match!");
	        }
	        else wrongReset.setText("Your factory password is not correct!");
	 }
	    public void userLogOut(ActionEvent event) throws IOException {
	        Main m = new Main();
	        m.changeScene("LogIn.fxml");

	    }
}
