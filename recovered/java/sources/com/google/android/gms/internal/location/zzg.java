            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import p000.eb3;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzg {
                public final sr1 removeActivityUpdates(tr0 tr0Var, PendingIntent pendingIntent) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zze(this, tr0Var, pendingIntent));
                }

                public final sr1 requestActivityUpdates(tr0 tr0Var, long j, PendingIntent pendingIntent) {
/* 15 */            return ((eb3) tr0Var).f7609b.doWrite(new zzd(this, tr0Var, j, pendingIntent));
                }
            }
