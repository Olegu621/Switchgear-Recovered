            package p000;

            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class su1 {

                /* JADX INFO: renamed from: a */
                public final String f16801a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f16802b;

                public su1(String str, ArrayList arrayList) {
/* 4 */             this.f16801a = str;
/* 6 */             this.f16802b = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof su1)) {
/* 32 */                return false;
                    }
/* 9 */             su1 su1Var = (su1) obj;
                    return this.f16801a.equals(su1Var.f16801a) && this.f16802b.equals(su1Var.f16802b);
                }

                public final int hashCode() {
/* 15 */            return this.f16802b.hashCode() + (this.f16801a.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "PredefinedUIDeviceStorageContent(title=" + this.f16801a + ", content=" + this.f16802b + ")";
                }
            }
