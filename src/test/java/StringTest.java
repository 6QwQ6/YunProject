import com.ksyun.whgc.chenjianghao.Util;
import org.junit.Test;

public class StringTest {
    @Test
    public void StringTest1(){
        String s="abcdefgh";
        System.out.println(Util.FlipString(s));
    }
    @Test
    public void StringTest2(){
        String s="aabbcadeaad";
        System.out.println(Util.CharSum(s));
    }
    @Test
    public void StringTest3(){
        String s="aabbcadeaad";
        System.out.println(Util.MaxChar(s));
    }

}
