package gates;

public class ANDGates {
    private int input1;
    private int input2;

    // constructors ---> default and parametrised
    public ANDGates() { super(); }      // default
    ANDGates(int input1, int input2)  // parametrised
    {
        this.input1 = input1;
        this.input2 = input2;
    }
    // getter and setter
    //1 --->   getters
    public void setInput1(int input1) { this.input1 = input1; }
    public void setInput2(int input2) { this.input2 = input2; }
    //2. ---> setters
    public int getInput1() { return this.input1; }
    public int getInput2() { return this.input2; }

    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        if (this.input1 == 1 && this.input2 == 1) { return 1; }
        else { return 0; }
    }

    // important for other class LIKE NANDGate
    public int andStoreOutput(int input1, int input2) { return (this.input1==1 && this.input2==1) ? 1 : 0; }



    private void printOutput()
    {
        System.out.println(0 + " AND " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " AND " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " AND " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " AND " + 1 + " results " + getOutput(1, 1));
    }
    public void printTruthTable() {
        System.out.println("----Truth Table For AND Gate----");
        printOutput();
    }
}