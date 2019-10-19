import gates.ANDGates;
import gates.NOTGate;
import gates.ORGate;
import gates.NORGate;
import gates.NANDGate;
import gates.XORGate;
import gates.XNORGate;

public class GatesTest {
    public static void main(String[] args) {
        ANDGates andGate = new ANDGates();
        andGate.printTruthTable();

        ORGate orGate = new ORGate();
        orGate.printTruthTable();

        NOTGate notGate = new NOTGate();
        notGate.printTruthTable();

        NORGate norGate = new NORGate();
        norGate.printTruthTable();

        NANDGate nandGate = new NANDGate();
        nandGate.printTruthTable();

        XORGate xorGate = new XORGate();
        xorGate.printTruthTable();

        XNORGate xnorGate = new XNORGate();
        xnorGate.printTruthTable();

    }
}