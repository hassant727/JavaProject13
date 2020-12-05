package cs3318.raytracing;

/***************************************************
 *
 *   An instructional Ray-Tracing Renderer written
 *   for MIT 6.837  Fall '98 by Leonard McMillan.
 *
 *   A fairly primitive Ray-Tracing program written
 *   on a Sunday afternoon before Monday's class.
 *   Everything is contained in a single file. The
 *   structure should be fairly easy to extend, with
 *   new primitives, features and other such stuff.
 *
 *   I tend to write things bottom up (old K&R C
 *   habits die slowly). If you want the big picture
 *   scroll to the applet code at the end and work
 *   your way back here.
 *
 ****************************************************/

// A simple vector class
class Vector3D {
    public float x, y, z;

    public Vector3D(float x, float y, float z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Vector3D v) {

        x = v.x;
        y = v.y;
        z = v.z;
    }

    // methods
    public final float dot(Vector3D B) {

        return (x * B.x + y * B.y + z * B.z);
    }

    public final float dot(float Bx, float By, float Bz) {

        return (x * Bx + y * By + z * Bz);
    }

    public static float dot(Vector3D A, Vector3D B) {

        return (A.x * B.x + A.y * B.y + A.z * B.z);
    }

    public final Vector3D cross(Vector3D B) {

        return new Vector3D(y * B.z - z * B.y, z * B.x - x * B.z, x * B.y - y * B.x);
    }

    public final void normalize() {

        float t = x * x + y * y + z * z;
        if (t != 0 && t != 1) t = (float) (1 / Math.sqrt(t));

        x *= t;
        y *= t;
        z *= t;
    }

    public static Vector3D normalize(Vector3D A) {

        float t = A.x * A.x + A.y * A.y + A.z * A.z;
        if (t != 0 && t != 1) t = (float) (1 / Math.sqrt(t));
        return new Vector3D(A.x * t, A.y * t, A.z * t);
    }

    public String toString() {

        return "[" + x + ", " + y + ", " + z + "]";
    }
}
