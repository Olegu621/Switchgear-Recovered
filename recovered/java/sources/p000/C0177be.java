            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: be */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0177be implements InterfaceC0172b9 {

                /* JADX INFO: renamed from: c */
                public static final C0177be f2381c = new C0177be(new C0210cb(8));

                /* JADX INFO: renamed from: a */
                public final boolean f2382a;

                /* JADX INFO: renamed from: b */
                public final String f2383b;

                public C0177be(C0210cb c0210cb) {
/* 12 */            this.f2382a = ((Boolean) c0210cb.f2804b).booleanValue();
/* 18 */            this.f2383b = (String) c0210cb.f2805c;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C0177be)) {
/* 7 */                 return false;
                    }
/* 11 */            C0177be c0177be = (C0177be) obj;
                    return de3.m3029k(null, null) && this.f2382a == c0177be.f2382a && de3.m3029k(this.f2383b, c0177be.f2383b);
                }

                public final int hashCode() {
/* 14 */            return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f2382a), this.f2383b});
                }
            }
