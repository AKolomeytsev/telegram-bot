package pro.sky.telegrambot.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
public class notification_task {

    @Id
    @GeneratedValue
    private long id;
    private long chatId;
    private String message;
    private LocalDateTime dateSend;

    public notification_task(){

    }
    public notification_task(long id,long chatId,String message,LocalDateTime dateSend){
        this.id = id;
        this.chatId = chatId;
        this.message = message;
        this.dateSend = dateSend;
    }

    public notification_task(notification_task obj){
        this.id = obj.id;
        this.chatId = obj.chatId;
        this.message = obj.message;
        this.dateSend = obj.dateSend;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateSend() {
        return dateSend;
    }

    public void setDateSend(LocalDateTime dateSend) {
        this.dateSend = dateSend;
    }
}
