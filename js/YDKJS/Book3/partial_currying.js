function foo(p1, p2) {
        console.log("p1 =", p1);
        console.log("p2 =", p2);
        this.val = p1 + p2;
}

// using `null` here because we don't care about
// the `this` hard-binding in this scenario, and
// it will be overridden by the `new` call anyway!
var bar = foo.bind(null, "p1");

var baz = new bar("p2");
console.log(baz.val); // p1p2

console.log("----------------");
var baa = new bar();
console.log(baa.val);