            package p000;

            import java.nio.charset.Charset;
            import java.security.SecureRandom;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class p13 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f14948a = 0;

                static {
/* 3 */             Charset.forName("UTF-8");
                }

                /* JADX INFO: renamed from: a */
                public static int m7289a() {
/* 3 */             SecureRandom secureRandom = new SecureRandom();
/* 7 */             byte[] bArr = new byte[4];
/* 10 */            int i = 0;
/* 11 */            while (i == 0) {
/* 13 */                secureRandom.nextBytes(bArr);
/* 43 */                i = ((bArr[0] & 127) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
/* 45 */            return i;
                }

                /* JADX INFO: renamed from: b */
                public static final C2335wl m7290b(String str) {
/* 5 */             byte[] bArr = new byte[str.length()];
/* 12 */            for (int i = 0; i < str.length(); i++) {
/* 14 */                char cCharAt = str.charAt(i);
/* 20 */                if (cCharAt < '!' || cCharAt > '~') {
/* 51 */                    throw new C2086px("Not a printable ASCII character: " + cCharAt);
                        }
/* 27 */                bArr[i] = (byte) cCharAt;
                    }
/* 52 */            return C2335wl.m9584a(bArr);
                }
            }
