/* From You Don't Know JS (https://learning.oreilly.com/library/view/you-dont-know/9781491905241/ch02.html#destructuring-sect) */


function foo() {
    return [1, 2, 3];
}

function bar() {
    return {
        x: 4,
        y: 5,
        z: 6
    };
}

var [a, b, c] = foo();
var { x: x, y: y, z: z } = bar();

console.log(a, b, c);             // 1 2 3
console.log(x, y, z);             // 4 5 6