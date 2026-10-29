            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sm3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16708a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f16709b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ pn3 f16710c;

                public /* synthetic */ sm3(pn3 pn3Var, zzr zzrVar, int i) {
/* 1 */             this.f16708a = i;
/* 3 */             this.f16709b = zzrVar;
/* 5 */             this.f16710c = pn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f16708a;
/* 3 */             zzr zzrVar = this.f16709b;
/* 5 */             pn3 pn3Var = this.f16710c;
                    switch (i) {
                        case 0:
/* 94 */                    zzga zzgaVar = pn3Var.f15188d;
/* 98 */                    ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 100 */                   if (zzgaVar != null) {
                                try {
/* 115 */                           zzgaVar.mo2186p(zzrVar);
                                } catch (RemoteException e) {
/* 120 */                           uh3 uh3Var = ij3Var.f9655f;
/* 122 */                           ij3.m4555l(uh3Var);
/* 129 */                           uh3Var.f17538f.m8511b(e, "Failed to reset data on the service: remote exception");
                                }
/* 132 */                       pn3Var.m7517M();
                            } else {
/* 102 */                       uh3 uh3Var2 = ij3Var.f9655f;
/* 104 */                       ij3.m4555l(uh3Var2);
/* 111 */                       uh3Var2.f17538f.m8510a("Failed to reset data on the service: not connected to service");
                            }
                            break;
                        case 1:
/* 52 */                    zzga zzgaVar2 = pn3Var.f15188d;
/* 56 */                    ij3 ij3Var2 = (ij3) pn3Var.f16749a;
/* 58 */                    if (zzgaVar2 == null) {
/* 60 */                        uh3 uh3Var3 = ij3Var2.f9655f;
/* 62 */                        ij3.m4555l(uh3Var3);
/* 69 */                        uh3Var3.f17541w.m8510a("Failed to send app backgrounded");
                            } else {
                                try {
/* 73 */                            zzgaVar2.mo2180d0(zzrVar);
/* 76 */                            pn3Var.m7517M();
                                } catch (RemoteException e2) {
/* 81 */                            uh3 uh3Var4 = ij3Var2.f9655f;
/* 83 */                            ij3.m4555l(uh3Var4);
/* 90 */                            uh3Var4.f17538f.m8511b(e2, "Failed to send app backgrounded to the service");
/* 93 */                            return;
                                }
                            }
                            break;
                        default:
/* 10 */                    zzga zzgaVar3 = pn3Var.f15188d;
/* 14 */                    ij3 ij3Var3 = (ij3) pn3Var.f16749a;
/* 16 */                    if (zzgaVar3 == null) {
/* 18 */                        uh3 uh3Var5 = ij3Var3.f9655f;
/* 20 */                        ij3.m4555l(uh3Var5);
/* 27 */                        uh3Var5.f17538f.m8510a("Failed to send measurementEnabled to service");
                            } else {
                                try {
/* 31 */                            zzgaVar3.mo2171G(zzrVar);
/* 34 */                            pn3Var.m7517M();
                                } catch (RemoteException e3) {
/* 39 */                            uh3 uh3Var6 = ij3Var3.f9655f;
/* 41 */                            ij3.m4555l(uh3Var6);
/* 48 */                            uh3Var6.f17538f.m8511b(e3, "Failed to send measurementEnabled to the service");
                                }
                            }
                            break;
                    }
                }
            }
