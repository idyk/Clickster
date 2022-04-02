package clickster;

import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class ClickDBTest {

    public ClickDBTest() {
    }
    float points;
    float multiplier;
    boolean milestoneOneFlag;
    private ClickDB clickDB;

    @Before
    public void setUp() {
        System.out.println("set up");
        clickDB = new ClickDB();
        points = 25;
        multiplier = 2;
        milestoneOneFlag = true;
    }

    @After
    public void tearDown() {
        points = 0;
        multiplier = 0;
        milestoneOneFlag = false;
        System.out.println("tear down");
    }

    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        float expectedPoints = 25;
        clickDB.setPoints(points);
        assertTrue(expectedPoints == clickDB.getPoints());
    }

    @Test
    public void testSetMultiplier() {
        System.out.println("setMultiplier");
        float expectedMultiplier = 2.0f;
        clickDB.setMultiplier(multiplier);
        assertTrue(expectedMultiplier == clickDB.getMultiplier());
    }

    @Test
    public void testSetMilestoneFlagOne() {
        System.out.println("setMilestoneFlagOne");
        boolean expectedFlag = true;
        clickDB.setMilestoneOneFlag(milestoneOneFlag);
        assertTrue(expectedFlag == clickDB.getMilestoneOneFlag());
    }
}
