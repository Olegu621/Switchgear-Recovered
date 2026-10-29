            package com.google.android.gms.internal.games_v2;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzat implements Application.ActivityLifecycleCallbacks {
                final /* synthetic */ zzau zza;
                private final Application zzb;
                private boolean zzc = false;

                public /* synthetic */ zzat(zzau zzauVar, Application application, zzas zzasVar) {
/* 1 */             this.zza = zzauVar;
/* 9 */             this.zzb = application;
                }

                public static /* bridge */ /* synthetic */ void zza(zzat zzatVar) {
/* 3 */             if (zzatVar.zzc) {
/* 5 */                 return;
                    }
/* 8 */             zzatVar.zzb.registerActivityLifecycleCallbacks(zzatVar);
/* 12 */            zzatVar.zzc = true;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 3 */             this.zzb.unregisterActivityLifecycleCallbacks(this);
/* 8 */             if (this.zzc) {
/* 12 */                this.zzc = false;
/* 18 */                zzez.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
/* 27 */                this.zza.zzc.zza();
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }
            }
