package main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class App {

	public static void main(String[] args) throws IOException {
			
		String URL=JOptionPane.showInputDialog("Digite a url que deseja extrair a informação!");
		Document doc = Jsoup.connect(URL).get();
		Elements e = doc.select("body.catalog-product-view div.wrapper div.page div.main-container div.main div.col-main div.rd-main div.product-view div.product-essential form");
		
			String imgUrl = e.select("div.product-media div.product-img-box div.product-image img.gallery-image").attr("src");
			String name = e.select("div.product-shop div.product-info div.product-name h1 span").text();
			String price = e.select("div.product-shop div.price-info div.live_price div.price-box span.regular-price").text();
			String detail = e.select("div.product-shop div.product-info li.show-hover").text();
			String desc = e.select("div.product-shop div.product-info div.product-short-description").text();
			
			JOptionPane.showMessageDialog(null, "Dados Extraidos\nURL da imagem: "+imgUrl+"\nNome do produto: "+name+"\nPreco: "+price+"\nDescrição: "+desc+"\n"+detail);
	}
}
