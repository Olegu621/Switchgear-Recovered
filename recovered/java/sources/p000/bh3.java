            package p000;

            import android.app.Activity;
            import android.app.Application;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bh3 {

                /* JADX INFO: renamed from: g */
                public static final AtomicReference f2426g = new AtomicReference();

                /* JADX INFO: renamed from: a */
                public final Application f2427a;

                /* JADX INFO: renamed from: e */
                public WeakReference f2431e;

                /* JADX INFO: renamed from: b */
                public final dh0 f2428b = new dh0(this, 1);

                /* JADX INFO: renamed from: c */
                public final Object f2429c = new Object();

                /* JADX INFO: renamed from: d */
                public final Set f2430d = Collections.newSetFromMap(new WeakHashMap());

                /* JADX INFO: renamed from: f */
                public boolean f2432f = false;

                public bh3(Application application) {
/* 33 */            this.f2427a = application;
                }

                /* JADX INFO: renamed from: b */
                public static bh3 m1359b(Application application) {
/* 1 */             kb1.m6061n(application);
/* 4 */             AtomicReference atomicReference = f2426g;
/* 10 */            bh3 bh3Var = (bh3) atomicReference.get();
/* 12 */            if (bh3Var != null) {
/* 14 */                return bh3Var;
                    }
/* 17 */            bh3 bh3Var2 = new bh3(application);
/* 25 */            while (!atomicReference.compareAndSet(null, bh3Var2) && (atomicReference.get() == null || atomicReference.get() == null)) {
                    }
/* 44 */            return (bh3) atomicReference.get();
                }

                /* JADX INFO: renamed from: c */
                public static /* bridge */ /* synthetic */ void m1360c(bh3 bh3Var, Activity activity) {
/* 1 */             kb1.m6061n(activity);
                    synchronized (bh3Var.f2429c) {
                        try {
/* 11 */                    if (bh3Var.m1361a() == activity) {
/* 14 */                        return;
                            }
/* 22 */                    bh3Var.f2431e = new WeakReference(activity);
/* 26 */                    Iterator it = bh3Var.f2430d.iterator();
/* 34 */                    while (it.hasNext()) {
/* 42 */                        ((sd3) it.next()).m8482a(activity);
                            }
                        } catch (Throwable th) {
/* 49 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final Activity m1361a() {
                    Activity activity;
                    synchronized (this.f2429c) {
/* 4 */                 WeakReference weakReference = this.f2431e;
/* 14 */                activity = weakReference == null ? null : (Activity) weakReference.get();
                    }
/* 17 */            return activity;
                }
            }
