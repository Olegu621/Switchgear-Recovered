            package p000;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.content.ComponentName;
            import android.os.RemoteException;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            import com.google.android.gms.measurement.internal.zzga;
            import java.util.Objects;
            import java.util.concurrent.Executors;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class ol3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14812a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14813b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f14814c;

                public ol3(pn3 pn3Var, bm3 bm3Var) {
/* 2 */             this.f14812a = 1;
/* 7 */             this.f14813b = bm3Var;
/* 9 */             Objects.requireNonNull(pn3Var);
/* 12 */            this.f14814c = pn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             boolean z = false;
                    switch (this.f14812a) {
                        case 0:
/* 249 */                   sl3 sl3Var = ((AppMeasurementDynamiteService) this.f14814c).f4190a.f9642X;
/* 251 */                   ij3.m4554k(sl3Var);
/* 256 */                   we2 we2Var = (we2) this.f14813b;
/* 258 */                   sl3Var.mo1375y();
/* 261 */                   sl3Var.m9576A();
/* 264 */                   qk3 qk3Var = sl3Var.f16686d;
/* 266 */                   if (we2Var != qk3Var) {
/* 273 */                       kb1.m6063p("EventInterceptor already set.", qk3Var == null);
                            }
/* 276 */                   sl3Var.f16686d = we2Var;
                            break;
                        case 1:
/* 161 */                   pn3 pn3Var = (pn3) this.f14814c;
/* 163 */                   zzga zzgaVar = pn3Var.f15188d;
/* 167 */                   ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 169 */                   if (zzgaVar == null) {
/* 171 */                       uh3 uh3Var = ij3Var.f9655f;
/* 173 */                       ij3.m4555l(uh3Var);
/* 180 */                       uh3Var.f17538f.m8510a("Failed to send current screen to service");
                            } else {
                                try {
/* 186 */                           bm3 bm3Var = (bm3) this.f14813b;
/* 188 */                           if (bm3Var == null) {
/* 200 */                               zzgaVar.mo2185n(0L, null, null, ij3Var.f9645a.getPackageName());
                                    } else {
/* 219 */                               zzgaVar.mo2185n(bm3Var.f2540c, bm3Var.f2538a, bm3Var.f2539b, ij3Var.f9645a.getPackageName());
                                    }
/* 222 */                           pn3Var.m7517M();
                                } catch (RemoteException e) {
/* 230 */                           uh3 uh3Var2 = ((ij3) pn3Var.f16749a).f9655f;
/* 232 */                           ij3.m4555l(uh3Var2);
/* 239 */                           uh3Var2.f17538f.m8511b(e, "Failed to send current screen to the service");
/* 242 */                           return;
                                }
                            }
                            break;
                        case 2:
/* 154 */                   ((mn3) this.f14814c).f13886c.m7515K((ComponentName) this.f14813b);
                            break;
                        case 3:
/* 112 */                   AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.f14814c;
/* 116 */                   up3 up3Var = appMeasurementDynamiteService.f4190a.f9668w;
/* 118 */                   ij3.m4553j(up3Var);
/* 121 */                   ij3 ij3Var2 = appMeasurementDynamiteService.f4190a;
/* 125 */                   if (ij3Var2.f9661j0 != null && ij3Var2.f9661j0.booleanValue()) {
/* 135 */                       z = true;
                            }
/* 140 */                   up3Var.m9109l0((zzcu) this.f14813b, z);
                            break;
                        case 4:
/* 55 */                    pn3 pn3Var2 = ((mn3) this.f14814c).f13886c;
/* 57 */                    pn3Var2.f15188d = null;
/* 67 */                    if (((ConnectionResult) this.f14813b).f3416b != 7777) {
/* 106 */                       pn3Var2.m7519O();
                            } else {
/* 71 */                        if (pn3Var2.f15191i == null) {
/* 77 */                            pn3Var2.f15191i = Executors.newScheduledThreadPool(1);
                                }
/* 102 */                       pn3Var2.f15191i.schedule(new bb3(this, 9), ((Long) vg3.f18113Z.m9011a(null)).longValue(), TimeUnit.MILLISECONDS);
                            }
                            break;
                        case 5:
/* 47 */                    ((vn3) ((Service) ((ac3) this.f14813b).f184b)).mo2159b((JobParameters) this.f14814c);
                            break;
                        default:
/* 11 */                    C0882ej c0882ej = (C0882ej) this.f14813b;
/* 15 */                    C2076pn c2076pn = (C2076pn) this.f14814c;
/* 17 */                    c0882ej.getClass();
/* 20 */                    C1833kj c1833kj = kf3.f12733k;
/* 26 */                    c0882ej.m3470x(24, 13, c1833kj);
/* 29 */                    c2076pn.m7497g(c1833kj, null);
                            break;
                    }
                }

/* 14 */        public /* synthetic */ ol3(Object obj, Object obj2, int i, boolean z) {
/* 15 */            this.f14812a = i;
                    this.f14813b = obj;
                    this.f14814c = obj2;
                }

/* 15 */        public /* synthetic */ ol3(int i, Object obj, Object obj2) {
/* 16 */            this.f14812a = i;
                    this.f14813b = obj2;
                    this.f14814c = obj;
                }
            }
