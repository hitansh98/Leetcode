/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let res = [];
    let ptr = 0;
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i], i)){
            res[ptr++] = arr[i];
        }
    }
    
    return res;
};