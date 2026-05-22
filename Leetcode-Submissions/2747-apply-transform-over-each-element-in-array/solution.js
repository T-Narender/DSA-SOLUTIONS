/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
  const res = [];
  for(const i in arr){
    res[i]=fn(arr[i],Number(i));
  }  
  return res;
};
