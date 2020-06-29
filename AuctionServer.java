//---------E/13/043-------------//


import java.io.IOException;

/**
 * Created by USER on 10/15/2016.
 */
public class AuctionServer {
    //Base port of the Auction server
    public static final int BASE_PORT = 2000;

    public static void main(String[] args) throws IOException {
        //Create new Base port socket and listen when connect client
        Server server = new Server(BASE_PORT);
        //When client connect open new socket for that client to bid
        server.server_loop();

    }
}
