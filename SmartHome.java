import java.util.ArrayList;

class Device{
	String device_name;
	boolean device_status;
	String device_location;

	
	Device(String device_name, boolean device_status, String device_location){
		this.device_name = device_name;
		this.device_status = device_status;
		this.device_location = device_location;
	}

	@Override
	public String toString(){
		return String.format("%-11s | %-8s | %s", this.device_name, this.device_status ? "ON" : "OFF", this.device_location);
	}
}

class SmartHomeController{
	int total_devices = 0;
	
	ArrayList<Device> deviceList = new ArrayList<>();

	void add_device(String device_name, String device_location){
		Device newDevice = new Device(device_name, false, device_location);
		deviceList.add(newDevice);
		total_devices++;
		System.out.printf("%s added at %s successfully.%n", device_name, device_location);
	}

	void turn_on_device(String device_name){
		for(Device d : deviceList){
			if(d.device_name.equals(device_name)){
				d.device_status = true;
				System.out.printf("%n%s turned ON successfully. %n", device_name);
				return;
			}
		}	
		System.out.println("Device not Found.");
	}

	void turn_off_device(String device_name){
		for(Device d : deviceList){
			if(d.device_name.equals(device_name)){
				d.device_status = false;
				System.out.printf("%n%s turned OFF successfully. %n", device_name);
				return;
			}
		}	
		System.out.println("Device not Found.");
	}

	void display_all_devices(){
		System.out.printf("%n === Current Devices === %n");

		if(deviceList.isEmpty()){
			System.out.println("No devices Currently registered In the System.");
			return;
		}
		System.out.println("=================================");
		System.out.printf("%s | %-8s | %s %n", "Device Name", "Status", "Location");

		for(Device device : deviceList){
			System.out.println(device);
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Total Devices: " + total_devices);
	}
}

public class SmartHome{
	public static void main(String[] args){
		System.out.println("=== Smart Home Automation System ===");

		SmartHomeController controller = new SmartHomeController();
		controller.add_device("Bulb", "Kitchen");
		controller.add_device("Fan", "Bedroom");

		controller.turn_on_device("Bulb");

		controller.display_all_devices();

	}
}