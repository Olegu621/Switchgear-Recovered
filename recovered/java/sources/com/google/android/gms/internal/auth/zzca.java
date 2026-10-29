            package com.google.android.gms.internal.auth;

            import android.database.ContentObserver;
            import android.os.Handler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzca extends ContentObserver {
                public zzca(Handler handler) {
/* 2 */             super(null);
                }

                @Override // android.database.ContentObserver
                public final void onChange(boolean z) {
/* 6 */             zzcb.zzk.set(true);
                }
            }
