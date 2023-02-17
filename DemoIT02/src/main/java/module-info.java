module com.pta.demoit02 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pta.demoit02 to javafx.fxml;
    exports com.pta.demoit02;
}
