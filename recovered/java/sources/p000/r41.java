            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Locale;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class r41 {

                /* JADX INFO: renamed from: a */
                public static final CopyOnWriteArrayList f15874a = new CopyOnWriteArrayList();

                /* JADX INFO: renamed from: a */
                public static C1881l8 m8063a(String str) throws GeneralSecurityException {
                    boolean zStartsWith;
/* 11 */            for (C1881l8 c1881l8 : f15874a) {
                        synchronized (c1881l8) {
/* 28 */                    zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
                        }
/* 33 */                if (zStartsWith) {
/* 35 */                    return c1881l8;
                        }
                    }
/* 50 */            throw new GeneralSecurityException(AbstractC0886en.m3507k("No KMS client does support: ", str));
                }
            }
