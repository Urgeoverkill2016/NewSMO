package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    Stage window;
    TableView<Product> table;


    public static void main(String[] args) {
        launch(args);
    }



        // opens main Scene or Root inventory   Has exit button  Lists Parts and Products
        @Override
        public void start(Stage primaryStage) throws Exception{

            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            window = primaryStage;
            primaryStage.setTitle("Inventory Management System");

            // Product ID Column name

          TableColumn IDColumn = new TableColumn<>("Product ID Number");
           IDColumn.setMinWidth(200);
          IDColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));


            window.setOnCloseRequest(e -> {
                e.consume();
                closeProgram();
            });





            primaryStage.setScene(new Scene(root, 1000, 600));
            primaryStage.show();
            
        }


        List<Product> list = new ArrayList<>();

        ObservableList<Product> observableList =FXCollections.observableList(list);
        observableList.addListener(new ListChangeListener<Product>() {

            @Override
            public void onChanged(Change<? extends Product> c) {

            }
        });
        observableList.add(1);
        list.add(2);
        System.out.println("Size: " + observableList.size());



    // get existing products
        public ObservableList<Product> getProduct(){
            ObservableList<Product> product = FXCollections.observableArrayList();
            product.add(new Product(1));
            product.add(new Product(2));
            product.add(new Product(3));

            return  product;
            }
    private void closeProgram(){

        Boolean answer = ConfirmBox.display("Title", "Are you sure you want to Exit?");
        if(answer)
            window.close();
    }



}
