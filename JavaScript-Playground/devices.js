'use strict';

class Device{
    constructor(brand, powerStatus){
        this.brand = brand;
        this.powerStatus = powerStatus;
    }

    togglePower(){
        this.powerStatus = !this.powerStatus;
        console.log(`${this.brand} is ${this.powerStatus ? "ON" : "OFF"}`);
    }

}

class smartPhone extends Device{
    constructor(brand, powerStatus, batteryLevel){
        super(brand, powerStatus);
        this.batteryLevel = batteryLevel;
    }

    browseInternet(){
        if(this.powerStatus && this.batteryLevel > 0){
            console.log(`${this.brand} is Browsing the Internet`);
            return;
        }
        if(!this.powerStatus){
            console.log("Can't browse the internet, the device is powered off.");
        }
    }

    chargeDevice(percentage){
        if(this.batteryLevel === 100){
            console.log("Device is fully charged");
            return;
        }
        this.batteryLevel += percentage;
        if(this.batteryLevel > 100){
            this.batteryLevel = 100;
        }
        console.log(`Battery charged to ${this.batteryLevel}`);
    }
}

let redmi = new smartPhone('8A', true, 10);
redmi.browseInternet();
redmi.togglePower();
redmi.browseInternet();

let Iphone = new smartPhone('13', false, 0);
Iphone.togglePower();
Iphone.chargeDevice(50);
Iphone.browseInternet();