package com.example.comp1011200489011test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private TextField search;

    @FXML
    private TableColumn<Song, String> Performer;

    @FXML
    private TableColumn<Song, String> Title;

    @FXML
    private TableColumn<Song, LocalDate> Week;

    @FXML
    private TableColumn<Song, Integer> Position;

    @FXML
    private TableColumn<Song, String> URL;

    @FXML
    private TableView<Song> tableView;

    @FXML
    private Label songShowing;

    @Override
    public void initialize(java.net.URL location, ResourceBundle resources) {

        Song song = new Song();
        // Configure the column of the tables to know where to get the data from the laptop object
        Performer.setCellValueFactory(new PropertyValueFactory<>(song.performer));
        Title.setCellValueFactory(new PropertyValueFactory<>(song.songTitle));
        Week.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(song.getWeek())));
        Position.setCellValueFactory(new PropertyValueFactory<>(String.valueOf(song.weekPosition)));
        URL.setCellValueFactory(new PropertyValueFactory<>(song.url));
        tableView.getItems().addAll(Utility.getSongsFromJSONFile("ChristmasSongs.json"));
        songShowing.setText("Songs Showing: " + String.valueOf(tableView.getItems().size()));
    }
}
