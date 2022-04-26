package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    DatePicker tgl_registrasi;

    @FXML
    ComboBox<String> jenis_ac;

    @FXML
    TextField nama_barang;

    @FXML
    TextField harga_barang;

    @FXML
    TextField stok_barang;

    @FXML
    Button btn_simpan;

    @FXML
    public void initialize() {
        this.jenis_ac.getItems().addAll(
            "Split Wall",
            "Sentral",
            "Standing Floor",
            "Inverter",
            "Cassette",
            "Window"
        );
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
