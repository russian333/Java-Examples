//Inspiration gathered from answer to:
//http://stackoverflow.com/questions/6044923/generic-pair-class
//Stackoverflow Post

package colemanBrody;

//Generic Pair class, taking two generic data points.
public class Pair<firstType, secondType> {
    //Variables to hold the two values.
    private firstType first; 
    private secondType paired;

    //Constructor for setting up objects of the class.
    public Pair(firstType f, second s) {
        this.first = f;
        this.paired = s;
    }

    //Getters to grap values.
    public firstType getFirst() {
        return this.first;
    }

    public secondType getPair() {
        return this.paired;
    }
}