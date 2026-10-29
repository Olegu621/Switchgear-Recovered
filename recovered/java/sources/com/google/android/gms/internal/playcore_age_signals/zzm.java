            package com.google.android.gms.internal.playcore_age_signals;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzm implements ServiceConnection {
                final /* synthetic */ zzo zza;

                public /* synthetic */ zzm(zzo zzoVar, zzn zznVar) {
/* 1 */             Objects.requireNonNull(zzoVar);
/* 4 */             this.zza = zzoVar;
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             zzo zzoVar = this.zza;
/* 13 */            zzoVar.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
/* 25 */            zzoVar.zzc().post(new zzk(this, iBinder));
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             zzo zzoVar = this.zza;
/* 13 */            zzoVar.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
/* 25 */            zzoVar.zzc().post(new zzl(this));
                }
            }
