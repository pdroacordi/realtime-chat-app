package br.com.pedroacordi.chatapp.model;

import java.io.Serializable;

public class Message implements Serializable {

    private String senderName;
    private String receiverName;
    private String content;
    private Status status;

    public Message() {
    }

    public Message(String senderName, String receiverName, String content, Status status) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.content = content;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", content='" + content + '\'' +
                ", status=" + status +
                '}';
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
