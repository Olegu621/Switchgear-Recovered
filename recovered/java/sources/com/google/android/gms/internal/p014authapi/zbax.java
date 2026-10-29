            package com.google.android.gms.internal.p014authapi;

            import android.app.PendingIntent;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.jb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zbax extends zbaa {
                final /* synthetic */ TaskCompletionSource zba;

                public zbax(zbay zbayVar, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.zba = taskCompletionSource;
                }

                @Override // com.google.android.gms.internal.p014authapi.zbab
                public final void zbb(Status status, PendingIntent pendingIntent) {
/* 3 */             jb1.m5738D(status, pendingIntent, this.zba);
                }
            }
