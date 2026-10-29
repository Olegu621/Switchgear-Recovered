            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.support.customtabs.ICustomTabsCallback;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d30 extends ICustomTabsCallback.Stub {

                /* JADX INFO: renamed from: a */
                public final Handler f6965a = new Handler(Looper.getMainLooper());

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ w20 f6966b;

                public d30(w20 w20Var) {
/* 1 */             this.f6966b = w20Var;
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void extraCallback(String str, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new y20(this, str, bundle, 0));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
/* 1 */             w20 w20Var = this.f6966b;
/* 3 */             if (w20Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return w20Var.extraCallbackWithResult(str, bundle);
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 20 */            this.f6965a.post(new c30(this, i, i2, i3, i4, i5, bundle));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onActivityResized(int i, int i2, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 13 */            this.f6965a.post(new b30(this, i, i2, bundle));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onMessageChannelReady(Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new z20(this, bundle, 0));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onMinimized(Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new z20(this, bundle, 1));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onNavigationEvent(int i, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new RunnableC2064pb(this, i, bundle, 4));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onPostMessage(String str, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new y20(this, str, bundle, 1));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 18 */            this.f6965a.post(new a30(this, i, uri, z, bundle));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onUnminimized(Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new x20(this, bundle, 0));
                }

                @Override // android.support.customtabs.ICustomTabsCallback
                public final void onWarmupCompleted(Bundle bundle) {
/* 3 */             if (this.f6966b == null) {
/* 5 */                 return;
                    }
/* 14 */            this.f6965a.post(new x20(this, bundle, 1));
                }
            }
