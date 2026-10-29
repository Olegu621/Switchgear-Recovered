            package p000;

            import android.text.TextUtils;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sf1 implements qf1 {

                /* JADX INFO: renamed from: a */
                public String f16572a;

                /* JADX INFO: renamed from: b */
                public int f16573b;

                /* JADX INFO: renamed from: c */
                public int f16574c;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof sf1)) {
/* 7 */                 return false;
                    }
/* 11 */            sf1 sf1Var = (sf1) obj;
                    return TextUtils.equals(this.f16572a, sf1Var.f16572a) && this.f16573b == sf1Var.f16573b && this.f16574c == sf1Var.f16574c;
                }

                public final int hashCode() {
/* 19 */            return Objects.hash(this.f16572a, Integer.valueOf(this.f16573b), Integer.valueOf(this.f16574c));
                }
            }
