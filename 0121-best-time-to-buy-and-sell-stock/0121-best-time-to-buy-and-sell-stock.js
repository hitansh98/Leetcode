/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    let l = 0;
    let r = 1;
    let curMaxProfit = 0;
    while (r < prices.length) {
        let curProfit = prices[r] - prices[l];
        if (curProfit < 0) {
            l = r;
        } else {
            curMaxProfit = Math.max(curProfit, curMaxProfit);
        }
        r++;
    }
    return curMaxProfit;
};