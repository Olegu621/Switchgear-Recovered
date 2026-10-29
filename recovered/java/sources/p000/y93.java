            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import com.google.android.gms.internal.play_billing.zzau;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzkd;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y93 implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19549a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f19550b;

                public /* synthetic */ y93(Object obj, int i) {
/* 1 */             this.f19549a = i;
/* 3 */             this.f19550b = obj;
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    switch (this.f19549a) {
                        case 0:
/* 81 */                    z93 z93Var = (z93) this.f19550b;
/* 89 */                    z93Var.f20005b.m7756b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
/* 101 */                   z93Var.m10289a().post(new w93(this, iBinder));
                            break;
                        case 1:
/* 38 */                    zze.zzk("BillingClientTesting", "Billing Override Service connected.");
/* 49 */                    ((gf3) this.f19550b).f8589D = zzau.zzc(iBinder);
/* 56 */                    ((gf3) this.f19550b).f8588C = 2;
/* 60 */                    gf3 gf3Var = (gf3) this.f19550b;
/* 64 */                    zzkd zzkdVarM4526d = if3.m4526d(26);
/* 70 */                    Objects.requireNonNull(zzkdVarM4526d, "ApiSuccess should not be null");
/* 75 */                    gf3Var.f7711g.m9571v(zzkdVarM4526d);
                            break;
                        default:
/* 10 */                    yr3 yr3Var = (yr3) this.f19550b;
/* 18 */                    yr3Var.f19787b.m1530c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
/* 30 */                    yr3Var.m10177a().post(new mr3(this, iBinder));
                            break;
                    }
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                    switch (this.f19549a) {
                        case 0:
/* 59 */                    z93 z93Var = (z93) this.f19550b;
/* 67 */                    z93Var.f20005b.m7756b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
/* 79 */                    z93Var.m10289a().post(new x93(this, 0));
                            break;
                        case 1:
/* 40 */                    zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
/* 48 */                    ((gf3) this.f19550b).f8589D = null;
/* 54 */                    ((gf3) this.f19550b).f8588C = 0;
                            break;
                        default:
/* 11 */                    yr3 yr3Var = (yr3) this.f19550b;
/* 19 */                    yr3Var.f19787b.m1530c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
/* 32 */                    yr3Var.m10177a().post(new xq3(this, 1));
                            break;
                    }
                }
            }
