            package kotlin.reflect;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.js2;
            import p000.v21;
            import p000.w21;
            import p000.x21;
            import p000.y21;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m6176d2 = {"Lkotlin/reflect/KTypeProjection;", HttpUrl.FRAGMENT_ENCODE_SET, "c", "w21", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final /* data */ class KTypeProjection {

                /* JADX INFO: renamed from: c */
                public static final w21 f12929c = new w21(null);

                /* JADX INFO: renamed from: a */
                public final y21 f12930a;

                /* JADX INFO: renamed from: b */
                public final v21 f12931b;

                static {
/* 11 */            new KTypeProjection(null, null);
                }

                public KTypeProjection(y21 y21Var, js2 js2Var) {
                    String str;
/* 4 */             this.f12930a = y21Var;
/* 6 */             this.f12931b = js2Var;
/* 18 */            if ((y21Var == null) == (js2Var == null)) {
/* 20 */                return;
                    }
/* 21 */            if (y21Var == null) {
/* 23 */                str = "Star projection must have no type specified.";
                    } else {
/* 41 */                str = "The projection variance " + y21Var + " requires type to be specified.";
                    }
/* 45 */            ds0.m3200q(str);
/* 49 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof KTypeProjection)) {
/* 7 */                 return false;
                    }
/* 11 */            KTypeProjection kTypeProjection = (KTypeProjection) obj;
                    return this.f12930a == kTypeProjection.f12930a && Intrinsics.m6216a(this.f12931b, kTypeProjection.f12931b);
                }

                public final int hashCode() {
/* 2 */             y21 y21Var = this.f12930a;
/* 12 */            int iHashCode = (y21Var == null ? 0 : y21Var.hashCode()) * 31;
/* 14 */            v21 v21Var = this.f12931b;
/* 23 */            return iHashCode + (v21Var != null ? v21Var.hashCode() : 0);
                }

                public final String toString() {
/* 2 */             y21 y21Var = this.f12930a;
/* 14 */            int i = y21Var == null ? -1 : x21.f18916a[y21Var.ordinal()];
/* 16 */            if (i == -1) {
/* 69 */                return "*";
                    }
/* 19 */            v21 v21Var = this.f12931b;
/* 21 */            if (i == 1) {
/* 64 */                return String.valueOf(v21Var);
                    }
/* 24 */            if (i == 2) {
/* 59 */                return "in " + v21Var;
                    }
/* 27 */            if (i != 3) {
/* 44 */                ds0.m3187b();
/* 47 */                return null;
                    }
/* 39 */            return "out " + v21Var;
                }
            }
