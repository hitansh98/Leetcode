/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let count = init;
    let obj = {};
    
    obj.increment = () => {
        count++;
        return count;
    };
    
    obj.decrement = () => {
        count--;
        return count;
    }
    
    obj.reset = () => {
        count = init;
        return count;
    }

    return obj;
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */