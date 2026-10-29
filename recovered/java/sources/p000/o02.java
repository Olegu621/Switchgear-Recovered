            package p000;

            import java.security.SecureRandom;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class o02 {

                /* JADX INFO: renamed from: a */
                public static final C0942g5 f14580a = new C0942g5(6);

                /* JADX INFO: renamed from: a */
                public static byte[] m7088a(int i) {
/* 1 */             byte[] bArr = new byte[i];
/* 11 */            ((SecureRandom) f14580a.get()).nextBytes(bArr);
/* 14 */            return bArr;
                }
            }
