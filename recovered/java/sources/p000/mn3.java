            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.measurement.internal.zzfy;
            import com.google.android.gms.measurement.internal.zzga;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mn3 implements ServiceConnection, InterfaceC0217ci, InterfaceC0845di {

                /* JADX INFO: renamed from: a */
                public volatile boolean f13884a;

                /* JADX INFO: renamed from: b */
                public volatile oh3 f13885b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ pn3 f13886c;

                public mn3(pn3 pn3Var) {
/* 4 */             this.f13886c = pn3Var;
                }

                @Override // p000.InterfaceC0217ci
                /* JADX INFO: renamed from: a */
                public final void mo196a(int i) {
/* 5 */             ij3 ij3Var = (ij3) this.f13886c.f16749a;
/* 7 */             bj3 bj3Var = ij3Var.f9659i;
/* 9 */             ij3.m4555l(bj3Var);
/* 12 */            bj3Var.m1366E();
/* 15 */            uh3 uh3Var = ij3Var.f9655f;
/* 17 */            ij3.m4555l(uh3Var);
/* 24 */            uh3Var.f17533X.m8510a("Service connection suspended");
/* 27 */            bj3 bj3Var2 = ij3Var.f9659i;
/* 29 */            ij3.m4555l(bj3Var2);
/* 39 */            bj3Var2.m1370I(new bb3(this, 8));
                }

                @Override // p000.InterfaceC0845di
                /* JADX INFO: renamed from: b */
                public final void mo3086b(ConnectionResult connectionResult) {
/* 1 */             pn3 pn3Var = this.f13886c;
/* 7 */             bj3 bj3Var = ((ij3) pn3Var.f16749a).f9659i;
/* 9 */             ij3.m4555l(bj3Var);
/* 12 */            bj3Var.m1366E();
/* 19 */            uh3 uh3Var = ((ij3) pn3Var.f16749a).f9655f;
/* 22 */            if (uh3Var == null || !uh3Var.f9127b) {
/* 29 */                uh3Var = null;
                    }
/* 30 */            if (uh3Var != null) {
/* 36 */                uh3Var.f17534Y.m8511b(connectionResult, "Service connection failed");
                    }
                    synchronized (this) {
/* 41 */                this.f13884a = false;
/* 43 */                this.f13885b = null;
                    }
/* 52 */            bj3 bj3Var2 = ((ij3) this.f13886c.f16749a).f9659i;
/* 54 */            ij3.m4555l(bj3Var2);
/* 63 */            bj3Var2.m1370I(new ol3(4, this, connectionResult));
                }

                @Override // p000.InterfaceC0217ci
                /* JADX INFO: renamed from: d */
                public final void mo199d(Bundle bundle) {
/* 7 */             bj3 bj3Var = ((ij3) this.f13886c.f16749a).f9659i;
/* 9 */             ij3.m4555l(bj3Var);
/* 12 */            bj3Var.m1366E();
                    synchronized (this) {
                        try {
/* 18 */                    kb1.m6061n(this.f13885b);
/* 27 */                    zzga zzgaVar = (zzga) this.f13885b.getService();
/* 35 */                    bj3 bj3Var2 = ((ij3) this.f13886c.f16749a).f9659i;
/* 37 */                    ij3.m4555l(bj3Var2);
/* 46 */                    bj3Var2.m1370I(new bn3(this, zzgaVar, 1));
                        } catch (DeadObjectException | IllegalStateException unused) {
/* 53 */                    this.f13885b = null;
/* 56 */                    this.f13884a = false;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 7 */             bj3 bj3Var = ((ij3) this.f13886c.f16749a).f9659i;
/* 9 */             ij3.m4555l(bj3Var);
/* 12 */            bj3Var.m1366E();
                    synchronized (this) {
/* 16 */                int i = 0;
/* 17 */                if (iBinder == null) {
/* 19 */                    this.f13884a = false;
/* 27 */                    uh3 uh3Var = ((ij3) this.f13886c.f16749a).f9655f;
/* 29 */                    ij3.m4555l(uh3Var);
/* 36 */                    uh3Var.f17538f.m8510a("Service connected with null binder");
/* 40 */                    return;
                        }
/* 44 */                zzga zzfyVar = null;
                        try {
/* 45 */                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 55 */                    if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
/* 59 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
/* 73 */                        zzfyVar = iInterfaceQueryLocalInterface instanceof zzga ? (zzga) iInterfaceQueryLocalInterface : new zzfy(iBinder);
/* 83 */                        uh3 uh3Var2 = ((ij3) this.f13886c.f16749a).f9655f;
/* 85 */                        ij3.m4555l(uh3Var2);
/* 92 */                        uh3Var2.f17534Y.m8510a("Bound to IMeasurementService interface");
                            } else {
/* 102 */                       uh3 uh3Var3 = ((ij3) this.f13886c.f16749a).f9655f;
/* 104 */                       ij3.m4555l(uh3Var3);
/* 111 */                       uh3Var3.f17538f.m8511b(interfaceDescriptor, "Got binder with a wrong descriptor");
                            }
                        } catch (RemoteException unused) {
/* 121 */                   uh3 uh3Var4 = ((ij3) this.f13886c.f16749a).f9655f;
/* 123 */                   ij3.m4555l(uh3Var4);
/* 130 */                   uh3Var4.f17538f.m8510a("Service connect failed to get IMeasurementService");
                        }
/* 133 */               if (zzfyVar == null) {
/* 135 */                   this.f13884a = false;
                            try {
/* 137 */                       C2515yy c2515yyM10190b = C2515yy.m10190b();
/* 141 */                       pn3 pn3Var = this.f13886c;
/* 151 */                       c2515yyM10190b.m10193d(((ij3) pn3Var.f16749a).f9645a, pn3Var.f15187c);
                            } catch (IllegalArgumentException unused2) {
                            }
                        } else {
/* 161 */                   bj3 bj3Var2 = ((ij3) this.f13886c.f16749a).f9659i;
/* 163 */                   ij3.m4555l(bj3Var2);
/* 171 */                   bj3Var2.m1370I(new bn3(this, zzfyVar, i));
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 5 */             ij3 ij3Var = (ij3) this.f13886c.f16749a;
/* 7 */             bj3 bj3Var = ij3Var.f9659i;
/* 9 */             ij3.m4555l(bj3Var);
/* 12 */            bj3Var.m1366E();
/* 15 */            uh3 uh3Var = ij3Var.f9655f;
/* 17 */            ij3.m4555l(uh3Var);
/* 24 */            uh3Var.f17533X.m8510a("Service disconnected");
/* 27 */            bj3 bj3Var2 = ij3Var.f9659i;
/* 29 */            ij3.m4555l(bj3Var2);
/* 38 */            bj3Var2.m1370I(new ol3(2, this, componentName));
                }
            }
