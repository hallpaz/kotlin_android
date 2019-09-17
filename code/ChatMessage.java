import java.util.Date;
import java.text.SimpleDateFormat;

class ChatMessage {
    private String text;
    private long timestamp;
    private int senderId;

    public ChatMessage(String text,
                        long timestamp,
                        int senderId){
        this.text = text;
        this.timestamp = timestamp;
        this.senderId = senderId;
    }

    public String getText(){
        return text;
    }

    public long getTimestamp(){
        return timestamp;
    }

    public int getSenderId(){
        return senderId;
    }
    public String getMoment() {
        val sdf = SimpleDateFormat("HH:mm");
        return sdf.format(timestamp);
    }
}