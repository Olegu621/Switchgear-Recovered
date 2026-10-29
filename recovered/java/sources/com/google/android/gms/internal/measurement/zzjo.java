            package com.google.android.gms.internal.measurement;

            import android.database.ContentObserver;
            import android.os.Handler;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjo extends ContentObserver {
                final /* synthetic */ zzjq zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzjo(zzjq zzjqVar, Handler handler) {
/* 7 */             super(null);
/* 1 */             Objects.requireNonNull(zzjqVar);
/* 4 */             this.zza = zzjqVar;
                }

                @Override // android.database.ContentObserver
                public final void onChange(boolean z) {
/* 3 */             this.zza.zzc();
                }
            }
