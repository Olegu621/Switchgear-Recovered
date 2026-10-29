            package p000;

            import android.view.DisplayCutout;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b90 {

                /* JADX INFO: renamed from: a */
                public final DisplayCutout f2329a;

                public b90(DisplayCutout displayCutout) {
/* 4 */             this.f2329a = displayCutout;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || b90.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return this.f2329a.equals(((b90) obj).f2329a);
                }

                public final int hashCode() {
/* 1 */             return this.f2329a.hashCode();
                }

                public final String toString() {
/* 18 */            return "DisplayCutoutCompat{" + this.f2329a + "}";
                }
            }
