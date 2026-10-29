            package com.google.android.gms.internal.measurement;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfa implements Application.ActivityLifecycleCallbacks {
                final /* synthetic */ zzfb zza;

                public zzfa(zzfb zzfbVar) {
/* 1 */             Objects.requireNonNull(zzfbVar);
/* 4 */             this.zza = zzfbVar;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 8 */             this.zza.zzM(new zzet(this, bundle, activity));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
/* 8 */             this.zza.zzM(new zzez(this, activity));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
/* 8 */             this.zza.zzM(new zzew(this, activity));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 8 */             this.zza.zzM(new zzev(this, activity));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 3 */             zzco zzcoVar = new zzco();
/* 13 */            this.zza.zzM(new zzey(this, activity, zzcoVar));
/* 18 */            Bundle bundleZze = zzcoVar.zze(50L);
/* 22 */            if (bundleZze != null) {
/* 24 */                bundle.putAll(bundleZze);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
/* 8 */             this.zza.zzM(new zzeu(this, activity));
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
/* 8 */             this.zza.zzM(new zzex(this, activity));
                }
            }
