package us.yydcdut.camera2;

/**
 * Created by yuyidong on 15-1-23.
 */
public class hdr_mergeBitCode {
    // return byte array representation of the 32-bit bitcode.
    public static byte[] getBitCode32() {
        return getBitCode32Internal();
    }

    ;

    private static byte[] getSegment32_0() {
        byte[] data = {
                -34, -64, 23, 11, 0, 0, 0, 0, 44, 0, 0, 0, -4, 7, 0, 0,
                0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 1, 64, 4, 0,
                109, 7, 0, 0, 2, 64, 4, 0, 3, 0, 0, 0, 66, 67, -64, -34,
                33, 12, 0, 0, -4, 1, 0, 0, 1, 16, 0, 0, 18, 0, 0, 0,
                7, -127, 35, -111, 65, -56, 4, 73, 6, 16, 50, 57, -110, 1, -124, 12,
                37, 5, 8, 25, 30, 4, -117, 98, -128, 20, 69, 2, 66, -110, 11, 66,
                -92, 16, 50, 20, 56, 8, 24, 73, 10, 50, 68, 36, 72, 10, -112, 33,
                35, -60, 82, -128, 12, 25, 33, 114, 36, 7, -56, 72, 17, 98, -88, -96,
                -88, 64, -58, -16, 1, 0, 0, 0, 73, 24, 0, 0, 16, 0, 0, 0,
                11, -124, -1, -1, -1, -1, 31, -64, 96, 1, 1, 4, -1, -1, -1, -1,
                63, 0, 11, -124, -1, -1, -1, -1, 31, -128, 5, -62, -1, -1, -1, -1,
                15, 96, -76, -128, 0, -126, -1, -1, -1, -1, 31, -64, 96, -127, -16, -1,
                -1, -1, -1, 3, 24, 44, 16, -2, -1, -1, -1, 127, 0, 35, 0, 0,
                -119, 32, 0, 0, 28, 0, 0, 0, 50, 34, 72, 9, 32, 100, -123, 4,
                -109, 34, -92, -124, 4, -109, 34, -29, -124, -95, -112, 20, 18, 76, -118, -116,
                11, -124, -92, 76, 16, 112, 115, 4, 96, 64, -32, 40, 105, -118, 40, 97,
                -14, 35, -23, 7, -106, -59, 17, -128, 9, 113, 26, 20, 4, 18, 115, 4,
                -56, 48, 2, 65, 20, -94, 20, 0, -56, 100, 0, 40, 4, 65, 0, 80,
                26, 1, 40, -59, 66, 5, 0, 98, -61, 8, 4, 80, -124, -30, -24, 21,
                -62, 57, 0, 40, -106, 96, -47, 44, -62, 26, 84, 7, 2, 8, -51, 17,
                -128, -62, 28, 65, 48, 5, 0, 0, 19, -80, 112, -112, -121, 118, -80, -121,
                59, 104, 3, 119, 120, 7, 119, 40, -121, 54, 96, -121, 116, 112, -121, 122,
                -64, -121, 54, 56, 7, 119, -88, -121, 114, 8, 7, 113, 72, -121, 13, 104,
                80, 14, 109, -48, 14, 122, 80, 14, 109, 0, 15, 122, 48, 7, 114, -96,
                7, 115, 32, 7, 109, -112, 14, 118, 64, 7, 122, 96, 7, 116, -48, 6,
                -10, 16, 7, 114, -128, 7, 122, 96, 7, 116, -96, 7, 113, 32, 7, 120,
                -48, 6, -18, 48, 7, 114, -48, 6, -77, 96, 7, 116, -96, -13, 64, -124,
                4, 50, 66, 68, 4, 96, 30, -104, 121, 96, -26, -127, -71, 9, -25, 38,
                124, -120, 114, 0, 0, 16, 0, 0, 0, 0, 67, 20, 5, 8, 0, 1,
                0, 0, 0, 24, -94, 40, 64, 0, 8, 0, 0, 0, -64, 16, 69, 1,
                2, 64, 0, 0, 0, 0, -122, 40, 13, 16, 0, 3, 0, 0, 0, 48,
                68, -127, -128, 0, 32, 0, 0, 0, -128, 33, -118, 4, 4, 0, 1, 0,
                0, 0, 12, 81, 40, 0, 0, 2, 0, 0, 0, 96, -120, 98, 1, 1,
                48, 0, 0, 0, 0, 89, 32, 0, 7, 0, 0, 0, 50, 30, -104, 20,
                25, 17, 76, -112, -116, 9, 38, 71, -58, 4, 67, 2, 35, 0, 37, 80,
                8, -108, 71, 0, 72, -116, 0, 0, 121, 24, 0, 0, -85, 0, 0, 0,
                67, 12, -32, -71, 2, 0, 90, -96, -36, -61, 56, -96, 67, 56, -56, -61,
                47, -52, 67, 58, -24, 67, 57, 12, 49, -128, -25, 26, 0, 104, 65, -45,
                14, -23, -32, 14, -65, 80, 14, -18, 80, 15, -19, -16, 11, -13, -112, 14,
                -6, 80, 14, 67, -124, -85, 88, 32, -115, 3, 59, -124, -125, 59, -100, 3,
                24, -40, 67, 57, -56, -61, 60, -92, -61, 59, -72, 3, 24, -52, -127, 27,
                -44, 1, 24, 12, 33, -82, -29, 66, 22, 28, -10, 80, 14, -14, 48, 15,
                -23, -16, 14, -18, -80, 32, -120, -125, 33, -60, -91, 92, -53, -126, 72, 29,
                -62, -63, 30, -62, -31, 23, -32, 33, 28, -58, 97, 29, -62, -31, 28, -54,
                -31, 23, -36, 33, 28, -38, -95, 28, 22, -124, -63, 56, -68, 67, 59, -72,
                65, 57, -32, 67, 56, -76, 3, 60, -80, 67, 57, -72, 65, 56, -72, 3,
                57, -56, -61, 59, -92, 3, 57, -72, 1, 58, -112, -125, 60, -40, 67, 58,
                -108, -61, 61, -104, 67, 58, -72, 3, 57, -108, -125, 60, 12, 33, -82, -26,
                114, 22, 52, -14, 48, 15, -65, 96, 14, -16, -16, 11, -14, 80, 14, -20,
                16, 14, -8, 80, 14, -28, -80, 0, 24, 66, 92, -48, 21, 45, 104, -50,
                97, 20, -22, 65, 30, -28, -95, 28, -36, -127, 30, 76, 65, 30, -62, -95,
                29, -54, 97, -127, 32, 7, 112, 48, -124, -72, -90, 43, 90, -96, -100, 3,
                44, -56, 67, 57, -40, -125, 41, -56, 67, 56, -76, 67, 57, 12, 33, -82,
                -22, -78, 22, 40, -25, 48, 10, -11, 64, 15, -80, -16, 14, -23, -32, 14,
                -12, -128, 11, 11, -126, 58, 24, 66, 92, -40, 101, 45, 64, -50, -127, 20,
                -34, -95, 21, -54, 65, 30, -50, -95, 28, -122, 16, -105, 118, 89, 11, -102,
                115, 48, 5, 121, 8, -121, 118, 40, -121, 81, 120, -121, 122, 112, 7, 122,
                40, 7, 121, 24, 34, 92, -36, -126, 0, 14, -122, 8, 23, 50, 68, -72,
                -66, 5, -124, 60, -68, -61, 59, -48, -61, 16, -31, 10, -125, 5, 78, 59,
                -108, -125, 60, -100, 67, 57, -96, 2, 57, -56, -125, 41, -56, 67, 56, -76,
                67, 57, -52, -61, 16, -31, 26, -125, 5, 66, 29, -28, -63, 16, -29, 42,
                -125, -85, 12, -78, 104, -120, 113, -103, -63, 117, 6, 89, -76, 96, 72, 7,
                119, -96, -121, 33, -58, -123, 6, 87, 26, 100, -47, -126, -25, 29, -38, -63,
                29, -46, 1, 30, -34, -127, 30, -54, -63, 29, -24, 1, 12, -58, 1, 29,
                -62, 65, 30, -122, 8, -105, 26, 44, -120, 102, 33, 29, -38, 1, 30, -40,
                -95, 28, -64, 96, 20, -34, 96, 20, -42, 96, 13, -64, -128, 22, 68, 33,
                20, 66, 97, 68, -60, 14, -20, 96, 15, -19, -32, 6, -19, -16, 14, -28,
                80, 15, -20, 80, 14, 110, 96, 14, -20, 16, 14, -25, 48, 15, 83, 4,
                64, 24, -95, -80, 3, 59, -40, 67, 59, -72, 65, 58, -112, 67, 57, -72,
                3, 61, 76, 9, -120, 17, -57, 24, -64, -125, 60, -124, -61, 57, -76, 67,
                56, 76, 25, -116, -124, 25, -31, -116, -127, 60, -52, -61, 47, -108, 3, 62,
                -64, -61, 59, -56, 3, 61, -4, -126, 61, -124, -125, 60, 76, 41, 30, -119,
                -70, -78, 17, -48, 24, -56, -61, 60, -4, -62, 59, -120, -125, 58, -108, -61,
                56, -48, -61, 47, -52, 3, 59, -68, 3, 61, -52, -61, 20, 97, -21, 70,
                92, 99, 32, 15, -13, -16, 11, -27, -128, 15, -16, -16, 14, -14, 64, 15,
                -65, 96, 14, -17, 32, 15, -27, 16, 14, -29, -128, 14, -65, -32, 14, -31,
                -48, 14, -27, 48, 69, -16, -64, 96, -124, 52, 6, -14, 48, 15, -65, 80,
                14, -8, 0, 15, -17, 32, 15, -12, -16, 11, -26, -16, 14, -14, 80, 14,
                -31, 48, 14, -24, 48, 69, -40, -60, 0, 0, 0, 0, 121, 24, 0, 0,
                23, 0, 0, 0, 51, 8, -128, 28, -60, -31, 28, 102, 20, 1, 61, -120,
                67, 56, -124, -61, -116, 66, -128, 7, 121, 120, 7, 115, -104, 113, 12, -26,
                0, 15, -19, 16, 14, -12, -128, 14, 51, 12, 66, 30, -62, -63, 29, -50,
                -95, 28, 102, 48, 5, 61, -120, 67, 56, -124, -125, 27, -52, 3, 61, -56,
                67, 61, -116, 3, 61, -52, 120, -116, 116, 112, 7, 123, 8, 7, 121, 72,
                -121, 112, 112, 7, 122, 112, 3, 118, 120, -121, 112, 32, 7, 0, 0, 0,
                113, 32, 0, 0, 72, 0, 0, 0, -74, -16, -4, 115, 46, 44, 0, -13,
                116, 21, -2, 35, 8, 98, 9, 111, -16, -49, 118, 29, 73, 44, 49, 121,
                11, -63, 16, -51, -92, 77, 63, 37, 28, 64, -124, -41, 119, 36, -3, -64,
                -78, 56, 2, 48, 33, 78, -45, 85, -8, 127, 36, -119, 5, 32, 70, -25,
                -104, 68, 100, 16, 86, -32, 48, 68, 100, 16, -31, 16, 125, 17, -64, 16,
                -110, 17, 40, 70, 26, 17, -43, 23, 1, 12, 97, 7, 110, -16, -49, 118,
                30, 73, 32, 49, 121, 11, -63, 16, -51, -92, 77, 50, 85, -3, -108, 112,
                0, -47, -17, -42, 119, 36, -3, -64, -78, 56, 2, 48, 33, 78, -109, 36,
                -122, -32, 6, -1, 108, -25, -111, 4, 18, -109, -73, 16, 12, -47, 76, -38,
                36, 83, -43, 79, 9, 7, 16, -3, 111, 125, 71, -46, 15, 44, -117, 35,
                0, 19, -30, 52, 73, 98, 2, -115, -15, 69, 0, 67, 112, 14, -43, 76,
                68, 100, 6, 110, -16, -49, 118, 30, 73, 32, 49, 121, 11, -63, 16, -51,
                -92, 77, 50, 85, -3, -108, 112, 0, -47, 47, -41, 119, 36, -3, -64, -78,
                56, 2, 48, 33, 78, -109, 36, 6, -96, 24, 28, 53, -91, 14, -46, 76,
                -79, 13, 52, 6, 71, 69, 17, -47, 76, 95, 4, 48, -124, 49, 32, 126,
                36, -7, -61, -28, 68, -90, 112, -3, 115, -115, 11, 78, 83, 17, -47, -12,
                83, -62, 1, 68, 120, 87, -31, 63, 98, 13, 97, -16, -49, -11, 29, 73,
                -36, 66, 0, 17, 26, 36, -124, 48, -91, -11, 29, 73, 63, -80, 44, -114,
                0, 76, -120, -45, 0, 0, 0, 0, 97, 32, 0, 0, 99, 0, 0, 0,
                19, 4, 69, 44, 16, 0, 0, 0, 13, 0, 0, 0, 4, -118, -96, 12,
                -118, -94, 68, -54, 127, -96, 112, 45, -22, 92, -96, 84, -81, 11, 10, -39,
                118, -95, 28, 5, -118, -107, -93, -114, 7, -120, -108, 64, 13, 80, 25, -117,
                8, -126, 32, -104, 1, 32, 55, 3, 64, -40, 118, 12, -40, 14, 2, 0,
                116, 6, 99, -60, -64, 40, 2, 35, 13, -88, 106, -114, -95, 12, -44, -64,
                -95, 51, 24, 35, 6, 70, 17, 28, 108, 64, 85, 115, 12, 107, -48, 6,
                15, -99, -63, 24, 49, 48, -118, 0, 121, 3, -86, -102, 99, 112, 3, 56,
                -80, -26, 24, -30, 96, 12, 46, 10, -58, 112, -61, 28, 60, 96, 48, -53,
                16, 8, 116, 80, 114, 64, 6, 88, 19, 25, 96, -43, -127, 29, -64, 44,
                1, 65, -64, 24, 110, -64, 3, -57, 12, 102, 25, 6, 34, 15, -122, 27,
                -16, -128, 18, 3, 18, 70, -19, -63, -93, -61, 13, 124, -32, -124, 65, -23,
                65, 31, -16, 116, -125, 28, 76, 126, 48, 75, 64, 12, 116, 20, 119, 16,
                -4, -63, 32, 7, -62, 24, 2, 40, 56, 23, 10, 32, -58, 16, 64, -63,
                -70, 81, 0, 97, -92, -80, -119, -96, 74, 1, 67, 19, 5, 14, 4, 118,
                10, -90, 0, -126, 57, 6, 51, 64, 5, 103, 12, 1, 20, -98, 83, 5,
                16, -74, 10, -99, 8, -118, 21, 50, 52, 82, -16, 68, 80, -82, -112, -95,
                -119, -62, 7, -125, -126, -123, 86, -120, -118, -123, 87, -120, 57, -122, 84, -112,
                -123, -57, 86, 1, 12, 68, 80, -76, -128, -95, -119, 66, 24, -128, -64, 108,
                -95, 22, 64, 48, -57, 48, 11, -73, 96, -51, 49, -32, -126, 118, 17, 26,
                -116, 17, -125, -61, 8, 18, 93, -112, 3, -86, 26, 49, 48, -114, 96, -55,
                5, 71, 27, 49, 32, -114, 64, -39, -123, -28, -123, 112, 32, 0, 0, 0,
                7, 0, 0, 0, 6, -44, 48, 68, 100, 16, 67, -118, 92, -60, -30, -45,
                70, 17, 92, 86, 17, 96, 54, -111, 60, 17, 81, -91, -56, 69, 44, 0,
                1, 49, 0, 0, 4, 0, 0, 0, 91, 6, 37, 32, -125, 45, 67, 20,
                -112, -63, -106, -95, 10, -56, 0, 0, 0, 0, 0, 0, 97, 32, 0, 0,
                4, 0, 0, 0, 19, 4, -63, -120, 1, 97, 4, -51, 48, 98, 64, 24,
                65, 67, 32, 0, 0, 0, 0, 0,
        };
        return data;
    }

