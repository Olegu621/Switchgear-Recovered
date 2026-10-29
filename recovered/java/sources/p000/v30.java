            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.os.Binder;
            import android.os.Process;
            import javax.inject.Provider;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v30 {

                /* JADX INFO: renamed from: a */
                public Context f17850a;

                public v30(Context context, int i) {
                    switch (i) {
                        case 2:
/* 13 */                    kb1.m6061n(context);
/* 16 */                    Context applicationContext = context.getApplicationContext();
/* 20 */                    kb1.m6061n(applicationContext);
/* 23 */                    this.f17850a = applicationContext;
                            break;
                        default:
/* 7 */                     this.f17850a = context;
                            break;
                    }
                }

                /* JADX INFO: renamed from: a */
                public w30 m9212a() {
/* 1 */             Context context = this.f17850a;
/* 3 */             if (context == null) {
/* 172 */               throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
                    }
/* 7 */             w30 w30Var = new w30();
/* 16 */            w30Var.f18423a = m90.m6627a(pg3.f15114a);
/* 20 */            C0828d1 c0828d1 = new C0828d1(context);
/* 23 */            w30Var.f18424b = c0828d1;
/* 41 */            w30Var.f18425c = m90.m6627a(new wc0(18, c0828d1, new d52(c0828d1)));
/* 43 */            C0828d1 c0828d2 = w30Var.f18424b;
/* 50 */            w30Var.f18426d = new ts0(c0828d2);
/* 59 */            Provider providerM6627a = m90.m6627a(new qc3(c0828d2, 24));
/* 63 */            w30Var.f18427e = providerM6627a;
/* 74 */            Provider providerM6627a2 = m90.m6627a(new wc0(29, w30Var.f18426d, providerM6627a));
/* 78 */            w30Var.f18428f = providerM6627a2;
/* 83 */            p62 p62Var = new p62(1);
/* 86 */            C0828d1 c0828d3 = w30Var.f18424b;
/* 92 */            ac1 ac1Var = new ac1(10, c0828d3, providerM6627a2, p62Var);
/* 95 */            Provider provider = w30Var.f18423a;
/* 97 */            Provider provider2 = w30Var.f18425c;
/* 103 */           C0168b5 c0168b5 = new C0168b5(provider, provider2, ac1Var, providerM6627a2, providerM6627a2, 4);
/* 108 */           eq2 eq2Var = new eq2();
/* 111 */           eq2Var.f7832a = c0828d3;
/* 113 */           eq2Var.f7833b = provider2;
/* 115 */           eq2Var.f7834c = providerM6627a2;
/* 117 */           eq2Var.f7835d = ac1Var;
/* 119 */           eq2Var.f7836e = provider;
/* 121 */           eq2Var.f7837f = providerM6627a2;
/* 123 */           eq2Var.f7838i = providerM6627a2;
/* 141 */           w30Var.f18429i = m90.m6627a(new ac1(20, c0168b5, eq2Var, new ra2(provider, providerM6627a2, ac1Var, providerM6627a2)));
/* 143 */           return w30Var;
                }

                /* JADX INFO: renamed from: b */
                public ApplicationInfo m9213b(int i, String str) {
/* 7 */             return this.f17850a.getPackageManager().getApplicationInfo(str, i);
                }

                /* JADX INFO: renamed from: c */
                public PackageInfo m9214c(int i, String str) {
/* 7 */             return this.f17850a.getPackageManager().getPackageInfo(str, i);
                }

                /* JADX INFO: renamed from: d */
                public boolean m9215d() {
                    String nameForUid;
/* 1 */             Context context = this.f17850a;
/* 11 */            if (Binder.getCallingUid() == Process.myUid()) {
/* 13 */                return py0.m7609p0(context);
                    }
/* 22 */            if (!j13.m5650l() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
/* 47 */                return false;
                    }
/* 1 */             return context.getPackageManager().isInstantApp(nameForUid);
                }
            }
