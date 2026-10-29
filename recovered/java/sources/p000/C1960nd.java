            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: nd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1960nd extends C1923md {
                /* JADX INFO: renamed from: b */
                public static void m6964b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
/* 1 */             bArr.getClass();
/* 4 */             bArr2.getClass();
/* 8 */             System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
                }

                /* JADX INFO: renamed from: c */
                public static void m6965c(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
/* 1 */             objArr.getClass();
/* 4 */             objArr2.getClass();
/* 8 */             System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
                }

                /* JADX INFO: renamed from: d */
                public static byte[] m6966d(byte[] bArr, int i, int i2) {
/* 1 */             bArr.getClass();
/* 5 */             C1886ld.m6419a(i2, bArr.length);
/* 8 */             byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
/* 12 */            bArrCopyOfRange.getClass();
/* 15 */            return bArrCopyOfRange;
                }

                /* JADX INFO: renamed from: e */
                public static Object[] m6967e(Object[] objArr, int i, int i2) {
/* 1 */             objArr.getClass();
/* 5 */             C1886ld.m6419a(i2, objArr.length);
/* 8 */             Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
/* 12 */            objArrCopyOfRange.getClass();
/* 15 */            return objArrCopyOfRange;
                }

                /* JADX INFO: renamed from: f */
                public static void m6968f(Object[] objArr, int i, int i2) {
/* 1 */             objArr.getClass();
/* 5 */             Arrays.fill(objArr, i, i2, (Object) null);
                }
            }
