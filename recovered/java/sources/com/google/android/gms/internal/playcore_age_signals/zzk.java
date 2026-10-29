            package com.google.android.gms.internal.playcore_age_signals;

            import android.os.IBinder;
            import android.os.IInterface;
            import com.google.android.play.agesignals.protocol.IAgeSignalsService;
            import java.util.Iterator;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzk extends zze {
                final /* synthetic */ IBinder zza;
                final /* synthetic */ zzm zzb;

                public zzk(zzm zzmVar, IBinder iBinder) {
/* 1 */             this.zza = iBinder;
/* 3 */             Objects.requireNonNull(zzmVar);
/* 6 */             this.zzb = zzmVar;
                }

                @Override // com.google.android.gms.internal.playcore_age_signals.zze
                public final void zzb() {
                    IAgeSignalsService proxy;
/* 1 */             IBinder iBinder = this.zza;
/* 3 */             int i = IAgeSignalsService.Stub.f5141a;
/* 5 */             if (iBinder == null) {
/* 7 */                 proxy = null;
                    } else {
/* 11 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
/* 25 */                proxy = iInterfaceQueryLocalInterface instanceof IAgeSignalsService ? (IAgeSignalsService) iInterfaceQueryLocalInterface : new IAgeSignalsService.Stub.Proxy(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
                    }
/* 31 */            zzo zzoVar = this.zzb.zza;
/* 1 */             zzoVar.zzn = proxy;
/* 36 */            zzo.zzr(zzoVar);
/* 2 */             zzoVar.zzh = false;
/* 47 */            Iterator it = zzoVar.zze.iterator();
/* 55 */            while (it.hasNext()) {
/* 63 */                ((Runnable) it.next()).run();
                    }
/* 71 */            zzoVar.zze.clear();
                }
            }
