package ru.itpark.service;

public class MessengerService {
    public String initials (String name) {
        String[] parts = name.split(" ");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            result.append(part.substring(0, 1));
        }
        return result.toString();
    }
}
