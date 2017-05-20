package abstractfactory;

public class ConferenceRoomFactory implements RoomFactory {

	@Override
	public void createDoor() {
		// TODO Auto-generated method stub
		System.out.println("Creting Door");

	}

	@Override
	public void createFloor() {
		// TODO Auto-generated method stub
		System.out.println("Creating floor");

	}

}
