            package com.supercell.titan;

            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: renamed from: com.supercell.titan.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RunnableC0799f implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LocationService f6004a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ LocationService f6005b;

                public RunnableC0799f(LocationService locationService, LocationService locationService2) {
/* 4 */             this.f6005b = locationService;
/* 6 */             this.f6004a = locationService2;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             LocationService locationService = this.f6004a;
/* 3 */             LocationService locationService2 = this.f6005b;
                    try {
/* 7 */                 locationService2.f5822b.removeUpdates(locationService);
/* 12 */                locationService2.f5823c.removeActivityEventListener(locationService);
                    } catch (SecurityException e) {
/* 21 */                AbstractC1245n0.m4891s("LocationService", "Security Exception while stopping tracking location", e);
                    }
                }
            }
