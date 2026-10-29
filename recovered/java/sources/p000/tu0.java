            package p000;

            import java.security.GeneralSecurityException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class tu0 {

                /* JADX INFO: renamed from: a */
                public static final jr1 f17270a;

                /* JADX INFO: renamed from: b */
                public static final ir1 f17271b;

                /* JADX INFO: renamed from: c */
                public static final t31 f17272c;

                /* JADX INFO: renamed from: d */
                public static final p31 f17273d;

                static {
/* 3 */             C2335wl c2335wlM7290b = p13.m7290b("type.googleapis.com/google.crypto.tink.HmacKey");
/* 14 */            f17270a = new jr1(qu0.class);
/* 21 */            f17271b = new ir1(c2335wlM7290b);
/* 30 */            f17272c = new t31(nu0.class);
/* 43 */            f17273d = new p31(c2335wlM7290b, new ds0(2));
                }

                /* JADX INFO: renamed from: a */
                public static C0832d5 m8917a(st0 st0Var) throws GeneralSecurityException {
/* 1 */             int iOrdinal = st0Var.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 56 */                return C0832d5.f6982V;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 53 */                return C0832d5.f6985Y;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 50 */                return C0832d5.f6984X;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 47 */                return C0832d5.f6986Z;
                    }
/* 18 */            if (iOrdinal == 5) {
/* 20 */                return C0832d5.f6983W;
                    }
/* 46 */            throw new GeneralSecurityException("Unable to parse HashType: " + st0Var.m8632a());
                }

                /* JADX INFO: renamed from: b */
                public static C2131r4 m8918b(wq1 wq1Var) throws GeneralSecurityException {
/* 1 */             int iOrdinal = wq1Var.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 50 */                return C2131r4.f15859n;
                    }
/* 9 */             if (iOrdinal == 2) {
/* 47 */                return C2131r4.f15861p;
                    }
/* 12 */            if (iOrdinal == 3) {
/* 44 */                return C2131r4.f15862q;
                    }
/* 15 */            if (iOrdinal == 4) {
/* 17 */                return C2131r4.f15860o;
                    }
/* 43 */            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + wq1Var.m9602b());
                }
            }
