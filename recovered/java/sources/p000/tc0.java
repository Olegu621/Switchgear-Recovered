            package p000;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import androidx.emoji2.text.EmojiCompatInitializer;
            import androidx.lifecycle.DefaultLifecycleObserver;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tc0 implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ v61 f17030a;

                public tc0(EmojiCompatInitializer emojiCompatInitializer, v61 v61Var) {
/* 4 */             this.f17030a = v61Var;
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onResume(g71 g71Var) {
/* 33 */            (Build.VERSION.SDK_INT >= 28 ? AbstractC2087py.m7583a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new vc0(0), 500L);
/* 38 */            this.f17030a.mo4484b(this);
                }
            }
