package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TableView<Table> table;

    @FXML
    private TableColumn<Table, String> col1, col2;

    @FXML
    private MenuItem exportItem;

    @FXML
    private MenuItem importItem;


    @FXML
    void excelImport(ActionEvent event) throws IOException {
// How i import xlsx or csv file only 2 column
    }

    @FXML
    void excelExport(ActionEvent event) throws IOException {
// How i export existing table's 2 column values xlsx or csv file
    }


    ObservableList<Table> list = FXCollections.observableArrayList(
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye"),
            new Table("hello", "bye")
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // TableView

        col1.setCellValueFactory(new PropertyValueFactory<Table, String>("col1"));
        col2.setCellValueFactory(new PropertyValueFactory<Table, String>("col2"));

        table.setItems(list);

    }

}
