package rocks.zipcode.io.objectorientation;

public class Television {

   Boolean on;


    Integer channel;

    public void turnOn() {
        on = true;
    }

    public void setChannel(Integer channel) {
        if (on){

            this.channel = channel;

        }
    }
    public TVChannel getChannel() {
       return TVChannel.getByOrdinal(channel);
    }
}
