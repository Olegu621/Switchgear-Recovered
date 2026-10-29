            package com.google.android.gms.internal.measurement;

            import android.os.RemoteException;
            import android.os.SystemClock;
            import java.util.Objects;
            import p000.xt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzeq implements Runnable {
                final long zzh;
                final long zzi;
                final boolean zzj;
                final /* synthetic */ zzfb zzk;

                public zzeq(zzfb zzfbVar, boolean z) {
/* 1 */             Objects.requireNonNull(zzfbVar);
/* 4 */             this.zzk = zzfbVar;
/* 13 */            ((xt0) zzfbVar.zza).getClass();
/* 20 */            this.zzh = System.currentTimeMillis();
/* 26 */            ((xt0) zzfbVar.zza).getClass();
/* 33 */            this.zzi = SystemClock.elapsedRealtime();
/* 35 */            this.zzj = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 7 */             if (this.zzk.zzP()) {
/* 9 */                 zzb();
/* 12 */                return;
                    }
                    try {
/* 13 */                zza();
                    } catch (Exception e) {
/* 23 */                this.zzk.zzN(e, false, this.zzj);
/* 26 */                zzb();
                    }
                }

                public abstract void zza() throws RemoteException;

                public void zzb() {
                }
            }
