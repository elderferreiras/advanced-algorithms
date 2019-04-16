package webCrawler;

public class App {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String rootUrl = "http://elderf.com";
        crawler.discover(rootUrl);
    }
}
