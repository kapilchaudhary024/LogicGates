package gates;

public class XNORGate{

    ORGate orGate = new ORGate();
    ANDGates andGates = new ANDGates();
    NANDGate nandGate = new NANDGate();
    NOTGate notGate = new NOTGate();

    private int getOutput(int input1, int input2)
    {

//        // making ANDGate
        andGates.setInput1(input1);
        andGates.setInput2(input2);
        int x = andGates.andStoreOutput(input1,input2);
//        System.out.println(" output of and gate " + x + " ");

        // making NORGate
        orGate.setInput1(input1);
        orGate.setInput2(input2);
        notGate.setInput1(orGate.orStoreOutput(input1,input2));
        int y = notGate.notStoreOutput();
//        System.out.println(y);


        // passing into ORGate
        orGate.setInput1(x);
        orGate.setInput2(y);
        int z = orGate.orStoreOutput(x,y);
//        System.out.println("output of nor gates " + z);
        return z;
    }

    private void printOutput()
    {
        System.out.println(0 + " XNOR " + 0 + " results " + getOutput(0, 0) +'\n'+
                0 + " XNOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " XNOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " XNOR " + 1 + " results " + getOutput(1, 1));
    }
    public void printTruthTable(){
        System.out.println("----Truth Table For XNOR Gate----");
        printOutput();
    }


}
