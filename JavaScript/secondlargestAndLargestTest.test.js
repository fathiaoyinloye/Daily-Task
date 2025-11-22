
const {getSecondLargestAndLargest, arrangeInDescendingOrder} = require('./SecondLargestAndLargest')
test("test that you can get largest and second largest",()=> {
    myList = [1,5,2,3,4]
    result = [4,5]
    expect(getSecondLargestAndLargest(myList)).toStrictEqual(result)
})

test("test that you can arrange in descending order ", () =>{
    myList = [1,5,2,3,4]
    result = [5,4,3,2,1]
    expect(arrangeInDescendingOrder(myList)).toStrictEqual(result)  
})