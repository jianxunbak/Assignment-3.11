package com.skillsunion.notification;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	private NotificationService notificationService;

	// constructor injection
	public NotificationApplication(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@PostConstruct
	public void Input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Send to: ");
		String sendTo = scanner.nextLine();
		System.out.print("Enter your message: ");
		String messageInput = scanner.nextLine();
		notificationService.setup(sendTo, messageInput);
		notificationService.send();
		scanner.close();

	}

}

/*
 * TODO:
 * - Create a @PostConstruct method to be executed after spring container has
 * completed configuration.
 * - Invite input using Scanner and System.in for value "to" and "message".
 * - Set the input to setup(string, string) method in NotificationService.java.
 * - Invoke send() method in Notification.java.
 */
