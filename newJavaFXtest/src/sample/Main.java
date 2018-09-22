package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application { //繼承javafx.application.Application抽象類別

    @Override
    //JavaFX程式進入點
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));//載入fxml檔(UI介面)
        primaryStage.setTitle("井字遊戲");//設定視窗標題
        primaryStage.setScene(new Scene(root, 300, 275));//設定Stage要使用的Scene，並且用Scene()建構視窗長寬
        primaryStage.show();

    }

    /*
    public static void main(String[] args) {
        launch(args);//啟動獨立JavaFX應用程式
    }
    */



}
