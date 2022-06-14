class Plants {
    color(): void {
        console.log("Green by default");

    }
    life(): void {
        console.log("This is life plant");

    }
    danger = false
}

class Flower extends Plants {

    nectarSource = false

}
class Rose extends Flower {
    color(): void {
        console.log("color of rose is red");
    }
    danger = true
}

class WhiteRose extends Rose {
    color(): void {
        console.log("color of rose is white");
    }

}

class Lotus extends Flower {
    color(): void {
        console.log("color of Lotus is pink");
    }
}
class Calluna extends Flower {
    color(): void {
        console.log("color of Calluna is bright pink");
    }
    nectarSource = true

}





console.log("Demo to show multiplevel inheritence in Typescript:");

console.log("ROSE:");

let myobject1 = new Rose();
myobject1.color();
console.log(myobject1.danger);

console.log("LOTUS:");

let myobject2 = new Lotus();
console.log(myobject2.danger);
myobject2.color();
console.log('Lotus is life?:');
myobject2.life();


console.log("CALLUNA:");

let myobject3 = new Calluna();
myobject3.color();
console.log('Nectar source?:');
console.log(myobject3.nectarSource);


console.log("PARENT CLASS FOR ALL FLOWERS:");

let myobject4 = new Flower();
myobject4.color();
myobject4.life();