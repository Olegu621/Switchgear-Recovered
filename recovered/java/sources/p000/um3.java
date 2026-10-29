            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class um3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17597a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f17598b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ pn3 f17599c;

                public um3(pn3 pn3Var, zzr zzrVar, int i) {
/* 1 */             this.f17597a = i;
                    switch (i) {
                        case 1:
/* 17 */                    this.f17598b = zzrVar;
/* 19 */                    Objects.requireNonNull(pn3Var);
/* 22 */                    this.f17599c = pn3Var;
                            break;
                        default:
/* 9 */                     this.f17598b = zzrVar;
/* 11 */                    this.f17599c = pn3Var;
                            break;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
/* 1 */             int i = this.f17597a;
/* 3 */             zzr zzrVar = this.f17598b;
/* 5 */             pn3 pn3Var = this.f17599c;
                    switch (i) {
                        case 0:
/* 52 */                    zzga zzgaVar = pn3Var.f15188d;
/* 56 */                    ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 58 */                    if (zzgaVar == null) {
/* 60 */                        uh3 uh3Var = ij3Var.f9655f;
/* 62 */                        ij3.m4555l(uh3Var);
/* 69 */                        uh3Var.f17538f.m8510a("Discarding data. Failed to send app launch");
                            } else {
                                try {
/* 73 */                            pd3 pd3Var = ij3Var.f9651d;
/* 75 */                            ug3 ug3Var = vg3.f18123c1;
/* 82 */                            if (pd3Var.m7406J(null, ug3Var)) {
/* 84 */                                pn3Var.m7522R(zzgaVar, null, zzrVar);
                                    }
/* 90 */                            zzgaVar.mo2177V(zzrVar);
/* 97 */                            ij3Var.m4566n().m6450E();
/* 102 */                           ij3Var.f9651d.m7406J(null, ug3Var);
/* 105 */                           pn3Var.m7522R(zzgaVar, null, zzrVar);
/* 108 */                           pn3Var.m7517M();
                                } catch (RemoteException e) {
/* 112 */                           uh3 uh3Var2 = ij3Var.f9655f;
/* 114 */                           ij3.m4555l(uh3Var2);
/* 121 */                           uh3Var2.f17538f.m8511b(e, "Failed to send app launch to the service");
/* 124 */                           return;
                                }
                            }
                            break;
                        default:
/* 10 */                    zzga zzgaVar2 = pn3Var.f15188d;
/* 14 */                    ij3 ij3Var2 = (ij3) pn3Var.f16749a;
/* 16 */                    if (zzgaVar2 == null) {
/* 18 */                        uh3 uh3Var3 = ij3Var2.f9655f;
/* 20 */                        ij3.m4555l(uh3Var3);
/* 27 */                        uh3Var3.f17538f.m8510a("Failed to send consent settings to service");
                            } else {
                                try {
/* 31 */                            zzgaVar2.mo2187q0(zzrVar);
/* 34 */                            pn3Var.m7517M();
                                } catch (RemoteException e2) {
/* 39 */                            uh3 uh3Var4 = ij3Var2.f9655f;
/* 41 */                            ij3.m4555l(uh3Var4);
/* 48 */                            uh3Var4.f17538f.m8511b(e2, "Failed to send consent settings to the service");
                                }
                            }
                            break;
                    }
                }
            }
