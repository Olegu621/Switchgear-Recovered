            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.internal.measurement.zzda;
            import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fq3 implements rk3 {

                /* JADX INFO: renamed from: a */
                public final zzda f8323a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AppMeasurementDynamiteService f8324b;

                public fq3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzda zzdaVar) {
/* 4 */             this.f8324b = appMeasurementDynamiteService;
/* 6 */             this.f8323a = zzdaVar;
                }

                @Override // p000.rk3
                public final void onEvent(String str, String str2, Bundle bundle, long j) {
                    try {
/* 7 */                 this.f8323a.zze(str, str2, bundle, j);
                    } catch (RemoteException e) {
/* 15 */                ij3 ij3Var = this.f8324b.f4190a;
/* 17 */                if (ij3Var != null) {
/* 19 */                    uh3 uh3Var = ij3Var.f9655f;
/* 21 */                    ij3.m4555l(uh3Var);
/* 28 */                    uh3Var.f17541w.m8511b(e, "Event listener threw exception");
                        }
                    }
                }
            }
