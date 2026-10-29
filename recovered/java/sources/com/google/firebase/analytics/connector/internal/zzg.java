            package com.google.firebase.analytics.connector.internal;

            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import java.util.Set;
            import p000.C0986hc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzg implements zza {
                private final AnalyticsConnector.AnalyticsConnectorListener zza;
                private final C0986hc zzb;
                private final zzf zzc;

                public zzg(C0986hc c0986hc, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
/* 4 */             this.zza = analyticsConnectorListener;
/* 6 */             this.zzb = c0986hc;
/* 10 */            zzf zzfVar = new zzf(this);
/* 13 */            this.zzc = zzfVar;
/* 17 */            c0986hc.f9004a.zzf(zzfVar);
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final AnalyticsConnector.AnalyticsConnectorListener zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final void zzb(Set set) {
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final void zzc() {
                }

                public final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener zzd() {
/* 1 */             return this.zza;
                }
            }
