            package p000;

            import android.content.Context;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yr2 {

                /* JADX INFO: renamed from: e */
                public static volatile w30 f19780e;

                /* JADX INFO: renamed from: a */
                public final InterfaceC2512yv f19781a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC2512yv f19782b;

                /* JADX INFO: renamed from: c */
                public final n60 f19783c;

                /* JADX INFO: renamed from: d */
                public final f31 f19784d;

                public yr2(InterfaceC2512yv interfaceC2512yv, InterfaceC2512yv interfaceC2512yv2, n60 n60Var, f31 f31Var, ra2 ra2Var) {
/* 4 */             this.f19781a = interfaceC2512yv;
/* 6 */             this.f19782b = interfaceC2512yv2;
/* 8 */             this.f19783c = n60Var;
/* 10 */            this.f19784d = f31Var;
/* 23 */            ((Executor) ra2Var.f15955a).execute(new f72(ra2Var, 13));
                }

                /* JADX INFO: renamed from: a */
                public static yr2 m10173a() {
/* 1 */             w30 w30Var = f19780e;
/* 3 */             if (w30Var != null) {
/* 11 */                return (yr2) w30Var.f18429i.get();
                    }
/* 16 */            f42.m3656l("Not initialized!");
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public static void m10174b(Context context) {
/* 3 */             if (f19780e == null) {
                        synchronized (yr2.class) {
                            try {
/* 10 */                        if (f19780e == null) {
/* 14 */                            v30 v30Var = new v30();
/* 17 */                            context.getClass();
/* 20 */                            v30Var.f17850a = context;
/* 26 */                            f19780e = v30Var.m9212a();
                                }
                            } catch (Throwable th) {
/* 34 */                        throw th;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public final xr2 m10175c(C0959gm c0959gm) {
/* 21 */            Set setUnmodifiableSet = c0959gm instanceof C0959gm ? Collections.unmodifiableSet(C0959gm.f8707d) : Collections.singleton(new vd0("proto"));
/* 25 */            C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 29 */            c0959gm.getClass();
/* 34 */            c0875ecM10147a.f7613b = "cct";
/* 36 */            String str = c0959gm.f8710a;
/* 38 */            String str2 = c0959gm.f8711b;
/* 40 */            if (str2 == null) {
/* 42 */                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 62 */            c0875ecM10147a.f7614c = AbstractC0886en.m3509m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
/* 68 */            return new xr2(setUnmodifiableSet, c0875ecM10147a.m3390m(), this);
                }
            }
