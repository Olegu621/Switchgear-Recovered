            package p000;

            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.nio.IntBuffer;
            
            /* JADX INFO: renamed from: is */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1768is {

                /* JADX INFO: renamed from: a */
                public static final int[] f11916a = m5550c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

                /* JADX INFO: renamed from: a */
                public static void m5548a(int i, int i2, int i3, int i4, int[] iArr) {
/* 5 */             int i5 = iArr[i] + iArr[i2];
/* 6 */             iArr[i] = i5;
/* 10 */            int i6 = i5 ^ iArr[i4];
/* 15 */            int i7 = (i6 >>> (-16)) | (i6 << 16);
/* 16 */            iArr[i4] = i7;
/* 20 */            int i8 = iArr[i3] + i7;
/* 21 */            iArr[i3] = i8;
/* 25 */            int i9 = iArr[i2] ^ i8;
/* 30 */            int i10 = (i9 >>> (-12)) | (i9 << 12);
/* 31 */            iArr[i2] = i10;
/* 35 */            int i11 = iArr[i] + i10;
/* 36 */            iArr[i] = i11;
/* 40 */            int i12 = iArr[i4] ^ i11;
/* 45 */            int i13 = (i12 >>> (-8)) | (i12 << 8);
/* 46 */            iArr[i4] = i13;
/* 50 */            int i14 = iArr[i3] + i13;
/* 51 */            iArr[i3] = i14;
/* 55 */            int i15 = iArr[i2] ^ i14;
/* 61 */            iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
                }

                /* JADX INFO: renamed from: b */
                public static void m5549b(int[] iArr) {
/* 7 */             for (int i = 0; i < 10; i++) {
/* 14 */                m5548a(0, 4, 8, 12, iArr);
/* 23 */                m5548a(1, 5, 9, 13, iArr);
/* 30 */                m5548a(2, 6, 10, 14, iArr);
/* 39 */                m5548a(3, 7, 11, 15, iArr);
/* 42 */                m5548a(0, 5, 10, 15, iArr);
/* 45 */                m5548a(1, 6, 11, 12, iArr);
/* 48 */                m5548a(2, 7, 8, 13, iArr);
/* 54 */                m5548a(3, 4, 9, 14, iArr);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static int[] m5550c(byte[] bArr) {
/* 11 */            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
/* 19 */            int[] iArr = new int[intBufferAsIntBuffer.remaining()];
/* 21 */            intBufferAsIntBuffer.get(iArr);
/* 24 */            return iArr;
                }
            }
