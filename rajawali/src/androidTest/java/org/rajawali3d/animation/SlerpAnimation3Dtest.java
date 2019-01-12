package org.rajawali3d.animation;

import androidx.test.filters.SmallTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rajawali3d.math.Quaternion;
import org.rajawali3d.math.vector.Vector3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * @author Jared Woolston (jwoolston@keywcorp.com)
 */
@SmallTest
public class SlerpAnimation3Dtest {
    SlerpAnimation3D anim;

    @Before
    public void setup() throws Exception {
        anim = new SlerpAnimation3D(new Vector3(), new Vector3());
        assertNotNull(anim);
    }

    @After
    public void teardown() throws Exception {
        anim = null;
    }

    @Test
    public void testQuaternionFromVector() throws Exception {
        Quaternion q = anim.quaternionFromVector(new Vector3());
        assertNotNull(q);
        assertEquals(1d, q.w, 1e-14);
        assertEquals(0d, q.x, 1e-14);
        assertEquals(0d, q.y, 1e-14);
        assertEquals(0d, q.z, 1e-14);
    }

}