    private static int bitCode32Length = 2088;

    private static byte[] getBitCode32Internal() {
        byte[] bc = new byte[bitCode32Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment32_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

    // return byte array representation of the 64-bit bitcode.
    public static byte[] getBitCode64() {
        return getBitCode64Internal();
    }

    ;

    private static byte[] getSegment64_0() {
        byte[] data = {
                -34, -64, 23, 11, 0, 0, 0, 0, 44, 0, 0, 0, -128, 8, 0, 0,
                0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 1, 64, 4, 0,
                109, 7, 0, 0, 2, 64, 4, 0, 3, 0, 0, 0, 66, 67, -64, -34,
                33, 12, 0, 0, 29, 2, 0, 0, 1, 16, 0, 0, 18, 0, 0, 0,
                7, -127, 35, -111, 65, -56, 4, 73, 6, 16, 50, 57, -110, 1, -124, 12,
                37, 5, 8, 25, 30, 4, -117, 98, -128, 20, 69, 2, 66, -110, 11, 66,
                -92, 16, 50, 20, 56, 8, 24, 73, 10, 50, 68, 36, 72, 10, -112, 33,
                35, -60, 82, -128, 12, 25, 33, 114, 36, 7, -56, 72, 17, 98, -88, -96,
                -88, 64, -58, -16, 1, 0, 0, 0, 73, 24, 0, 0, 16, 0, 0, 0,
                11, -124, -1, -1, -1, -1, 31, -64, 96, -127, -16, -1, -1, -1, -1, 3,
                -80, -64, 8, 64, 16, 4, 65, -112, 16, 64, 16, 4, 65, -112, -8, -1,
                -1, -1, -1, 1, 12, 22, 8, -1, -1, -1, -1, 63, -128, -47, 2, -31,
                -1, -1, -1, -1, 7, 48, 88, 32, -4, -1, -1, -1, -1, 0, 70, 0,
                -119, 32, 0, 0, 30, 0, 0, 0, 50, 34, 72, 9, 32, 100, -123, 4,
                -109, 34, -92, -124, 4, -109, 34, -29, -124, -95, -112, 20, 18, 76, -118, -116,
                11, -124, -92, 76, 16, 120, 115, 4, 96, 64, 96, -114, 0, 20, 72, -100,
                37, 77, 17, 37, 76, 126, 36, -3, -64, -78, 56, 2, 48, 33, 78, -29,
                -45, -120, 24, 99, 12, 34, 115, 4, -56, 48, 2, 97, 20, -30, 0, 0,
                8, 21, -62, 20, 0, 72, -115, 0, -112, -103, 35, 8, -118, -63, 90, 19,
                -64, -47, 43, 5, 43, 0, 0, -118, -61, 8, 4, 80, -124, 51, -119, 22,
                98, 78, 0, -56, -106, -128, 17, 46, 2, 43, -92, 7, 2, -90, 0, 0,
                19, -76, 112, 8, 7, 121, 24, 7, 116, -80, 3, 58, 104, 3, 119, 120,
                7, 119, 40, -121, 54, 96, -121, 116, 112, -121, 122, -64, -121, 54, 56, 7,
                119, -88, -121, 114, 8, 7, 113, 72, -121, 13, 97, 80, 14, 109, -48, 14,
                122, 80, 14, 109, -112, 14, 118, 64, 7, 122, 96, 7, 116, -48, 6, -23,
                16, 7, 114, -128, 7, 122, 16, 7, 114, -128, 7, 109, -32, 14, 115, 32,
                7, 122, 96, 7, 116, -48, 6, -77, 16, 7, 114, -128, 7, 58, 15, 100,
                72, 32, 35, 68, 70, 0, 6, 4, 99, 64, 48, 6, 4, 99, 85, 72,
                86, -123, 28, -94, 36, 0, 0, 4, 0, 0, 0, -64, 16, 101, 1, 2,
                64, 0, 0, 0, 0, -122, 40, 16, 16, 0, 3, 0, 0, 0, 48, 68,
                89, -128, 0, 16, 0, 0, 0, -128, 33, -54, 2, 4, -128, 0, 0, 0,
                0, 12, 81, 36, 32, 0, 4, 0, 0, 0, 96, -120, 82, 1, 1, 64,
                0, 0, 0, 0, 67, -108, 11, 8, 0, 2, 0, 0, 0, 24, -94, 100,
                0, 0, 4, 0, 0, 0, -64, 16, 101, 3, 2, 64, 0, 0, 0, 0,
                -78, 64, 0, 0, 8, 0, 0, 0, 50, 30, -104, 20, 25, 17, 76, -112,
                -116, 9, 38, 71, -58, 4, 67, 2, 35, 0, 36, 70, 0, 10, -94, 64,
                10, -122, -56, 8, 0, 0, 0, 0, 121, 24, 0, 0, -92, 0, 0, 0,
                67, 4, 46, 88, 32, -115, 3, 59, -124, -125, 59, -100, 3, 24, -40, 67,
                57, -56, -61, 60, -92, -61, 59, -72, 3, 24, -52, -127, 27, -44, 1, 24,
                12, 33, -72, -127, 35, 22, 28, -10, 80, 14, -14, 48, 15, -23, -16, 14,
                -18, -80, 32, -120, -125, 33, 4, 103, 112, -57, -126, 72, 29, -62, -63, 30,
                -62, -31, 23, -32, 33, 28, -58, 97, 29, -62, -31, 28, -54, -31, 23, -36,
                33, 28, -38, -95, 28, 22, -124, -63, 56, -68, 67, 59, -72, 65, 57, -32,
                67, 56, -76, 3, 60, -80, 67, 57, -72, 65, 56, -72, 3, 57, -56, -61,
                59, -92, 3, 57, -72, 1, 58, -112, -125, 60, -40, 67, 58, -108, -61, 61,
                -104, 67, 58, -72, 3, 57, -108, -125, 60, 12, 33, -72, -124, 83, 22, 52,
                -14, 48, 15, -65, 96, 14, -16, -16, 11, -14, 80, 14, -20, 16, 14, -8,
                80, 14, -28, -80, 0, 24, 66, 112, 12, -41, 44, 104, -50, 97, 20, -22,
                65, 30, -28, -95, 28, -36, -127, 30, 76, 65, 30, -62, -95, 29, -54, 97,
                -127, 32, 7, 112, 48, -124, -32, 30, -82, 89, -96, -100, 3, 44, -56, 67,
                57, -40, -125, 41, -56, 67, 56, -76, 67, 57, 12, 33, -72, -120, -109, 22,
                40, -25, 48, 10, -11, 64, 15, -80, -16, 14, -23, -32, 14, -12, -128, 11,
                11, -126, 58, 24, 66, 112, 20, 39, 45, 64, -50, -127, 20, -34, -95, 21,
                -54, 65, 30, -50, -95, 28, -122, 16, -100, -59, 73, 11, -102, 115, 48, 5,
                121, 8, -121, 118, 40, -121, 81, 120, -121, 122, 112, 7, 122, 40, 7, 121,
                24, 34, 112, -40, -126, 0, 14, -122, 8, 28, 49, 68, -32, -74, 5, -124,
                60, -68, -61, 59, -48, -61, 16, -127, -21, 22, 56, -19, 80, 14, -14, 112,
                14, -27, -128, 10, -28, 32, 15, -90, 32, 15, -31, -48, 14, -27, 48, 15,
                67, 4, -18, 91, 32, -44, 65, 30, 12, -63, 4, 72, -120, -72, 48, 16,
                34, 33, -30, -62, 64, -112, -124, -120, 11, 3, 97, 18, 34, 46, 12, -122,
                24, -100, 24, 112, 98, 32, 64, 67, 12, 110, 12, 56, 50, 16, -96, 5,
                75, 56, -72, 67, 62, -128, 1, 60, -68, 67, 58, -72, 3, 61, -108, -125,
                60, 12, 49, -72, 50, -32, -52, 64, -128, 22, 60, -17, -48, 14, -18, -112,
                14, -16, -16, 14, -12, 80, 14, -18, 64, 15, 96, 48, 14, -24, 16, 14,
                -14, 48, 68, -32, -50, 96, 65, 52, 11, -23, -48, 14, -16, -64, 14, -27,
                0, 6, -93, -16, 6, -93, -80, 6, 107, 0, 6, -76, 32, 10, -95, 16,
                10, 67, 12, 46, 13, -72, 52, 16, -96, 33, 6, -89, 6, 28, 25, 8,
                -48, -126, 33, 29, -36, -127, 30, 70, 40, -20, -64, 14, -10, -48, 14, 110,
                -112, 14, -28, 80, 14, -18, 64, 15, 83, 2, 96, -60, 49, 6, -16, 32,
                15, -31, 112, 14, -19, 16, 14, 83, 6, -95, 64, 70, 56, 99, 32, 15,
                -13, -16, 11, -27, -128, 15, -16, -16, 14, -14, 64, 15, -65, 96, 15, -31,
                32, 15, 83, -118, -59, -127, -90, 106, 4, 52, 6, -14, 48, 15, -65, -16,
                14, -30, -96, 14, -27, 48, 14, -12, -16, 11, -13, -64, 14, -17, 64, 15,
                -13, 48, 69, -72, -78, 17, -41, 24, -56, -61, 60, -4, 66, 57, -32, 3,
                60, -68, -125, 60, -48, -61, 47, -104, -61, 59, -56, 67, 57, -124, -61, 56,
                -96, -61, 47, -72, 67, 56, -76, 67, 57, 76, 17, 52, 110, -124, 52, 6,
                -14, 48, 15, -65, 80, 14, -8, 0, 15, -17, 32, 15, -12, -16, 11, -26,
                -16, 14, -14, 80, 14, -31, 48, 14, -24, 48, 69, -72, 60, 0, 0, 0,
                121, 24, 0, 0, 23, 0, 0, 0, 51, 8, -128, 28, -60, -31, 28, 102,
                20, 1, 61, -120, 67, 56, -124, -61, -116, 66, -128, 7, 121, 120, 7, 115,
                -104, 113, 12, -26, 0, 15, -19, 16, 14, -12, -128, 14, 51, 12, 66, 30,
                -62, -63, 29, -50, -95, 28, 102, 48, 5, 61, -120, 67, 56, -124, -125, 27,
                -52, 3, 61, -56, 67, 61, -116, 3, 61, -52, 120, -116, 116, 112, 7, 123,
                8, 7, 121, 72, -121, 112, 112, 7, 122, 112, 3, 118, 120, -121, 112, 32,
                7, 0, 0, 0, 113, 32, 0, 0, 77, 0, 0, 0, -58, -16, -4, 115,
                46, 44, 0, -13, 116, 21, -2, 35, 8, 98, 10, 111, -16, -49, 118, 29,
                73, 44, 49, 121, 11, -63, 16, -51, -92, 77, 63, 37, 28, 64, -124, -41,
                119, 36, -3, -64, -78, 56, 2, 48, 33, 78, -45, 85, -8, 127, 36, -119,
                5, 32, 70, -25, -104, 68, 100, 16, 86, -32, 48, 68, 100, 16, -31, 16,
                125, 17, -64, 16, -110, 17, 40, 70, 26, 17, -43, 23, 1, 12, 97, 8,
                110, -16, -49, 118, 30, 73, 32, 49, 121, 11, -63, 16, -51, -92, 77, 50,
                85, -3, -108, 112, 0, -47, -17, -42, 119, 36, -3, -64, -78, 56, 2, 48,
                33, 78, -109, 36, -106, -32, 6, -1, 108, -25, -111, 4, 18, -109, -73, 16,
                12, -47, 76, -38, 36, 83, -43, 79, 9, 7, 16, -3, 111, 125, 71, -46,
                15, 44, -117, 35, 0, 19, -30, 52, 73, 98, 2, -115, -15, 69, 0, 67,
                112, 14, -43, 76, 68, 100, 7, -39, -78, 84, -116, -49, 16, -116, -16, 96,
                -2, 67, 35, -68, -1, -48, 8, -17, 35, 58, 110, 6, 110, -16, -49, 118,
                30, 73, 32, 49, 121, 11, -63, 16, -51, -92, 77, 50, 85, -3, -108, 112,
                0, -47, 47, -41, 119, 36, -3, -64, -78, 56, 2, 48, 33, 78, -109, 36,
                6, -96, 24, 28, 53, -91, 14, -46, 76, -79, 13, 52, 6, 71, 69, 17,
                -47, 76, 95, 4, 48, -124, 53, 32, 126, 36, -7, -61, -28, 68, -74, 112,
                -3, 115, -115, 11, 78, 83, 17, -47, -12, 83, -62, 1, 68, 120, 87, -31,
                63, 98, 14, 97, -16, -49, -11, 29, 73, -36, 66, 0, 17, 26, 36, -124,
                48, -91, -11, 29, 73, 63, -80, 44, -114, 0, 76, -120, -45, 0, 0, 0,
                97, 32, 0, 0, -126, 0, 0, 0, 19, 4, 69, 44, 16, 0, 0, 0,
                16, 0, 0, 0, 4, 10, -94, 4, -118, -94, 68, -54, 127, -96, 112, 45,
                -22, 92, -96, 84, -81, 11, 10, -39, 118, -95, 28, 5, -118, -107, -93, -114,
                7, 72, -108, 64, 1, 21, 65, 25, -112, 41, -127, 26, -96, 51, 22, 17,
                4, 65, 48, 3, 64, 115, 6, -128, -36, 8, 0, 53, -37, 66, 96, 91,
                6, 0, 0, 0, 51, 17, -123, 64, 6, -60, 76, 68, 33, -112, 1, 49,
                19, 81, 8, 100, 64, -52, 68, 20, 2, 25, 16, 87, -99, 61, 56, 104,
                59, 98, -128, 0, -64, 81, 7, 111, 80, 6, 88, 27, -116, 24, 24, 5,
                96, -64, -127, 117, -51, 49, -84, -127, 29, 64, 23, 7, 109, 71, 12, 16,
                0, 56, -16, -32, 13, -54, 0, 107, -125, 17, 3, -93, 0, -112, 56, -80,
                -82, 57, -122, 59, -56, 3, 50, 56, 57, 104, 59, 98, -128, 0, -64, -79,
                7, 111, 80, 6, 88, 27, -116, 24, 24, 5, -112, -56, -127, 117, -51, 49,
                -24, 1, 31, -104, -63, 28, 67, 31, -92, -63, 25, 80, 48, -122, 27, -2,
                32, 3, -125, 89, -122, 64, 0, -123, -14, 3, 53, -64, -94, 3, 53, -64,
                10, 5, 81, -128, 89, 2, -126, -128, 49, -36, 64, 10, -113, 25, -52, 50,
                12, 68, 41, 12, 55, -112, -126, 37, 6, 36, -116, 58, -123, 76, -121, 27,
                80, -31, 9, -125, 50, -123, 84, -32, -23, 6, 63, -96, 3, 85, -104, 37,
                32, 6, 58, -114, 81, 8, 86, 97, -16, 3, 97, 12, -127, 21, -96, 107,
                5, 16, 99, 8, -84, 96, 6, -9, 10, 32, 12, 22, 58, 17, 84, 44,
                104, 104, -82, -32, -127, -64, 102, 65, 22, 64, 48, -57, -64, 6, -76, 0,
                -115, 33, -80, 2, 25, -100, 45, -128, -80, 91, -8, 68, 80, -72, -80, -95,
                -63, 2, 24, -120, -96, 116, 97, 67, 115, -123, 48, -128, 65, -15, 66, 46,
                68, -11, -62, 46, -60, 28, 67, 45, -8, 2, 25, -40, 45, -120, -127, 8,
                10, 28, 52, 52, 87, 24, 3, 16, -104, 56, -124, 3, 8, -26, 24, 126,
                97, 28, -52, 96, -114, -127, 28, -72, 51, -72, 57, 104, 59, 98, -128, 0,
                -64, 97, 14, 110, 80, 6, 88, 27, -100, 31, -128, 29, 49, 56, 10, 64,
                -103, -125, 115, -80, -82, 17, 3, -61, 0, -104, 114, 120, -72, 17, 3, -62,
                0, 22, 116, -56, 116, 8, 7, 2, 9, 0, 0, 0, -58, -44, 48, 68,
                100, 16, 67, -118, 92, -60, -30, -45, 102, 17, 92, 118, 17, 96, 86, 1,
                61, 17, 81, -91, -56, 69, 44, -66, -32, 16, -111, 64, 0, 0, 0, 0,
                1, 49, 0, 0, 9, 0, 0, 0, 91, 6, -93, 0, -125, 45, -125, 82,
                -128, -63, -106, -63, 41, -64, 96, -53, 32, 5, 104, -80, 101, -56, 2, 52,
                -40, 50, 116, 1, 26, 108, 25, -4, -96, 0, 3, 0, 0, 0, 0, 0,
                97, 32, 0, 0, 4, 0, 0, 0, 19, 4, -63, -120, 1, 81, 4, -50,
                48, 98, 64, 20, -127, 67, 32, 0, 0, 0, 0, 0,
        };
        return data;
    }

    private static int bitCode64Length = 2220;

    private static byte[] getBitCode64Internal() {
        byte[] bc = new byte[bitCode64Length];
        int offset = 0;
        byte[] seg;
        seg = getSegment64_0();
        System.arraycopy(seg, 0, bc, offset, seg.length);
        offset += seg.length;
        return bc;
    }

}
