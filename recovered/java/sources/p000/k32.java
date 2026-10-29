            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.app.Fragment;
            import android.os.Build;
            import android.os.Bundle;
            import androidx.lifecycle.ProcessLifecycleOwner;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class k32 extends Fragment {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ int f12578b = 0;

                /* JADX INFO: renamed from: a */
                public ts0 f12579a;

                /* JADX INFO: renamed from: k32$a */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class C1817a implements Application.ActivityLifecycleCallbacks {
                    public static final j32 Companion = new j32();

                    public static final void registerIn(Activity activity) {
/* 3 */                 Companion.getClass();
/* 6 */                 activity.getClass();
/* 1 */                 activity.registerActivityLifecycleCallbacks(new C1817a());
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity, Bundle bundle) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostCreated(Activity activity, Bundle bundle) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_CREATE);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_RESUME);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_START);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPreDestroyed(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_DESTROY);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPrePaused(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_PAUSE);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPreStopped(Activity activity) {
/* 1 */                 activity.getClass();
/* 4 */                 int i = k32.f12578b;
/* 8 */                 i32.m4461a(activity, t61.ON_STOP);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
/* 1 */                 activity.getClass();
/* 4 */                 bundle.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity) {
/* 1 */                 activity.getClass();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity) {
/* 1 */                 activity.getClass();
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m5943a(t61 t61Var) {
/* 5 */             if (Build.VERSION.SDK_INT < 29) {
/* 7 */                 Activity activity = getActivity();
/* 11 */                activity.getClass();
/* 14 */                i32.m4461a(activity, t61Var);
                    }
                }

                @Override // android.app.Fragment
                public final void onActivityCreated(Bundle bundle) {
/* 1 */             super.onActivityCreated(bundle);
/* 6 */             m5943a(t61.ON_CREATE);
                }

                @Override // android.app.Fragment
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 6 */             m5943a(t61.ON_DESTROY);
/* 10 */            this.f12579a = null;
                }

                @Override // android.app.Fragment
                public final void onPause() {
/* 1 */             super.onPause();
/* 6 */             m5943a(t61.ON_PAUSE);
                }

                @Override // android.app.Fragment
                public final void onResume() {
/* 1 */             super.onResume();
/* 4 */             ts0 ts0Var = this.f12579a;
/* 6 */             if (ts0Var != null) {
/* 12 */                ((ProcessLifecycleOwner) ts0Var.f17248a).m755a();
                    }
/* 17 */            m5943a(t61.ON_RESUME);
                }

                @Override // android.app.Fragment
                public final void onStart() {
/* 1 */             super.onStart();
/* 4 */             ts0 ts0Var = this.f12579a;
/* 6 */             if (ts0Var != null) {
/* 10 */                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) ts0Var.f17248a;
/* 15 */                int i = processLifecycleOwner.f1536a + 1;
/* 16 */                processLifecycleOwner.f1536a = i;
/* 18 */                if (i == 1 && processLifecycleOwner.f1539d) {
/* 28 */                    processLifecycleOwner.f1541f.m4487e(t61.ON_START);
/* 32 */                    processLifecycleOwner.f1539d = false;
                        }
                    }
/* 36 */            m5943a(t61.ON_START);
                }

                @Override // android.app.Fragment
                public final void onStop() {
/* 1 */             super.onStop();
/* 6 */             m5943a(t61.ON_STOP);
                }
            }
