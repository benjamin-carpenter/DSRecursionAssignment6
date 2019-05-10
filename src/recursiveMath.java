public class recursiveMath {


    public recursiveMath(){

    }
    public static int addition(int _numOne, int _numTwo, int summation){
        int sum ;
        sum = _numOne + summation;
        _numOne = _numOne - 1;
        if (_numOne == _numTwo) {
            return sum;
        }
        else {
            recursiveMath.addition(_numOne, _numTwo, sum);
        }

    }


}
