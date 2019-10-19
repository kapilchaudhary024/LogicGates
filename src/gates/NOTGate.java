package gates;

public class NOTGate {
    private int input1;

    // constructors ---> default and parametrised
    public NOTGate() { super(); }      // -----> default
    NOTGate(int input1) { this.input1 = input1;}    // ----> parametrised

    // getter and setter
    //1 --->   getters
    public void setInput1(int input1) { this.input1 = input1; }
    //2. ---> setters
    public int getInput1() { return this.input1; }

    private int getOutput(int input1) {
        setInput1(input1);
        if (input1 == 0) { return 1; }
        else { return 0;}
    }
    private void printOutput()
    {
        System.out.println(
                " NOT "+ 0 + " results " + getOutput(0) +'\n'+
                        " NOT "+ 1 + " results " + getOutput(1));
    }

    // important for other class -----> LIKE NANDGate
    public int notStoreOutput() { return (this.input1==1 ) ? 0 : 1; }




    public void printTruthTable(){
        System.out.println("----Truth Table For NOT Gate----");
        printOutput();
    }
}