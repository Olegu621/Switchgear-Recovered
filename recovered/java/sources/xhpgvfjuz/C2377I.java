            package xhpgvfjuz;

            import android.app.Activity;
            import android.app.Application;
            import android.os.Bundle;
            
            /* JADX INFO: renamed from: xhpgvfjuz.I */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C2377I implements Application.ActivityLifecycleCallbacks {

                /* JADX INFO: renamed from: a */
                private long f19128a;

                public C2377I() {
                    m9812b();
                }

                /* JADX INFO: renamed from: a */
                private native void m9811a();

                /* JADX INFO: renamed from: b */
                private native void m9812b();

                protected void finalize() throws Throwable {
                    try {
                        m9811a();
                        super.finalize();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            super.finalize();
                            throw th2;
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityCreated(Activity activity, Bundle bundle);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityDestroyed(Activity activity);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityPaused(Activity activity);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityResumed(Activity activity);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityStarted(Activity activity);

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public native void onActivityStopped(Activity activity);
            }
