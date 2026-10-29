            package io.flutter.embedding.android;

            import android.app.Activity;
            import java.util.LinkedHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.locks.ReentrantLock;
            import p000.C0210cb;
            import p000.C2223tm;
            import p000.c00;
            import p000.fk0;
            import p000.h01;
            import p000.i13;
            import p000.k50;
            import p000.of0;
            import p000.x73;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class WindowInfoRepositoryCallbackAdapterWrapper {
                final x73 adapter;

                public WindowInfoRepositoryCallbackAdapterWrapper(x73 x73Var) {
/* 4 */             this.adapter = x73Var;
                }

                public void addWindowLayoutInfoListener(Activity activity, Executor executor, c00 c00Var) {
/* 1 */             x73 x73Var = this.adapter;
/* 3 */             x73Var.getClass();
/* 6 */             activity.getClass();
/* 9 */             executor.getClass();
/* 12 */            c00Var.getClass();
/* 15 */            C0210cb c0210cb = x73Var.f18987b;
/* 19 */            fk0 fk0VarM8894I = x73Var.f18986a.m8894I(activity);
/* 25 */            LinkedHashMap linkedHashMap = (LinkedHashMap) c0210cb.f2805c;
/* 29 */            ReentrantLock reentrantLock = (ReentrantLock) c0210cb.f2804b;
/* 31 */            reentrantLock.lock();
                    try {
/* 38 */                if (linkedHashMap.get(c00Var) == null) {
/* 61 */                    linkedHashMap.put(c00Var, i13.m4443w(k50.m5964a(new of0(executor)), null, new C2223tm(fk0VarM8894I, c00Var, null, 0), 3));
                        }
                    } finally {
/* 71 */                reentrantLock.unlock();
                    }
                }

                public void removeWindowLayoutInfoListener(c00 c00Var) {
/* 1 */             x73 x73Var = this.adapter;
/* 3 */             x73Var.getClass();
/* 6 */             c00Var.getClass();
/* 9 */             C0210cb c0210cb = x73Var.f18987b;
/* 13 */            LinkedHashMap linkedHashMap = (LinkedHashMap) c0210cb.f2805c;
/* 17 */            ReentrantLock reentrantLock = (ReentrantLock) c0210cb.f2804b;
/* 19 */            reentrantLock.lock();
                    try {
/* 26 */                h01 h01Var = (h01) linkedHashMap.get(c00Var);
/* 28 */                if (h01Var != null) {
/* 31 */                    h01Var.cancel(null);
                        }
                    } finally {
/* 47 */                reentrantLock.unlock();
                    }
                }
            }
