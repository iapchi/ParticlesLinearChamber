import com.iapchi.model.Chamber;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimationTest {
    @Test
    public void ParticleChamberTest0() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("..X....");
        expected.add("....X..");
        expected.add("......X");
        expected.add(".......");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("..R....").animate(2)));
    }
    @Test
    public void ParticleChamberTest1() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("XX..XXX");
        expected.add(".X.XX..");
        expected.add("X.....X");
        expected.add(".......");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("RR..LRL").animate(3)));
    }
    @Test
    public void ParticleChamberTest2() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("XXXX.XXXX");
        expected.add("X..X.X..X");
        expected.add(".X.X.X.X.");
        expected.add(".X.....X.");
        expected.add(".........");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("LRLR.LRLR").animate(2)));
    }
    @Test
    public void ParticleChamberTest3() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("XXXXXXXXXX");
        expected.add("..........");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("RLRLRLRLRL").animate(10)));
    }
    @Test
    public void ParticleChamberTest4() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("...");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("...").animate(1)));
    }
    @Test
    public void ParticleChamberTest5() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("XXXX.XX.XXX.X.XXXX.");
        expected.add("..XXX..X..XX.X..XX.");
        expected.add(".X.XX.X.X..XX.XX.XX");
        expected.add("X.X.XX...X.XXXXX..X");
        expected.add(".X..XXX...X..XX.X..");
        expected.add("X..X..XX.X.XX.XX.X.");
        expected.add("..X....XX..XX..XX.X");
        expected.add(".X.....XXXX..X..XX.");
        expected.add("X.....X..XX...X..XX");
        expected.add(".....X..X.XX...X..X");
        expected.add("....X..X...XX...X..");
        expected.add("...X..X.....XX...X.");
        expected.add("..X..X.......XX...X");
        expected.add(".X..X.........XX...");
        expected.add("X..X...........XX..");
        expected.add("..X.............XX.");
        expected.add(".X...............XX");
        expected.add("X.................X");
        expected.add("...................");

        Assert.assertEquals(expected, Arrays.asList(new Chamber("LRRL.LR.LRR.R.LRRL.").animate(1)));
    }


}
