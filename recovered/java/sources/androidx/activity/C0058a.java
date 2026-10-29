            package androidx.activity;

            import p000.d71;
            import p000.g71;
            import p000.t61;
            
            /* JADX INFO: renamed from: androidx.activity.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0058a implements d71 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ComponentActivity f346a;

                public C0058a(ComponentActivity componentActivity) {
/* 4 */             this.f346a = componentActivity;
                }

                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 3 */             if (t61Var == t61.ON_DESTROY) {
/* 10 */                this.f346a.mContextAwareHelper.f14087b = null;
/* 18 */                if (!this.f346a.isChangingConfigurations()) {
/* 26 */                    this.f346a.getViewModelStore().m8686a();
                        }
/* 33 */                ViewTreeObserverOnDrawListenerC0059b viewTreeObserverOnDrawListenerC0059b = (ViewTreeObserverOnDrawListenerC0059b) this.f346a.mReportFullyDrawnExecutor;
/* 35 */                ComponentActivity componentActivity = viewTreeObserverOnDrawListenerC0059b.f350d;
/* 45 */                componentActivity.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0059b);
/* 60 */                componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0059b);
                    }
                }
            }
