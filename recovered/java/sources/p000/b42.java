            package p000;

            import android.content.res.Resources;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b42 {

                /* JADX INFO: renamed from: a */
                public final Resources f2208a;

                /* JADX INFO: renamed from: b */
                public final Resources.Theme f2209b;

                public b42(Resources resources, Resources.Theme theme) {
/* 4 */             this.f2208a = resources;
/* 6 */             this.f2209b = theme;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && b42.class == obj.getClass()) {
/* 17 */                b42 b42Var = (b42) obj;
/* 27 */                if (this.f2208a.equals(b42Var.f2208a) && Objects.equals(this.f2209b, b42Var.f2209b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Objects.hash(this.f2208a, this.f2209b);
                }
            }
