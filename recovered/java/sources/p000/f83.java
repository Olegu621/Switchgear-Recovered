            package p000;

            import android.view.DisplayCutout;
            import android.view.WindowInsets;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class f83 extends e83 {
                public f83(m83 m83Var, WindowInsets windowInsets) {
/* 1 */             super(m83Var, windowInsets);
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: a */
                public m83 mo3677a() {
/* 8 */             return m83.m6620h(this.f7059c.consumeDisplayCutout(), null);
                }

                @Override // p000.j83
                /* JADX INFO: renamed from: e */
                public b90 mo3678e() {
/* 1 */             DisplayCutout displayCutout = this.f7059c.getDisplayCutout();
/* 7 */             if (displayCutout == null) {
/* 9 */                 return null;
                    }
/* 13 */            return new b90(displayCutout);
                }

                @Override // p000.d83, p000.j83
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof f83)) {
/* 7 */                 return false;
                    }
/* 11 */            f83 f83Var = (f83) obj;
                    return Objects.equals(this.f7059c, f83Var.f7059c) && Objects.equals(this.f7063g, f83Var.f7063g);
                }

                @Override // p000.j83
                public int hashCode() {
/* 3 */             return this.f7059c.hashCode();
                }
            }
