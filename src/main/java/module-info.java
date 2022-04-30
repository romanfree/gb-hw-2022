module ru.gb.gbhw2022 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.gbhw2022 to javafx.fxml;
    exports ru.gb.gbhw2022;
}