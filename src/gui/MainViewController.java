package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("Item About");
	}
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
