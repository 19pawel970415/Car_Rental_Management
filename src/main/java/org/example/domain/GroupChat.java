package org.example.domain;

import java.util.ArrayList;
import java.util.List;

public class GroupChat {
    private String name;
    private final List<Employee> subscribers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();

    private GroupChat(String name) {
        this.name = name;
    }

    private static GroupChat GROUP_CHAT_INSTANCE = new GroupChat("The firm's group chat");

    public static GroupChat getInstance() {
        return GROUP_CHAT_INSTANCE;
    }

    public void subscribeToGroupChat(Employee employee) {
        subscribers.add(employee);
    }

    public void sendMessage(Employee employee, String message) {
        messages.add(message);
        employee.sendMessage(message);
        notifyAllSubscribers(employee, message);
    }

    private void notifyAllSubscribers(Employee employee, String message) {
        subscribers.stream()
                .filter(s -> s != employee)
                .forEach(s -> s.handleMessage(message));
    }
}
