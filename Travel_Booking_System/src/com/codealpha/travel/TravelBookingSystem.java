package com.codealpha.travel;

import java.util.Scanner;

class TravelService {
	protected String name;
	protected double price;

	public TravelService(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

class Flight extends TravelService {
	private String origin;
	private String destination;

	public Flight(String name, double price, String origin, String destination) {
		super(name, price);
		this.origin = origin;
		this.destination = destination;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}
}

class Hotel extends TravelService {
	private String location;
	private int nights;

	public Hotel(String name, double price, String location, int nights) {
		super(name, price);
		this.location = location;
		this.nights = nights;
	}

	public String getLocation() {
		return location;
	}

	public int getNights() {
		return nights;
	}
}

class Transportation extends TravelService {
	private String type;

	public Transportation(String name, double price, String type) {
		super(name, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

public class TravelBookingSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Flight flight1 = new Flight("Flight 1", 200.0, "New York", "London");
		Flight flight2 = new Flight("Flight 2", 250.0, "London", "Paris");

		System.out.println("Welcome to the Travel Booking System!");
		System.out.println("Please select from the following flights to book:");

		System.out.println("1. " + flight1.getName() + " from " + flight1.getOrigin() + " to "
				+ flight1.getDestination() + " - $" + flight1.getPrice());
		System.out.println("2. " + flight2.getName() + " from " + flight2.getOrigin() + " to "
				+ flight2.getDestination() + " - $" + flight2.getPrice());
		int choice = scanner.nextInt();

		Flight selectedFlight = null;
		switch (choice) {
		case 1:
			selectedFlight = flight1;
			break;
		case 2:
			selectedFlight = flight2;
			break;
		default:
			System.out.println("Invalid choice! Exiting...");
			System.exit(0);
		}
		if (selectedFlight != null) {
			System.out.println("You have selected: " + selectedFlight.getName());
			System.out.println("Please provide your details for booking:");
			System.out.print("Enter your Name: ");
			String name = scanner.next();
			System.out.print("Enter your Age: ");
			int age = scanner.nextInt();
			System.out.print("Enter your Email: ");
			String email = scanner.next();
			System.out.print("Enter your Phone number: ");
			String phoneNumber = scanner.next();

			System.out.println("\nBooking Summary:");
			System.out.println("Flight: " + selectedFlight.getName());
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Email: " + email);
			System.out.println("Phone Number: " + phoneNumber);
			System.out.println("Total Price: $" + selectedFlight.getPrice());
		}
		scanner.close();
	}
}
