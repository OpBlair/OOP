/* 
JSON.stringify() => object to string
JSON.parse()     => string to object

JSON.stringify() arguments
JSON.stringify(object, replacer, space)

'replacer' argument acts as a Filter or Transformer; can be an array or a function

'space' argument controls formatting

*/

// replacer as an array
const user = { name: "Idris", age: 30, city: "Kampala", role: "Admin" };

// Only keep 'name' and 'role'
const json = JSON.stringify(user, ["name", "role"]);
console.log(json); 

// replacer as a function
const product = { name: "Laptop", price: 1200 };

// Give a 10% discount during serialization
const json2 = JSON.stringify(product, (key, value) => {
    if (key === "price") return value * 0.9;
    return value; // Always return the value, otherwise it gets deleted!
});
console.log(json2);

// space argument
const data = { open: true, logs: [1, 2] };

// Indent with 4 spaces
console.log(JSON.stringify(data, null, 4));

/*
JSON.parse(text, reviver) => JSON.parse(jsonString, reviver)

'reviver' argument intercepts, transforms or filters the parsed values before they are ultimately returned.

*/

const serverResponse = '{"event":"Launch","date":"2026-08-13T16:12:00.000Z"}';

// Parse the string and resurrect the Date object
const liveObject = JSON.parse(serverResponse, (key, value) => {
    if (key === "date") {
        return new Date(value); // Turn the string back into a real Date object
    }
    return value; // Always return the value as-is for everything else
});

console.log(typeof liveObject.date); // "object"
console.log(liveObject.date.getFullYear()); // 2026 (A real working method!)
