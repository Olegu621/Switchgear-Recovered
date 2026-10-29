            package p000;

            import android.app.Activity;
            import android.app.Fragment;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import androidx.lifecycle.ProcessLifecycleOwner;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ux1 extends ld0 {
                final /* synthetic */ ProcessLifecycleOwner this$0;

                /* JADX INFO: renamed from: ux1$a */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class C2272a extends ld0 {
                    final /* synthetic */ ProcessLifecycleOwner this$0;

                    public C2272a(ProcessLifecycleOwner processLifecycleOwner) {
/* 1 */                 this.this$0 = processLifecycleOwner;
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity) {
/* 1 */                 activity.getClass();
/* 6 */                 this.this$0.m755a();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 ProcessLifecycleOwner processLifecycleOwner = this.this$0;
/* 9 */                 int i = processLifecycleOwner.f1536a + 1;
/* 10 */                processLifecycleOwner.f1536a = i;
/* 12 */                if (i == 1 && processLifecycleOwner.f1539d) {
/* 22 */                    processLifecycleOwner.f1541f.m4487e(t61.ON_START);
/* 26 */                    processLifecycleOwner.f1539d = false;
                        }
                    }
                }

                public ux1(ProcessLifecycleOwner processLifecycleOwner) {
/* 1 */             this.this$0 = processLifecycleOwner;
                }

                @Override // p000.ld0, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
/* 8 */             if (Build.VERSION.SDK_INT < 29) {
/* 10 */                int i = k32.f12578b;
/* 18 */                Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
/* 22 */                fragmentFindFragmentByTag.getClass();
/* 31 */                ((k32) fragmentFindFragmentByTag).f12579a = this.this$0.f1543v;
                    }
                }

                @Override // p000.ld0, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
/* 1 */             activity.getClass();
/* 4 */             ProcessLifecycleOwner processLifecycleOwner = this.this$0;
/* 8 */             int i = processLifecycleOwner.f1537b - 1;
/* 10 */            processLifecycleOwner.f1537b = i;
/* 12 */            if (i == 0) {
/* 14 */                Handler handler = processLifecycleOwner.f1540e;
/* 16 */                handler.getClass();
/* 23 */                handler.postDelayed(processLifecycleOwner.f1542i, 700L);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPreCreated(Activity activity, Bundle bundle) {
/* 1 */             activity.getClass();
/* 11 */            tx1.m8920a(activity, new C2272a(this.this$0));
                }

                @Override // p000.ld0, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
/* 1 */             activity.getClass();
/* 4 */             ProcessLifecycleOwner processLifecycleOwner = this.this$0;
/* 8 */             int i = processLifecycleOwner.f1536a - 1;
/* 10 */            processLifecycleOwner.f1536a = i;
/* 12 */            if (i == 0 && processLifecycleOwner.f1538c) {
/* 22 */                processLifecycleOwner.f1541f.m4487e(t61.ON_STOP);
/* 26 */                processLifecycleOwner.f1539d = true;
                    }
                }
            }
