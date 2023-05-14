/**
 * @param {Function} fn
 * @return {Function}
 */
var curry = function(fn) {
    let count = 0;
    return function curried(...args) {
//         console.log(fn + " " + fn.length);
//         console.log(args + " " + args.length);
        
        if(args.length < fn.length){
            return (...nextParams) => curried(...args, ...nextParams);
        }
        
        return fn(...args);
    };
};

/**
 * function sum(a, b) { return a + b; }
 * const csum = curry(sum);
 * csum(1)(2) // 3
 */
