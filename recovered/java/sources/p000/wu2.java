            package p000;

            import android.graphics.Typeface;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wu2 {
                public static final vu2 Companion = new vu2();

                /* JADX INFO: renamed from: a */
                public final uu2 f18822a;

                public wu2(uu2 uu2Var) {
/* 1 */             Typeface typeface = Typeface.DEFAULT;
/* 3 */             Typeface typeface2 = Typeface.DEFAULT_BOLD;
/* 5 */             typeface.getClass();
/* 8 */             typeface2.getClass();
/* 14 */            this.f18822a = uu2Var;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 41 */                return true;
                    }
/* 6 */             if (!(obj instanceof wu2)) {
/* 39 */                return false;
                    }
/* 9 */             wu2 wu2Var = (wu2) obj;
/* 11 */            Typeface typeface = Typeface.DEFAULT;
/* 17 */            if (!Intrinsics.m6216a(typeface, typeface)) {
/* 39 */                return false;
                    }
/* 20 */            Typeface typeface2 = Typeface.DEFAULT_BOLD;
                    return Intrinsics.m6216a(typeface2, typeface2) && this.f18822a.equals(wu2Var.f18822a);
                }

                public final int hashCode() {
/* 24 */            return this.f18822a.hashCode() + ((Typeface.DEFAULT_BOLD.hashCode() + (Typeface.DEFAULT.hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 38 */            return "UCFontTheme(font=" + Typeface.DEFAULT + ", fontBold=" + Typeface.DEFAULT_BOLD + ", sizes=" + this.f18822a + ")";
                }
            }
