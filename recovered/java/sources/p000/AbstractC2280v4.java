            package p000;

            import java.security.GeneralSecurityException;
            
            /* JADX INFO: renamed from: v4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2280v4 {

                /* JADX INFO: renamed from: a */
                public static final jr1 f17855a;

                /* JADX INFO: renamed from: b */
                public static final ir1 f17856b;

                /* JADX INFO: renamed from: c */
                public static final t31 f17857c;

                /* JADX INFO: renamed from: d */
                public static final p31 f17858d;

                static {
/* 3 */             C2335wl c2335wlM7290b = p13.m7290b("type.googleapis.com/google.crypto.tink.AesCmacKey");
/* 14 */            f17855a = new jr1(C2168s4.class);
/* 21 */            f17856b = new ir1(c2335wlM7290b);
/* 30 */            f17857c = new t31(C1818k4.class);
/* 43 */            f17858d = new p31(c2335wlM7290b, new C1951n4(1));
                }

                /* JADX INFO: renamed from: a */
                public static C2131r4 m9218a(wq1 wq1Var) throws GeneralSecurityException {
/* 1 */             int iOrdinal = wq1Var.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 50 */                return C2131r4.f15848c;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 47 */                return C2131r4.f15850e;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 44 */                return C2131r4.f15851f;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 17 */                return C2131r4.f15849d;
                    }
/* 43 */            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var.m9602b());
                }
            }
