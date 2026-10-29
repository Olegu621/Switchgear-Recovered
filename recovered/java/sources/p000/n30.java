            package p000;

            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.support.customtabs.IEngagementSignalsCallback;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n30 extends IEngagementSignalsCallback.Stub {

                /* JADX INFO: renamed from: a */
                public final Handler f14108a = new Handler(Looper.getMainLooper());

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fe0 f14109b;

                public n30(fe0 fe0Var) {
/* 1 */             this.f14109b = fe0Var;
                }

                @Override // android.support.customtabs.IEngagementSignalsCallback
                public final void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
/* 11 */            this.f14108a.post(new RunnableC2524z6(this.f14109b, i, bundle, 5));
                }

                @Override // android.support.customtabs.IEngagementSignalsCallback
                public final void onSessionEnded(boolean z, Bundle bundle) {
/* 11 */            this.f14108a.post(new m30(this.f14109b, z, bundle, 0));
                }

                @Override // android.support.customtabs.IEngagementSignalsCallback
                public final void onVerticalScrollEvent(boolean z, Bundle bundle) {
/* 11 */            this.f14108a.post(new m30(this.f14109b, z, bundle, 1));
                }
            }
