package gates;

public class NORGate {
    ORGate orGate = new ORGate();
    NOTGate notGate = new NOTGate();

    private int getOutput(int input1, int input2)
    {
        orGate.setInput1(input1);
        orGate.setInput2(input2);
        notGate.setInput1(orGate.orStoreOutput(input1,input2));
        return notGate.notStoreOutput();
    }

    private void printOutput()
    {
        System.out.println(0 + " NOR " + 0 + " results " + getOutput(0, 0) +'\n'+
                0 + " NOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " NOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " NOR " + 1 + " results " + getOutput(1, 1));
    }
    public void printTruthTable(){
        System.out.println("----Truth Table For NOR Gate----");
        printOutput();
    }

}
