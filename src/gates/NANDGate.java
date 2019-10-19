package gates;

public class NANDGate {
    ANDGates andGates = new ANDGates();
    NOTGate notGates = new NOTGate();

    private int getOutput(int input1, int input2)
    {
        andGates.setInput1(input1);
        andGates.setInput2(input2);
        notGates.setInput1(andGates.andStoreOutput(input1,input2));
        return notGates.notStoreOutput();

    }
    //important for XORGates
    public int nandStoreOutput(int input1, int input2) { return notGates.notStoreOutput() ;}

    private void printOutput()
    {
        System.out.println(0 + " NAND " + 0 + " results " + getOutput(0, 0) +'\n'+
                0 + " NAND " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " NAND " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " NAND " + 1 + " results " + getOutput(1, 1));
    }
    public void printTruthTable(){
        System.out.println("----Truth Table For NAND Gate----");
        printOutput();
    }

}
