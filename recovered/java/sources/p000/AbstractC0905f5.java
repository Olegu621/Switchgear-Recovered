            package p000;

            import java.security.GeneralSecurityException;
            
            /* JADX INFO: renamed from: f5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0905f5 {

                /* JADX INFO: renamed from: a */
                public static final jr1 f7996a;

                /* JADX INFO: renamed from: b */
                public static final ir1 f7997b;

                /* JADX INFO: renamed from: c */
                public static final t31 f7998c;

                /* JADX INFO: renamed from: d */
                public static final p31 f7999d;

                static {
/* 3 */             C2335wl c2335wlM7290b = p13.m7290b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
/* 14 */            f7996a = new jr1(C0868e5.class);
/* 21 */            f7997b = new ir1(c2335wlM7290b);
/* 30 */            f7998c = new t31(C2485y4.class);
/* 43 */            f7999d = new p31(c2335wlM7290b, new C1951n4(2));
                }

                /* JADX INFO: renamed from: a */
                public static C0204c5 m3669a(st0 st0Var) throws GeneralSecurityException {
/* 1 */             int iOrdinal = st0Var.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 56 */                return C0204c5.f2701c;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 53 */                return C0204c5.f2704f;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 50 */                return C0204c5.f2703e;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 47 */                return C0204c5.f2705g;
                    }
/* 18 */            if (iOrdinal == 5) {
/* 20 */                return C0204c5.f2702d;
                    }
/* 46 */            throw new GeneralSecurityException("Unable to parse HashType: " + st0Var.m8632a());
                }
            }
