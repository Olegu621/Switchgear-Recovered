            package io.sentry.util;

            import io.sentry.InterfaceC1466h1;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import java.util.concurrent.locks.ReentrantLock;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: io.sentry.util.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1702a implements InterfaceC1466h1 {

                /* JADX INFO: renamed from: b */
                public static final AtomicReferenceFieldUpdater f11723b = AtomicReferenceFieldUpdater.newUpdater(C1702a.class, ReentrantLock.class, "a");

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ long f11724c = AbstractC1703b.f11726a.objectFieldOffset(C1702a.class.getDeclaredField("a"));

                /* JADX INFO: renamed from: a */
                public volatile ReentrantLock f11725a;

                /* JADX INFO: renamed from: c */
                public final void m5443c() {
/* 5 */             m5444f().lock();
                }

                @Override // java.lang.AutoCloseable
                public final void close() {
/* 1 */             ReentrantLock reentrantLock = this.f11725a;
/* 5 */             AbstractC1704c.m5462q(reentrantLock, "close() called before acquire()");
/* 8 */             reentrantLock.unlock();
                }

                /* JADX INFO: renamed from: f */
                public final ReentrantLock m5444f() {
/* 1 */             ReentrantLock reentrantLock = this.f11725a;
/* 3 */             if (reentrantLock != null) {
/* 5 */                 return reentrantLock;
                    }
/* 8 */             ReentrantLock reentrantLock2 = new ReentrantLock();
/* 11 */            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11723b;
                    while (true) {
/* 13 */                atomicReferenceFieldUpdater.getClass();
/* 16 */                Unsafe unsafe = AbstractC1703b.f11726a;
/* 18 */                long j = f11724c;
/* 21 */                C1702a c1702a = this;
/* 26 */                if (unsafe.compareAndSwapObject(c1702a, j, (Object) null, reentrantLock2)) {
/* 28 */                    return reentrantLock2;
                        }
/* 33 */                if (unsafe.getObjectVolatile(c1702a, j) != null) {
/* 35 */                    ReentrantLock reentrantLock3 = c1702a.f11725a;
/* 39 */                    AbstractC1704c.m5462q(reentrantLock3, "lock must have been set by the winning thread");
/* 42 */                    return reentrantLock3;
                        }
/* 43 */                this = c1702a;
                    }
                }
            }
