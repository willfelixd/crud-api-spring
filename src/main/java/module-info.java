module com.br.will.crudapispring {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.br.will.crudapispring to javafx.fxml;
    exports com.br.will.crudapispring;
}