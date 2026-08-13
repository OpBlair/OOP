const fs = require('fs');
const path = require('path');
const FILE_PATH = path.join(__dirname, 'users.json');

function readData() {
    try {
        if (!fs.existsSync(FILE_PATH)) {
            return [];
        }

        const rawData = fs.readFileSync(FILE_PATH, 'utf8');
        const parsedData = JSON.parse(rawData);

        return Array.isArray(parsedData) ? parsedData : [];
    } catch (error) {
        console.warn(`Warning: users.json was corrupted or missing (${error.message}). Resetting...`);
        return [];
    }
}

function writeData(usersArray) {
    try {
        // serialize the entire array back to a string
        const updatedJsonString = JSON.stringify(usersArray, null, 4);

        // write back to file
        fs.writeFileSync(FILE_PATH, updatedJsonString, 'utf8');
        return true;
    } catch (error) {
        console.error("Error: Failed to write Data to file:", error.message);
        return false;
    }
}

function addUser(username, email){
    let usersArray = readData();

    // user object
    const newUser = {
        id: usersArray.length + 1,
        username: username,
        email: email,
        joinedAt: new Date()
    };

    const emailExists = usersArray.some(user => user.email === email);

    if (emailExists) {
        console.warn(`Error: User with email '${email}' already exists. Skipping registration`);
        return;
    } else {
        usersArray.push(newUser);
    }
   
    if (writeData(usersArray)) {
        console.log(`User '${username}' added successfully.`);
    }
}

function deleteUser(email) {
    let usersArray = readData();

    const emailExists = usersArray.some(user => user.email === email);
    if(!emailExists) {
        console.warn(`Error: User with email '${email}' doesn't exist. Exitting...`);
        return;
    }

    const filteredUsers = usersArray.filter(user => user.email !== email);
    
    filteredUsers.forEach((user, index) => {
        user.id = index + 1;
    })

    if(writeData(filteredUsers)) {
        console.log(`User with email '${email}' has been deleted successfully.`);
    }
}

function updateUser(email, newUsername) {
    let usersArray = readData();

    const foundUser = usersArray.find(user => user.email === email);
    if(!foundUser) {
        console.warn(`Error: User with email '${email}' doesn't exist. Exitting...`);
        return;
    }
    foundUser.username = newUsername;
    
    if (writeData(usersArray)) {
        console.log(`User with email '${email} has updated username successfully.'`);
    }
}

function exportSensitiveData(){
    let usersArray = readData();

    const sensitiveData = JSON.stringify(usersArray, (key, value) => {
        if (key === 'email') {
            const [username, domain] = value.split('@');

            if (username.length <= 2) {
                return `${username[0]}***@${domain}`;
            }

            const maskedUsername = `${username[0]}***${username[username.length - 1]}`;
            return `${maskedUsername}@${domain}`;
        }
        return value;
    }, 4);
    console.log(sensitiveData);
    return sensitiveData;
}

addUser("John", "john@john.org");
addUser("Idris", "idris@idris.co.uk");
deleteUser("john@john.org");
updateUser("idris@idris.co.uk", "Idris_The_Go_Dev");
exportSensitiveData();