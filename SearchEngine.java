import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;



class Handler implements URLHandler {
    ArrayList<String> string_added = new ArrayList<String>();


    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("/add?s=str   This will add the string to the list %n/search?s=str   This will check if the string is in the list");
        } else if(url.getPath().equals("/increment")) {
            return String.format("no");

        } else{
            return String.format("404 not found");
        }


    }
}



class SearchEngine {

    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }    
}
