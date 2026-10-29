            package p000;

            import android.app.Activity;
            import android.app.Application;
            import android.content.ComponentCallbacks2;
            import android.content.res.Configuration;
            import android.os.Bundle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            /* JADX INFO: renamed from: kh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ComponentCallbacks2C1831kh implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

                /* JADX INFO: renamed from: e */
                public static final ComponentCallbacks2C1831kh f12758e = new ComponentCallbacks2C1831kh();

                /* JADX INFO: renamed from: a */
                public final AtomicBoolean f12759a = new AtomicBoolean();

                /* JADX INFO: renamed from: b */
                public final AtomicBoolean f12760b = new AtomicBoolean();

                /* JADX INFO: renamed from: c */
                public final ArrayList f12761c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public boolean f12762d = false;

                /* JADX INFO: renamed from: a */
                public static void m6102a(Application application) {
/* 1 */             ComponentCallbacks2C1831kh componentCallbacks2C1831kh = f12758e;
                    synchronized (componentCallbacks2C1831kh) {
                        try {
/* 6 */                     if (!componentCallbacks2C1831kh.f12762d) {
/* 8 */                         application.registerActivityLifecycleCallbacks(componentCallbacks2C1831kh);
/* 11 */                        application.registerComponentCallbacks(componentCallbacks2C1831kh);
/* 15 */                        componentCallbacks2C1831kh.f12762d = true;
                            }
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6103b(boolean z) {
                    synchronized (f12758e) {
                        try {
/* 6 */                     Iterator it = this.f12761c.iterator();
/* 14 */                    while (it.hasNext()) {
/* 22 */                        ((InterfaceC1793jh) it.next()).mo149a(z);
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
/* 5 */             boolean zCompareAndSet = this.f12759a.compareAndSet(true, false);
/* 11 */            this.f12760b.set(true);
/* 14 */            if (zCompareAndSet) {
/* 16 */                m6103b(false);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
/* 5 */             boolean zCompareAndSet = this.f12759a.compareAndSet(true, false);
/* 11 */            this.f12760b.set(true);
/* 14 */            if (zCompareAndSet) {
/* 16 */                m6103b(false);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
                }

                @Override // android.content.ComponentCallbacks
                public final void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks2
                public final void onTrimMemory(int i) {
/* 3 */             if (i == 20 && this.f12759a.compareAndSet(false, true)) {
/* 17 */                this.f12760b.set(true);
/* 20 */                m6103b(true);
                    }
                }
            }
