package security.utils;

import org.junit.Assert;
import org.junit.Test;

public class SecurityUtilsTest {
    @Test
    public void testGetHashedPassword() {
        MD5Util MD5Util = new MD5Util();
        Assert.assertEquals("If Password is 'Ukraine', hashcode must be a 'f01fc92b23faa973f3492a23d5a705c5'",
                "f01fc92b23faa973f3492a23d5a705c5",
                MD5Util.getHashedPassword("Ukraine"));
        Assert.assertEquals("If Password is 'LvivPolytechnic', hashcode must be a '481f693417e9a74e783caea72063b606'",
                "5ee6130ae9fdc819764c78d16a177b00",
                MD5Util.getHashedPassword("LvivPolytechnic"));
    }
}