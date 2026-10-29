            package p000;

            import com.appsflyer.internal.AbstractC0298j;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class js2 implements v21 {

                /* JADX INFO: renamed from: c */
                public static final hs2 f12472c = new hs2(null);

                /* JADX INFO: renamed from: a */
                public final C0857dv f12473a;

                /* JADX INFO: renamed from: b */
                public final List f12474b;

                public js2(C0857dv c0857dv, List list) {
/* 1 */             list.getClass();
/* 7 */             this.f12473a = c0857dv;
/* 9 */             this.f12474b = list;
                }

                /* JADX INFO: renamed from: a */
                public final String m5896a(boolean z) {
                    String name;
                    String strM6203x;
/* 1 */             C0857dv c0857dv = this.f12473a;
/* 3 */             Class clsM10224s = yy1.m10224s(c0857dv);
/* 11 */            if (!clsM10224s.isArray()) {
/* 122 */               name = (z && clsM10224s.isPrimitive()) ? yy1.m10225t(c0857dv).getName() : clsM10224s.getName();
                    } else if (clsM10224s.equals(boolean[].class)) {
/* 21 */                name = "kotlin.BooleanArray";
                    } else if (clsM10224s.equals(char[].class)) {
/* 33 */                name = "kotlin.CharArray";
                    } else if (clsM10224s.equals(byte[].class)) {
/* 44 */                name = "kotlin.ByteArray";
                    } else if (clsM10224s.equals(short[].class)) {
/* 55 */                name = "kotlin.ShortArray";
                    } else if (clsM10224s.equals(int[].class)) {
/* 66 */                name = "kotlin.IntArray";
                    } else if (clsM10224s.equals(float[].class)) {
/* 77 */                name = "kotlin.FloatArray";
                    } else if (clsM10224s.equals(long[].class)) {
/* 88 */                name = "kotlin.LongArray";
                    } else {
/* 102 */               name = clsM10224s.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
                    }
/* 134 */           if (this.f12474b.isEmpty()) {
/* 136 */               strM6203x = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 153 */               strM6203x = CollectionsKt.m6203x(this.f12474b, ", ", "<", ">", new C0197bz(this), 24);
                    }
/* 157 */           return AbstractC0886en.m3508l(name, strM6203x, HttpUrl.FRAGMENT_ENCODE_SET);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof js2)) {
/* 29 */                return false;
                    }
/* 5 */             js2 js2Var = (js2) obj;
                    return this.f12473a.equals(js2Var.f12473a) && Intrinsics.m6216a(this.f12474b, js2Var.f12474b);
                }

                public final int hashCode() {
/* 21 */            return Integer.hashCode(0) + AbstractC0298j.m1861b(this.f12473a.hashCode() * 31, 31, this.f12474b);
                }

                public final String toString() {
/* 8 */             return m5896a(false).concat(" (Kotlin reflection is not available)");
                }
            }
