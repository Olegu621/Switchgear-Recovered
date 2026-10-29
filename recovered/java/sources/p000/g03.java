            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g03 extends pg3 {

                /* JADX INFO: renamed from: i */
                public final pt1 f8426i;

                public g03(pt1 pt1Var) {
/* 4 */             this.f8426i = pt1Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 19 */                return true;
                    }
                    return (obj instanceof g03) && this.f8426i == ((g03) obj).f8426i;
                }

                public final int hashCode() {
/* 7 */             return this.f8426i.hashCode() * 961;
                }

                public final String toString() {
/* 18 */            return "Popup(position=" + this.f8426i + ", horizontalMarginInDp=null, verticalMarginInDp=null)";
                }
            }
