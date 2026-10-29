            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class vv1 {

                /* JADX INFO: renamed from: a */
                public final String f18365a;

                /* JADX INFO: renamed from: b */
                public final String f18366b;

                /* JADX INFO: renamed from: c */
                public final boolean f18367c;

                /* JADX INFO: renamed from: d */
                public final boolean f18368d;

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public vv1(m61 m61Var) {
/* 10 */            this(m61Var.f13591q, m61Var.f13590p.f9466b);
/* 1 */             m61Var.getClass();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof vv1)) {
/* 7 */                 return false;
                    }
/* 11 */            vv1 vv1Var = (vv1) obj;
                    return Intrinsics.m6216a(this.f18365a, vv1Var.f18365a) && Intrinsics.m6216a(this.f18366b, vv1Var.f18366b) && this.f18367c == vv1Var.f18367c && this.f18368d == vv1Var.f18368d;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f18365a.hashCode() * 31;
/* 10 */            String str = this.f18366b;
/* 34 */            return Boolean.hashCode(this.f18368d) + AbstractC0886en.m3504h((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f18367c);
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("PredefinedUISwitchSettingsUI(id=", this.f18365a, ", label=", this.f18366b, ", disabled=");
/* 17 */            sbM3514r.append(this.f18367c);
/* 22 */            sbM3514r.append(", currentValue=");
/* 27 */            sbM3514r.append(this.f18368d);
/* 32 */            sbM3514r.append(")");
/* 35 */            return sbM3514r.toString();
                }

/* 13 */        public vv1(String str, String str2, boolean z, boolean z2) {
/* 15 */            this.f18365a = str;
/* 16 */            this.f18366b = str2;
/* 17 */            this.f18367c = z;
/* 18 */            this.f18368d = z2;
                }

/* 18 */        public /* synthetic */ vv1(boolean z, boolean z2) {
/* 19 */            this("consent", null, z, z2);
                }
            }
