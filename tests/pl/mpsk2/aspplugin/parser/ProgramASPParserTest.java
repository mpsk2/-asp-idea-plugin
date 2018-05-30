package pl.mpsk2.aspplugin.parser;

public class ProgramASPParserTest extends ASPParserTestBase {
    public ProgramASPParserTest() {
        super("program");
    }

    public void testBig() { doTest(true); }
    public void testBoard() { doTest(true); }
    public void testBodyDotElem2() { doTest(true); }
    public void testCsp() { doTest(true); }
    public void testDisjoint() { doTest(true); }
    public void testDisjunction() { doTest(true); }
    public void testDoubleEmpty() { doTest(true); }
    public void testExternal() { doTest(true); }
    public void testExternalAtomId() { doTest(true); }
    public void testHeadBodyDot() { doTest(true); }
    public void testHeadDisjunction() { doTest(true); }
    public void testHeadLiteral() { doTest(true); }
    public void testInclude() { doTest(true); }
    public void testLuBodyAggregate() { doTest(true); }
    public void testLuHeadAggregate() { doTest(true); }
    public void testMaxMin() { doTest(true); }
    public void testMaxMinHard() { doTest(true); }
    public void testRobots() { doTest(true); }
    public void testRobots1() { doTest(true); }
    public void testRobots2() { doTest(true); }
    public void testRobots3() { doTest(true); }
    public void testRobots4() { doTest(true); }
    public void testShow() { doTest(true); }
    public void testShowBasicExpression() { doTest(true); }
    public void testShowEmpty() { doTest(true); }
    public void testStatement() { doTest(true); }
}