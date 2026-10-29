            package p000;

            import com.google.android.gms.measurement.internal.zzga;
            import java.util.concurrent.ScheduledExecutorService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bn3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2552a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzga f2553b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ mn3 f2554c;

                public /* synthetic */ bn3(mn3 mn3Var, zzga zzgaVar, int i) {
/* 1 */             this.f2552a = i;
/* 3 */             this.f2553b = zzgaVar;
/* 5 */             this.f2554c = mn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f2552a) {
                        case 0:
/* 73 */                    mn3 mn3Var = this.f2554c;
                            synchronized (mn3Var) {
                                try {
/* 76 */                            mn3Var.f13884a = false;
/* 78 */                            pn3 pn3Var = mn3Var.f13886c;
/* 84 */                            if (!pn3Var.m7521Q()) {
/* 90 */                                uh3 uh3Var = ((ij3) pn3Var.f16749a).f9655f;
/* 92 */                                ij3.m4555l(uh3Var);
/* 99 */                                uh3Var.f17534Y.m8510a("Connected to service");
/* 102 */                               zzga zzgaVar = this.f2553b;
/* 104 */                               pn3Var.mo1375y();
/* 107 */                               pn3Var.f15188d = zzgaVar;
/* 109 */                               pn3Var.m7517M();
/* 112 */                               pn3Var.m7519O();
                                    }
                                } catch (Throwable th) {
/* 121 */                           throw th;
                                }
                                break;
                            }
/* 119 */                   return;
                        default:
/* 7 */                     mn3 mn3Var2 = this.f2554c;
                            synchronized (mn3Var2) {
                                try {
/* 10 */                            mn3Var2.f13884a = false;
/* 12 */                            pn3 pn3Var2 = mn3Var2.f13886c;
/* 18 */                            if (!pn3Var2.m7521Q()) {
/* 24 */                                uh3 uh3Var2 = ((ij3) pn3Var2.f16749a).f9655f;
/* 26 */                                ij3.m4555l(uh3Var2);
/* 33 */                                uh3Var2.f17533X.m8510a("Connected to remote service");
/* 36 */                                zzga zzgaVar2 = this.f2553b;
/* 38 */                                pn3Var2.mo1375y();
/* 41 */                                kb1.m6061n(zzgaVar2);
/* 44 */                                pn3Var2.f15188d = zzgaVar2;
/* 46 */                                pn3Var2.m7517M();
/* 49 */                                pn3Var2.m7519O();
                                    }
                                } catch (Throwable th2) {
/* 72 */                            throw th2;
                                }
                                break;
                            }
/* 58 */                    pn3 pn3Var3 = this.f2554c.f13886c;
/* 60 */                    ScheduledExecutorService scheduledExecutorService = pn3Var3.f15191i;
/* 62 */                    if (scheduledExecutorService != null) {
/* 64 */                        scheduledExecutorService.shutdownNow();
/* 68 */                        pn3Var3.f15191i = null;
/* 70 */                        return;
                            }
/* 70 */                    return;
                    }
                }
            }
