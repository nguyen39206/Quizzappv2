module com.pnkn.quizzappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.pnkn.quizzappv2 to javafx.fxml;
    exports com.pnkn.quizzappv2;
}
