/*  Create a class MeetingRoom having method bookMeetingRoom which should provide below facility.
meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
      a. b. c.
“Nalanda” meeting room will be booked with default bookMeetingRoom() method for 1 hr.
Write another method which helps to book Other then “Nalanda” meeting room by giving name of meeting room and hrs as parameter.
displayInfo method should print booked meeting room info [i.e. meeting room, booked for how many hrs].*/
package Neha.CoreJavaAssignments;

import java.util.Scanner;

public class MeetingRoom {

	void bookMeetingRoom()
	{
		System.out.println("Nalanda meeting room booked for 1hr");
	}

	void bookMeetingRoom(String room, float hr)
	{
		if(room.equals("Takshashila")||room.equals("AgraFort")||room.equals("PratapGadh"))
			displayInfo(room, hr);
		else
			System.out.println("There no such room available");
	}

	void displayInfo(String room, float hr)
	{
		System.out.println(room +" meeting room booked for " +hr + " hours");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter meeting room name");
		String str = sc.next();
		MeetingRoom mr = new MeetingRoom();

		if (str.equals("Nalanda"))
			mr.bookMeetingRoom();
		else {
			System.out.println("Enter for how much time you would like to book the room");
			Float f = sc.nextFloat();
			mr.bookMeetingRoom(str,f);
		}
	}
	

}
