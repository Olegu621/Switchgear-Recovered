            package p000;

            import java.io.File;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class se0 {
                public static final re0 Companion = new re0();

                /* JADX INFO: renamed from: a */
                public final ev0 f16548a;

                /* JADX INFO: renamed from: b */
                public final x80 f16549b;

                /* JADX INFO: renamed from: c */
                public String f16550c;

                public se0(ev0 ev0Var, x80 x80Var) {
/* 1 */             ev0Var.getClass();
/* 4 */             x80Var.getClass();
/* 10 */            this.f16548a = ev0Var;
/* 12 */            this.f16549b = x80Var;
                }

                /* JADX INFO: renamed from: a */
                public final String m8486a() {
/* 5 */             return AbstractC0886en.m3507k("etags-", this.f16550c);
                }

                /* JADX INFO: renamed from: b */
                public final String m8487b(String str) {
/* 7 */             return AbstractC0886en.m3508l(m8486a(), "/", str);
                }

                /* JADX INFO: renamed from: c */
                public final String m8488c() {
/* 5 */             return AbstractC0886en.m3507k("etags-staging-", this.f16550c);
                }

                /* JADX INFO: renamed from: d */
                public final void m8489d(te0 te0Var) {
/* 3 */             String strM8487b = m8487b(te0Var.f17055a);
/* 9 */             C0835d8 c0835d8 = (C0835d8) this.f16548a;
/* 11 */            c0835d8.m2960d(strM8487b);
/* 14 */            c0835d8.getClass();
/* 26 */            new File(c0835d8.m2958b(), strM8487b).mkdirs();
/* 82 */            String str = strM8487b + "/" + C1852e.m6261k(StringsKt.m6234J(te0Var.f17057c), "/", "_") + "@#$" + new h50().m4113a(13, te0Var.f17056b).m4115c();
/* 86 */            String str2 = te0Var.f17058d;
/* 88 */            c0835d8.getClass();
                    try {
/* 91 */                m42 m42Var = o42.f14612b;
/* 102 */               gi0.m3946c(new File(c0835d8.m2958b(), str), str2);
                    } catch (Throwable unused) {
/* 106 */               m42 m42Var2 = o42.f14612b;
                    }
                }
            }
