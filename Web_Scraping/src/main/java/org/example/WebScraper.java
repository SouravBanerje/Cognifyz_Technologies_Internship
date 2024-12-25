package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class WebScraper {


    public  static  void webSrap(Scanner scanner) {
        System.out.println("Welcome to the Interactive Web Scraper!");
        System.out.print("Enter a website URL to scrape (e.g., https://example.com): ");
        String url = scanner.nextLine();

        System.out.print("Enter the CSS selector for the data you want to scrape (e.g., '.headline'): ");
        String cssSelector = scanner.nextLine();

        try {

            Document doc = Jsoup.connect(url).get();


            Elements elements = doc.select(cssSelector);


            System.out.println("\nScraped Data:");
            int count = 1;
            for (Element element : elements) {
                System.out.println(count + ". " + element.text());
                count++;
            }

            System.out.println("\nScraping completed successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while fetching the data: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
