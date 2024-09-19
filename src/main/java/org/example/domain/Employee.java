package org.example.domain;

public abstract class Employee {
    private GroupChat groupChat;

    Employee(GroupChat groupChat) {
        this.groupChat = groupChat;
        groupChat.subscribeToGroupChat(this);
    }

    void sendMessage(String message) {}

    void handleMessage(String message) {}
}
