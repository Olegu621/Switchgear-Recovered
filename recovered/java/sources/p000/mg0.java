            package p000;

            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mg0 implements m73 {

                /* JADX INFO: renamed from: a */
                public final WindowLayoutComponent f13755a;

                /* JADX INFO: renamed from: b */
                public final ReentrantLock f13756b = new ReentrantLock();

                /* JADX INFO: renamed from: c */
                public final LinkedHashMap f13757c = new LinkedHashMap();

                /* JADX INFO: renamed from: d */
                public final LinkedHashMap f13758d = new LinkedHashMap();

                public mg0(WindowLayoutComponent windowLayoutComponent) {
/* 4 */             this.f13755a = windowLayoutComponent;
                }

                @Override // p000.m73
                /* JADX INFO: renamed from: a */
                public final void mo4177a(Context context, qd1 qd1Var, dl0 dl0Var) {
                    Unit unit;
/* 1 */             LinkedHashMap linkedHashMap = this.f13757c;
/* 3 */             ReentrantLock reentrantLock = this.f13756b;
/* 5 */             reentrantLock.lock();
                    try {
/* 12 */                pk1 pk1Var = (pk1) linkedHashMap.get(context);
/* 14 */                LinkedHashMap linkedHashMap2 = this.f13758d;
/* 16 */                if (pk1Var != null) {
/* 18 */                    pk1Var.m7464b(dl0Var);
/* 21 */                    linkedHashMap2.put(dl0Var, context);
/* 24 */                    unit = Unit.f12910a;
                        } else {
/* 29 */                    unit = null;
                        }
/* 30 */                if (unit == null) {
/* 34 */                    pk1 pk1Var2 = new pk1(context);
/* 37 */                    linkedHashMap.put(context, pk1Var2);
/* 40 */                    linkedHashMap2.put(dl0Var, context);
/* 43 */                    pk1Var2.m7464b(dl0Var);
/* 48 */                    this.f13755a.addWindowLayoutInfoListener(context, pk1Var2);
                        }
                    } finally {
/* 55 */                reentrantLock.unlock();
                    }
                }

                @Override // p000.m73
                /* JADX INFO: renamed from: b */
                public final void mo4178b(dl0 dl0Var) {
/* 1 */             LinkedHashMap linkedHashMap = this.f13757c;
/* 3 */             LinkedHashMap linkedHashMap2 = this.f13758d;
/* 5 */             ReentrantLock reentrantLock = this.f13756b;
/* 7 */             reentrantLock.lock();
                    try {
/* 14 */                Context context = (Context) linkedHashMap2.get(dl0Var);
/* 16 */                if (context == null) {
/* 18 */                    reentrantLock.unlock();
/* 21 */                    return;
                        }
/* 26 */                pk1 pk1Var = (pk1) linkedHashMap.get(context);
/* 28 */                if (pk1Var == null) {
/* 30 */                    reentrantLock.unlock();
/* 33 */                    return;
                        }
/* 34 */                LinkedHashSet linkedHashSet = pk1Var.f15162d;
/* 36 */                ReentrantLock reentrantLock2 = pk1Var.f15160b;
/* 38 */                reentrantLock2.lock();
                        try {
/* 41 */                    linkedHashSet.remove(dl0Var);
/* 44 */                    reentrantLock2.unlock();
/* 47 */                    linkedHashMap2.remove(dl0Var);
/* 54 */                    if (linkedHashSet.isEmpty()) {
/* 56 */                        linkedHashMap.remove(context);
/* 61 */                        this.f13755a.removeWindowLayoutInfoListener(pk1Var);
                            }
/* 67 */                    reentrantLock.unlock();
                        } catch (Throwable th) {
/* 72 */                    reentrantLock2.unlock();
/* 75 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 76 */                reentrantLock.unlock();
/* 79 */                throw th2;
                    }
                }
            }
