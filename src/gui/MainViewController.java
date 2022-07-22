package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartament;
	@FXML
	private MenuItem menuItemAbout;
	
	//method
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("Item Selles");
	}
	@FXML
	public void onMenuItemDepartamentAction() {
		System.out.println("Item Departament");
	}
	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/about.fxml");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		}
	private synchronized void loadView(String absolute) {
		try {
		FXMLLoader loader  = new FXMLLoader(getClass().getResource(absolute));
		VBox newVbox = loader.load();
		Scene mainScene = Main.getMainScene();
		VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
		
		Node mainMenu = mainVbox.getChildren().get(0);
		mainVbox.getChildren().clear();
		mainVbox.getChildren().add(mainMenu);
		mainVbox.getChildren().addAll(newVbox.getChildren());
		
		}catch(IOException e) {
			Alerts.showAlerts("IOException ", "error Loading view",e.getMessage(), AlertType.ERROR);
			
		}
	}

}
