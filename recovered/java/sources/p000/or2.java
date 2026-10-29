            package p000;

            import android.view.View;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class or2 {

                /* JADX INFO: renamed from: b */
                public final View f14873b;

                /* JADX INFO: renamed from: a */
                public final HashMap f14872a = new HashMap();

                /* JADX INFO: renamed from: c */
                public final ArrayList f14874c = new ArrayList();

                public or2(View view) {
/* 18 */            this.f14873b = view;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof or2)) {
/* 25 */                return false;
                    }
/* 5 */             or2 or2Var = (or2) obj;
                    return this.f14873b == or2Var.f14873b && this.f14872a.equals(or2Var.f14872a);
                }

                public final int hashCode() {
/* 15 */            return this.f14872a.hashCode() + (this.f14873b.hashCode() * 31);
                }

                public final String toString() {
/* 30 */            StringBuilder sbM3794t = fm0.m3794t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
/* 36 */            sbM3794t.append(this.f14873b);
/* 41 */            sbM3794t.append("\n");
/* 50 */            String strConcat = sbM3794t.toString().concat("    values:");
/* 54 */            HashMap map = this.f14872a;
/* 68 */            for (String str : map.keySet()) {
/* 107 */               strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
                    }
/* 112 */           return strConcat;
                }
            }
