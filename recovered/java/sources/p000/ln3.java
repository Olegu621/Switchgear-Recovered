            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.measurement.internal.zzga;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ln3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13430a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ pn3 f13431b;

                public /* synthetic */ ln3(pn3 pn3Var, int i) {
/* 1 */             this.f13430a = i;
/* 3 */             this.f13431b = pn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f13430a;
/* 4 */             pn3 pn3Var = this.f13431b;
                    switch (i) {
                        case 0:
/* 101 */                   pn3Var.m7510F();
                            break;
                        case 1:
/* 57 */                    ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 59 */                    zzga zzgaVar = pn3Var.f15188d;
/* 61 */                    if (zzgaVar == null) {
/* 63 */                        uh3 uh3Var = ij3Var.f9655f;
/* 65 */                        ij3.m4555l(uh3Var);
/* 72 */                        uh3Var.f17538f.m8510a("Failed to send Dma consent settings to service");
                            } else {
                                try {
/* 80 */                            zzgaVar.mo2172I(pn3Var.m7520P(false));
/* 83 */                            pn3Var.m7517M();
                                } catch (RemoteException e) {
/* 88 */                            uh3 uh3Var2 = ij3Var.f9655f;
/* 90 */                            ij3.m4555l(uh3Var2);
/* 97 */                            uh3Var2.f17538f.m8511b(e, "Failed to send Dma consent settings to the service");
/* 100 */                           return;
                                }
                            }
                            break;
                        default:
/* 11 */                    ij3 ij3Var2 = (ij3) pn3Var.f16749a;
/* 13 */                    zzga zzgaVar2 = pn3Var.f15188d;
/* 15 */                    if (zzgaVar2 == null) {
/* 17 */                        uh3 uh3Var3 = ij3Var2.f9655f;
/* 19 */                        ij3.m4555l(uh3Var3);
/* 26 */                        uh3Var3.f17538f.m8510a("Failed to send storage consent settings to service");
                            } else {
                                try {
/* 34 */                            zzgaVar2.mo2168A(pn3Var.m7520P(false));
/* 37 */                            pn3Var.m7517M();
                                } catch (RemoteException e2) {
/* 42 */                            uh3 uh3Var4 = ij3Var2.f9655f;
/* 44 */                            ij3.m4555l(uh3Var4);
/* 51 */                            uh3Var4.f17538f.m8511b(e2, "Failed to send storage consent settings to the service");
                                }
                            }
                            break;
                    }
                }
            }
