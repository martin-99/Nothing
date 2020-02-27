package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Controller {
    @FXML
    TextArea urlInput;
   @FXML
    Label currentPrice;
   @FXML
   Label name;


    public void showResults() throws IOException {
        String url = urlInput.getText();
        Document document = Jsoup.connect(url).get();
        Element productName = document.getElementById("title");
        Element price = document.getElementById("priceblock_ourprice");
        name.setText("Name: "+ productName.text());
        currentPrice.setText("Price: "+price.text());

    }




}
