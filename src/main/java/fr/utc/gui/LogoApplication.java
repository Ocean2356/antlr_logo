package fr.utc.gui;

import fr.utc.utils.ResourceUtils;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LogoApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ResourceUtils.getResourceURL("/view/logoview.fxml"));
		Parent root = loader.load();
		LogoController controller = loader.getController();
		stage.setTitle("Logo Application");
		Scene scene = new Scene(root, 1200, 600);
		stage.setScene(scene);
		stage.getIcons().add(new Image(ResourceUtils.getResourceString("/icon/26411.png")));
		scene.getStylesheets().add(ResourceUtils.getResourceURL("/css/stylesheet.css").toExternalForm());

		stage.show();
		stage.setOnCloseRequest(evt -> controller.closeApplication());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
