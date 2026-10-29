            package p000;

            import com.google.android.gms.common.Feature;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class db3 {

                /* JADX INFO: renamed from: a */
                public final C2323w9 f7084a;

                /* JADX INFO: renamed from: b */
                public final Feature f7085b;

                public /* synthetic */ db3(C2323w9 c2323w9, Feature feature) {
/* 4 */             this.f7084a = c2323w9;
/* 6 */             this.f7085b = feature;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || !(obj instanceof db3)) {
/* 31 */                return false;
                    }
/* 7 */             db3 db3Var = (db3) obj;
                    return de3.m3029k(this.f7084a, db3Var.f7084a) && de3.m3029k(this.f7085b, db3Var.f7085b);
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f7084a, this.f7085b});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f7084a, "key");
/* 17 */            wc0Var.m9529d(this.f7085b, "feature");
/* 20 */            return wc0Var.toString();
                }
            }
