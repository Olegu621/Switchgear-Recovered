            package com.google.android.gms.games.internal.p006v2.resolution;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Intent;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.tasks.Task;
            
            /* JADX INFO: renamed from: com.google.android.gms.games.internal.v2.resolution.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0329a {
                /* JADX INFO: renamed from: a */
                public static final Task m2113a(Activity activity, PendingIntent pendingIntent) {
/* 3 */             zza zzaVar = new zza();
/* 10 */            Intent intent = new Intent(activity, (Class<?>) GamesResolutionActivity.class);
/* 15 */            intent.putExtra(AbstractC0322a.KEY_PENDING_INTENT, pendingIntent);
/* 20 */            intent.putExtra("resultReceiver", zzaVar);
/* 23 */            activity.startActivity(intent);
/* 28 */            return zzaVar.f4040a.getTask();
                }
            }
