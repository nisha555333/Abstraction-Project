package arrays;
class Simpleinterest{
    static int rate = 2;
    float output;
    int principal;int year;
    void calculate(int principal,int year){
        output = (principal*year*rate) /100;
    }
    void display(){
        System.out.println(output);
    }
}