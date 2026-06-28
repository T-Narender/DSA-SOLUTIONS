class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int totalUnits=0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        for(int i=0;i<boxTypes.length;i++){
           int numOfBoxes=boxTypes[i][0];
           int unitsPerBox=boxTypes[i][1];

           if(truckSize>=numOfBoxes){
            totalUnits+=numOfBoxes*unitsPerBox;
            truckSize-=numOfBoxes;
           }
           else{
            totalUnits+=truckSize*unitsPerBox;
            break;
           }
        }
        return totalUnits;
    }
}
