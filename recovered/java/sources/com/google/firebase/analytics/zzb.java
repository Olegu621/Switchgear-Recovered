            package com.google.firebase.analytics;

            import java.util.Objects;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzb implements Callable {
                final /* synthetic */ FirebaseAnalytics zza;

                public zzb(FirebaseAnalytics firebaseAnalytics) {
/* 1 */             Objects.requireNonNull(firebaseAnalytics);
/* 4 */             this.zza = firebaseAnalytics;
                }

                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() throws Exception {
/* 7 */             return this.zza.zza().zzG();
                }
            }
