module HelloJFx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.collections4;
    requires org.apache.commons.lang3;

    opens br.com.hellojfx.controllers to javafx.fxml;
    exports br.com.hellojfx;
}