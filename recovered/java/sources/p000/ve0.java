            package p000;

            import java.io.File;
            import java.util.List;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import kotlin.text.StringsKt__StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class ve0 {
                public static final ue0 Companion = new ue0();

                /* JADX INFO: renamed from: a */
                public final i03 f18020a;

                /* JADX INFO: renamed from: b */
                public final se0 f18021b;

                public ve0(i03 i03Var, se0 se0Var) {
/* 1 */             i03Var.getClass();
/* 4 */             se0Var.getClass();
/* 10 */            this.f18020a = i03Var;
/* 12 */            this.f18021b = se0Var;
                }

                /* JADX INFO: renamed from: a */
                public abstract String mo5992a();

                /* JADX INFO: renamed from: b */
                public final Map m9255b() {
/* 21 */            String str = (String) StringsKt__StringsKt.split$default(m9258e(), new String[]{"@#$"}, false, 0, 6, null).get(0);
/* 27 */            if (!StringsKt.m6228D(str)) {
/* 42 */                return nc1.m6963d(new Pair("If-None-Match", str));
                    }
/* 29 */            od0 od0Var = od0.f14715a;
/* 31 */            od0Var.getClass();
/* 34 */            return od0Var;
                }

                /* JADX INFO: renamed from: c */
                public final long m9256c() {
                    try {
/* 28 */                Long lM6238N = StringsKt.m6238N((String) StringsKt__StringsKt.split$default(StringsKt.m6234J(m9258e()), new String[]{"@#$"}, false, 0, 6, null).get(1));
/* 32 */                if (lM6238N != null) {
/* 34 */                    return lM6238N.longValue();
                        }
/* 39 */                return 0L;
                    } catch (Exception unused) {
/* 39 */                return 0L;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final String m9257d() throws C1836km {
                    Object n42Var;
/* 1 */             String strMo5992a = mo5992a();
/* 5 */             String strM9258e = m9258e();
/* 9 */             se0 se0Var = this.f18021b;
/* 11 */            se0Var.getClass();
/* 22 */            String strM6261k = C1852e.m6261k(StringsKt.m6234J(strM9258e), "/", "_");
/* 26 */            ev0 ev0Var = se0Var.f16548a;
/* 32 */            String strM3508l = AbstractC0886en.m3508l(se0Var.m8487b(strMo5992a), "/", strM6261k);
/* 36 */            C0835d8 c0835d8 = (C0835d8) ev0Var;
/* 38 */            c0835d8.getClass();
                    try {
/* 41 */                m42 m42Var = o42.f14612b;
/* 52 */                n42Var = gi0.m3945b(new File(c0835d8.m2958b(), strM3508l));
                    } catch (Throwable th) {
/* 58 */                m42 m42Var2 = o42.f14612b;
/* 62 */                n42Var = new n42(th);
                    }
/* 70 */            if (n42Var instanceof n42) {
/* 72 */                n42Var = null;
                    }
/* 73 */            String str = (String) n42Var;
/* 75 */            if (str != null) {
/* 77 */                return str;
                    }
/* 89 */            throw new C1836km("Failed to read from cache, key: ".concat(strMo5992a), null);
                }

                /* JADX INFO: renamed from: e */
                public final String m9258e() {
                    String str;
/* 1 */             String strMo5992a = mo5992a();
/* 5 */             se0 se0Var = this.f18021b;
/* 7 */             se0Var.getClass();
/* 18 */            List listM2959c = ((C0835d8) se0Var.f16548a).m2959c(se0Var.m8487b(strMo5992a));
/* 39 */            String strM3784j = (listM2959c == null || (str = (String) CollectionsKt.firstOrNull(listM2959c)) == null) ? null : fm0.m3784j("\"", str, "\"");
                    return strM3784j == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3784j;
                }
            }
