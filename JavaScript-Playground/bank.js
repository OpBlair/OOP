'use strict';

class BankAccount{
    #balance;
    constructor(ownerName, balance){
        this.ownerName = ownerName;
        this.#balance = balance;
    }

    deposit(amount){
        this.#balance = this.#balance + amount;
        console.log("Account topped up Successfully.");
    }

    withdraw(amount){
        if(this.#balance === 0){
            console.log("Insufficient Funds. Can't withdraw");
            return;
        }
        if(amount <= this.#balance){
            this.#balance = this.#balance - amount;
            console.log('Transaction successful.');
        }
    }

    get getBalance(){
        return `Balance: ${this.#balance}`;
    }
}

let account = new BankAccount("WestRidge", 10000);
account.#balance = 1000;
account.deposit(5000);
account.withdraw(2000);
