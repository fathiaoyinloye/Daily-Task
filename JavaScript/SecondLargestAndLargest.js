function getSecondLargestAndLargest(myArray ){
        let largest = myArray[0];
        let secondLargest = 0;
    for (let count = 0; count < myList.length; count++){
            if(largest > myArray[count] && myArray[count] > secondLargest) secondLargest = myArray[count];
            if(myArray[count] > largest){
                secondLargest = largest;
                largest = myArray[count]
            }
          
    }
    myList = [secondLargest, largest]
    return myList;
}

function arrangeInDescendingOrder(myArray){
    for (let count = 0; count < myArray.length; count++){
        for(let index = count + 1; index < myArray.length; index++){
            if(myArray[count] < myArray[index]){
                let temp = myArray[count]
                myArray[count] = myArray[index]
                myArray[index] = temp
            }
        }
    }
    return myArray
}



module.exports = {getSecondLargestAndLargest, arrangeInDescendingOrder}