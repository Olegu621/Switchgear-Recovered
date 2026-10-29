            package p000;

            import androidx.core.graphics.drawable.IconCompat;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xr1 {

                /* JADX INFO: renamed from: a */
                public CharSequence f19333a;

                /* JADX INFO: renamed from: b */
                public IconCompat f19334b;

                /* JADX INFO: renamed from: c */
                public String f19335c;

                /* JADX INFO: renamed from: d */
                public String f19336d;

                /* JADX INFO: renamed from: e */
                public boolean f19337e;

                /* JADX INFO: renamed from: f */
                public boolean f19338f;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == null || !(obj instanceof xr1)) {
/* 1 */                 return false;
                    }
/* 10 */            xr1 xr1Var = (xr1) obj;
/* 12 */            String str = this.f19336d;
/* 14 */            String str2 = xr1Var.f19336d;
/* 16 */            if (str == null && str2 == null) {
                        return Objects.equals(Objects.toString(this.f19333a), Objects.toString(xr1Var.f19333a)) && Objects.equals(this.f19335c, xr1Var.f19335c) && Boolean.valueOf(this.f19337e).equals(Boolean.valueOf(xr1Var.f19337e)) && Boolean.valueOf(this.f19338f).equals(Boolean.valueOf(xr1Var.f19338f));
                    }
/* 88 */            return Objects.equals(str, str2);
                }

                public final int hashCode() {
/* 1 */             String str = this.f19336d;
                    return str != null ? str.hashCode() : Objects.hash(this.f19333a, this.f19335c, Boolean.valueOf(this.f19337e), Boolean.valueOf(this.f19338f));
                }
            }
