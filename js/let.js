// Copied from https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/let

var SomeConstructor;

{
    let privateScope = {};

    SomeConstructor = function SomeConstructor () {
        this.someProperty = Math.random();
        privateScope.hiddenProperty = Math.random();
    }

    SomeConstructor.prototype.showPublic = function () {
        console.log(this.someProperty); // foo
    }

    SomeConstructor.prototype.showPrivate = function () {
        console.log(privateScope.hiddenProperty); // bar
    }

}

function print() {
    let myInstance = new SomeConstructor();
    myInstance.showPublic();
    myInstance.showPrivate();
}

print();
print();