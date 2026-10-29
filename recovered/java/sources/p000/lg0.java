            package p000;

            import android.app.Activity;
            import android.content.Context;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lg0 implements m73 {

                /* JADX INFO: renamed from: a */
                public final WindowLayoutComponent f13262a;

                /* JADX INFO: renamed from: b */
                public final d52 f13263b;

                /* JADX INFO: renamed from: c */
                public final ReentrantLock f13264c = new ReentrantLock();

                /* JADX INFO: renamed from: d */
                public final LinkedHashMap f13265d = new LinkedHashMap();

                /* JADX INFO: renamed from: e */
                public final LinkedHashMap f13266e = new LinkedHashMap();

                /* JADX INFO: renamed from: f */
                public final LinkedHashMap f13267f = new LinkedHashMap();

                public lg0(WindowLayoutComponent windowLayoutComponent, d52 d52Var) {
/* 4 */             this.f13262a = windowLayoutComponent;
/* 6 */             this.f13263b = d52Var;
                }

                @Override // p000.m73
                /* JADX INFO: renamed from: a */
                public final void mo4177a(Context context, qd1 qd1Var, dl0 dl0Var) {
                    Unit unit;
/* 1 */             LinkedHashMap linkedHashMap = this.f13265d;
/* 3 */             ReentrantLock reentrantLock = this.f13264c;
/* 5 */             reentrantLock.lock();
                    try {
/* 12 */                pk1 pk1Var = (pk1) linkedHashMap.get(context);
/* 14 */                LinkedHashMap linkedHashMap2 = this.f13266e;
/* 16 */                if (pk1Var != null) {
/* 18 */                    pk1Var.m7464b(dl0Var);
/* 21 */                    linkedHashMap2.put(dl0Var, context);
/* 24 */                    unit = Unit.f12910a;
                        } else {
/* 30 */                    unit = null;
                        }
/* 31 */                if (unit == null) {
/* 35 */                    pk1 pk1Var2 = new pk1(context);
/* 38 */                    linkedHashMap.put(context, pk1Var2);
/* 41 */                    linkedHashMap2.put(dl0Var, context);
/* 44 */                    pk1Var2.m7464b(dl0Var);
/* 49 */                    if (!(context instanceof Activity)) {
/* 93 */                        pk1Var2.accept(new WindowLayoutInfo(nd0.f14189a));
                            } else {
/* 82 */                        this.f13267f.put(pk1Var2, this.f13263b.m2929B(this.f13262a, j22.m5667a(WindowLayoutInfo.class), (Activity) context, new kg0(1, pk1Var2, pk1.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                            }
                        }
                    } finally {
/* 104 */               reentrantLock.unlock();
                    }
                }

                @Override // p000.m73
                /* JADX INFO: renamed from: b */
                public final void mo4178b(dl0 dl0Var) {
/* 1 */             LinkedHashMap linkedHashMap = this.f13265d;
/* 3 */             LinkedHashMap linkedHashMap2 = this.f13266e;
/* 5 */             ReentrantLock reentrantLock = this.f13264c;
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
/* 65 */                        e00 e00Var = (e00) this.f13267f.remove(pk1Var);
/* 67 */                        if (e00Var != null) {
/* 79 */                            e00Var.f7462a.invoke(e00Var.f7463b, e00Var.f7464c);
                                }
                            }
/* 85 */                    reentrantLock.unlock();
                        } catch (Throwable th) {
/* 90 */                    reentrantLock2.unlock();
/* 93 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 94 */                reentrantLock.unlock();
/* 97 */                throw th2;
                    }
                }
            }
