package Graphics.Main;

import java.io.IOException;

import Graphics.graphicsStart;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * This the the controller for MainMenu.fxml.
 * 
 * @author sfyock
 */
public class MainController {

	/** The Welcome Label for the main menu. */
	@FXML
	private Label welcomeLabel;

	/** This is to remember a previous source */
	@FXML
	private Node prevSource;

	/**
	 * The action event when you click the member options button.
	 * 
	 * @param event
	 */
	@FXML
	void onMemClick(ActionEvent event) {
		Stage s = new Stage();

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Members/MemberOptionsMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.setScene(new Scene(mainpane));
		s.setTitle("Member Options Menu");
		s.show();

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}

	/**
	 * The action event when you click the provider options button.
	 * 
	 * @param event
	 */
	@FXML
	void onProvClick(ActionEvent event) {
		Stage s = new Stage();

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader
					.load(graphicsStart.class.getResource("gui/Providers/ProviderOptionsMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.setScene(new Scene(mainpane));
		s.setTitle("Provider Options Menu");
		s.show();

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}

	/**
	 * The action event when you click the Report options button.
	 * 
	 * @param event
	 */
	@FXML
	void onRepClick(ActionEvent event) {
		Stage s = new Stage();

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Reports/ReportOptionsMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.setScene(new Scene(mainpane));
		s.setTitle("Report Options Menu");
		s.show();

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
	
	/**
	 * The action event when you click the Service Provider button.
	 * 
	 * @param event
	 */
	@FXML
	void onServClick(ActionEvent event) {
		Stage s = new Stage();

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Services/ServiceOptionsMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.setScene(new Scene(mainpane));
		s.setTitle("Service Menu");
		s.show();

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}

	/**
	 * The action event when you click the Service Provider Record button.
	 * 
	 * @param event
	 */
	@FXML
	void onSPRecordClick(ActionEvent event) {
		Stage s = new Stage();

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Services/ServiceProviderRecordMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		s.setScene(new Scene(mainpane));
		s.setTitle("SP Record");
		s.show();

		Node source = (Node) event.getSource();
		Stage stage = (Stage) source.getScene().getWindow();
		stage.close();
	}
	
	/**
	 * The action event when you click the Log Out button.
	 * 
	 * @param event
	 */
	@FXML
	void onLogOutClick(ActionEvent event) {

		Pane mainpane = null;
		try {
			mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Messages/AreYouSureMenu.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		Button buttonYes;
		buttonYes = (Button) mainpane.getChildren().get(0);
		onYesClick(buttonYes);

		Label label;
		label = (Label) mainpane.getChildren().get(2);
		setLogOutLabel(label);

		prevSource = (Node) event.getSource();

		Stage main = new Stage();
		main.setScene(new Scene(mainpane));
		main.setTitle("Log Out?");
		main.show();

	}

	/**
	 * This sets the label of the AreYouSureMenu.
	 * 
	 * @param l
	 */
	@FXML
	void setLogOutLabel(Label l) {
		l.setText("Are you sure you wish to Log Out?");
	}

	/**
	 * This sets up the onYesClick event handler of the AreYouSureMenu.
	 * 
	 * @param button
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@FXML
	void onYesClick(Button button) {
		button.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				Stage mainStage = (Stage) prevSource.getScene().getWindow();
				mainStage.close();

				Stage main = new Stage();
				Pane mainpane = null;
				try {
					mainpane = (Pane) FXMLLoader.load(graphicsStart.class.getResource("gui/Main/MainLogin.fxml"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				main.setScene(new Scene(mainpane));
				main.setTitle("Login");
				main.show();

				Node source = (Node) event.getSource();
				Stage stage = (Stage) source.getScene().getWindow();
				stage.close();

			}

		});

	}

}
