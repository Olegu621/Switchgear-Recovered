            package io.sentry.transport;

            import java.util.concurrent.locks.AbstractQueuedSynchronizer;
            
            /* JADX INFO: renamed from: io.sentry.transport.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1691q extends AbstractQueuedSynchronizer {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f11714a = 0;

                public C1691q() {
/* 5 */             setState(0);
                }

                /* JADX INFO: renamed from: a */
                public static int m5429a(C1691q c1691q) {
/* 1 */             return c1691q.getState();
                }

                /* JADX INFO: renamed from: b */
                public static void m5430b(C1691q c1691q) {
                    int state;
/* 11 */            do {
/* 1 */                 state = c1691q.getState();
/* 11 */            } while (!c1691q.compareAndSetState(state, state + 1));
                }

                @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
                public final int tryAcquireShared(int i) {
                    return getState() == 0 ? 1 : -1;
                }

                @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
                public final boolean tryReleaseShared(int i) {
                    int state;
                    int i2;
/* 15 */            do {
/* 1 */                 state = getState();
/* 6 */                 if (state == 0) {
/* 5 */                     return false;
                        }
/* 9 */                 i2 = state - 1;
/* 15 */            } while (!compareAndSetState(state, i2));
                    return i2 == 0;
                }
            }
