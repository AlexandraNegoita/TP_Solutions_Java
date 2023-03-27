import * as fs from 'fs';
class Animal {
    name: string;
    constructor(theName: string) {
      this.name = theName;
    }
    move(distanceInMeters: number = 0) {
      console.log(`${this.name} moved ${distanceInMeters}m.`);
    }
  }
  
  class Snake extends Animal {
    constructor(name: string) {
      super(name);
    }
    move(distanceInMeters = 5) {
      console.log("Slithering...");
      super.move(distanceInMeters);
    }
}
function readFileContent(fileName: string): string {
    let fileContent:string = "";
    try {
        fs.readFileSync(fileName, 'ascii');
    } catch(err) {
        console.log(err.message);
    }
    return fileContent;
}