/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	return function(x) {
        let temp = x;
        for(let f=functions.length-1;f>=0;f--){
            temp = functions[f](temp);
            console.log(temp);
        }
        return temp;
    }
    
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */