            package com.google.android.gms.common.internal;

            import android.os.Bundle;
            import com.google.android.gms.common.ConnectionResult;
            import p000.ad3;
            
            /* JADX INFO: renamed from: com.google.android.gms.common.internal.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0326e extends ad3 {

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ AbstractC0322a f3525g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0326e(AbstractC0322a abstractC0322a, int i, Bundle bundle) {
/* 3 */             super(abstractC0322a, i, bundle);
/* 1 */             this.f3525g = abstractC0322a;
                }

                @Override // p000.ad3
                /* JADX INFO: renamed from: a */
                public final boolean mo205a() {
/* 7 */             this.f3525g.zzc.mo3444f(ConnectionResult.f3414f);
/* 10 */            return true;
                }

                @Override // p000.ad3
                /* JADX INFO: renamed from: b */
                public final void mo206b(ConnectionResult connectionResult) {
/* 1 */             AbstractC0322a abstractC0322a = this.f3525g;
/* 7 */             if (abstractC0322a.enableLocalFallback() && abstractC0322a.zzg()) {
/* 17 */                abstractC0322a.zzf(16);
                    } else {
/* 23 */                abstractC0322a.zzc.mo3444f(connectionResult);
/* 26 */                abstractC0322a.onConnectionFailed(connectionResult);
                    }
                }
            }
