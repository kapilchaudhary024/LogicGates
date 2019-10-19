package gates;

public class XORGate {

    ORGate orGate = new ORGate();
    ANDGates andGates = new ANDGates();
    NANDGate nandGate = new NANDGate();
    NOTGate notGate = new NOTGate();

    private int getOutput(int input1, int input2)
    {
//        int x = nandGate.nandStoreOutput(input1,input2);
//        int y = orGate.orStoreOutput(input1,input2);
//        return andGates.andStoreOutput(x,y);

//        // making ORGate
        orGate.setInput1(input1);
        orGate.setInput2(input2);
        int x = orGate.orStoreOutput(input1,input2);
//        System.out.println(" output of or gate " + x + " ");

        // making nandGate
        andGates.setInput1(input1);
        andGates.setInput2(input2);
        notGate.setInput1(andGates.andStoreOutput(input1,input2));
        int y =  notGate.notStoreOutput();


        // passing into ANDGate
        andGates.setInput1(x);
        andGates.setInput2(y);
        int z = andGates.andStoreOutput(x,y);
        return z;
    }

    private void printOutput()
    {
        System.out.println(0 + " XOR " + 0 + " results " + getOutput(0, 0) +'\n'+
                0 + " XOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " XOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " XOR " + 1 + " results " + getOutput(1, 1));
    }
    public void printTruthTable(){
        System.out.println("----Truth Table For XOR Gate----");
        printOutput();
    }


}
