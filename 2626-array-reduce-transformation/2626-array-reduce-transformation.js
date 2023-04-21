/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let counter = init;
    for(let i=0;i<nums.length;i++){
        counter = fn(counter, nums[i]);
    }
    
    return counter;
};