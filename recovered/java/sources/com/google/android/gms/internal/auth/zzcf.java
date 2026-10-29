            package com.google.android.gms.internal.auth;

            import android.database.ContentObserver;
            import android.os.Handler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcf extends ContentObserver {
                final /* synthetic */ zzcg zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzcf(zzcg zzcgVar, Handler handler) {
/* 4 */             super(null);
/* 1 */             this.zza = zzcgVar;
                }

                @Override // android.database.ContentObserver
                public final void onChange(boolean z) {
/* 3 */             this.zza.zze();
                }
            }
