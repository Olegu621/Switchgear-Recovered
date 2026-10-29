            package p000;

            import android.graphics.Typeface;
            import com.appsflyer.internal.AbstractC0298j;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gt2 {
                public static final ft2 Companion = new ft2();

                /* JADX INFO: renamed from: a */
                public final String f8810a;

                /* JADX INFO: renamed from: b */
                public final Integer f8811b;

                /* JADX INFO: renamed from: c */
                public final int f8812c;

                /* JADX INFO: renamed from: d */
                public final Integer f8813d;

                /* JADX INFO: renamed from: e */
                public final float f8814e;

                /* JADX INFO: renamed from: f */
                public final kt2 f8815f;

                public gt2(String str, Integer num, int i, Integer num2, float f, kt2 kt2Var) {
/* 1 */             Typeface typeface = Typeface.DEFAULT_BOLD;
/* 3 */             str.getClass();
/* 6 */             typeface.getClass();
/* 12 */            this.f8810a = str;
/* 14 */            this.f8811b = num;
/* 16 */            this.f8812c = i;
/* 18 */            this.f8813d = num2;
/* 20 */            this.f8814e = f;
/* 22 */            this.f8815f = kt2Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 79 */                return true;
                    }
/* 6 */             if (!(obj instanceof gt2)) {
/* 77 */                return false;
                    }
/* 9 */             gt2 gt2Var = (gt2) obj;
/* 19 */            if (!Intrinsics.m6216a(this.f8810a, gt2Var.f8810a) || !Intrinsics.m6216a(this.f8811b, gt2Var.f8811b) || this.f8812c != gt2Var.f8812c || !Intrinsics.m6216a(this.f8813d, gt2Var.f8813d) || Float.compare(this.f8814e, gt2Var.f8814e) != 0 || this.f8815f != gt2Var.f8815f) {
/* 77 */                return false;
                    }
/* 69 */            Typeface typeface = Typeface.DEFAULT_BOLD;
                    return Intrinsics.m6216a(typeface, typeface);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.f8810a.hashCode() * 31;
/* 11 */            Integer num = this.f8811b;
/* 25 */            int iM1860a = AbstractC0298j.m1860a(this.f8812c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
/* 29 */            Integer num2 = this.f8813d;
/* 67 */            return Typeface.DEFAULT_BOLD.hashCode() + ((this.f8815f.hashCode() + AbstractC0886en.m3504h((Float.hashCode(this.f8814e) + ((iM1860a + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31, false)) * 31);
                }

                public final String toString() {
/* 78 */            return "UCButtonSettings(label=" + this.f8810a + ", backgroundColor=" + this.f8811b + ", cornerRadius=" + this.f8812c + ", textColor=" + this.f8813d + ", textSizeInSp=" + this.f8814e + ", isAllCaps=false, type=" + this.f8815f + ", font=" + Typeface.DEFAULT_BOLD + ")";
                }
            }
