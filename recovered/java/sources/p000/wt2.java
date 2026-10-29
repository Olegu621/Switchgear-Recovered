            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wt2 {
                public static final vt2 Companion = new vt2();

                /* JADX INFO: renamed from: a */
                public final Integer f18805a;

                /* JADX INFO: renamed from: b */
                public final Integer f18806b;

                /* JADX INFO: renamed from: c */
                public final Integer f18807c;

                /* JADX INFO: renamed from: d */
                public final Integer f18808d;

                /* JADX INFO: renamed from: e */
                public final Integer f18809e;

                /* JADX INFO: renamed from: f */
                public final Integer f18810f;

                /* JADX INFO: renamed from: g */
                public final Integer f18811g;

                /* JADX INFO: renamed from: h */
                public final Integer f18812h;

                /* JADX INFO: renamed from: i */
                public final Integer f18813i;

                /* JADX INFO: renamed from: j */
                public final int f18814j;

                public wt2(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, int i) {
/* 4 */             this.f18805a = num;
/* 6 */             this.f18806b = num2;
/* 8 */             this.f18807c = num3;
/* 10 */            this.f18808d = num4;
/* 12 */            this.f18809e = num5;
/* 14 */            this.f18810f = num6;
/* 16 */            this.f18811g = num7;
/* 18 */            this.f18812h = num8;
/* 20 */            this.f18813i = num9;
/* 22 */            this.f18814j = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof wt2)) {
/* 7 */                 return false;
                    }
/* 11 */            wt2 wt2Var = (wt2) obj;
                    return Intrinsics.m6216a(this.f18805a, wt2Var.f18805a) && Intrinsics.m6216a(this.f18806b, wt2Var.f18806b) && Intrinsics.m6216a(this.f18807c, wt2Var.f18807c) && Intrinsics.m6216a(this.f18808d, wt2Var.f18808d) && Intrinsics.m6216a(this.f18809e, wt2Var.f18809e) && Intrinsics.m6216a(this.f18810f, wt2Var.f18810f) && Intrinsics.m6216a(this.f18811g, wt2Var.f18811g) && Intrinsics.m6216a(this.f18812h, wt2Var.f18812h) && Intrinsics.m6216a(this.f18813i, wt2Var.f18813i) && this.f18814j == wt2Var.f18814j;
                }

                public final int hashCode() {
/* 2 */             Integer num = this.f18805a;
/* 12 */            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
/* 14 */            Integer num2 = this.f18806b;
/* 25 */            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
/* 27 */            Integer num3 = this.f18807c;
/* 38 */            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
/* 40 */            Integer num4 = this.f18808d;
/* 51 */            int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
/* 53 */            Integer num5 = this.f18809e;
/* 64 */            int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
/* 66 */            Integer num6 = this.f18810f;
/* 77 */            int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
/* 79 */            Integer num7 = this.f18811g;
/* 90 */            int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
/* 92 */            Integer num8 = this.f18812h;
/* 103 */           int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
/* 105 */           Integer num9 = this.f18813i;
/* 123 */           return Integer.hashCode(this.f18814j) + ((iHashCode8 + (num9 != null ? num9.hashCode() : 0)) * 31);
                }

                public final String toString() {
/* 108 */           return "UCColorPalette(text100=" + this.f18805a + ", text80=" + this.f18806b + ", text16=" + this.f18807c + ", text2=" + this.f18808d + ", layerBackgroundColor=" + this.f18809e + ", layerBackgroundSecondaryColor=" + this.f18810f + ", selectedTabColor=" + this.f18811g + ", linkColor=" + this.f18812h + ", overlayColor=" + this.f18813i + ", tabsBorderColor=" + this.f18814j + ")";
                }
            }
