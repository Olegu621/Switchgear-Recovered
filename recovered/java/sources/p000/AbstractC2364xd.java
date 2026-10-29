            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: renamed from: xd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractC2364xd {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f19034a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2364xd.class, Object.class, "_consensus$volatile");

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ long f19035b = AbstractC1703b.f11726a.objectFieldOffset(AbstractC2364xd.class.getDeclaredField("_consensus$volatile"));
                private volatile /* synthetic */ Object _consensus$volatile = i13.f9399b;

                /* JADX INFO: renamed from: a */
                public abstract void mo8932a(Object obj, Object obj2);

                /* JADX INFO: renamed from: b */
                public final Object m9749b(Object obj) {
/* 3 */             f19034a.getClass();
/* 6 */             Unsafe unsafe = AbstractC1703b.f11726a;
/* 8 */             long j = f19035b;
/* 10 */            Object objectVolatile = unsafe.getObjectVolatile(this, j);
/* 14 */            C2131r4 c2131r4 = i13.f9399b;
/* 16 */            if (objectVolatile != c2131r4) {
/* 18 */                return objectVolatile;
                    }
                    while (true) {
/* 19 */                Unsafe unsafe2 = AbstractC1703b.f11726a;
/* 23 */                AbstractC2364xd abstractC2364xd = this;
/* 24 */                Object obj2 = obj;
/* 29 */                if (unsafe2.compareAndSwapObject(abstractC2364xd, f19035b, c2131r4, obj2)) {
/* 31 */                    return obj2;
                        }
/* 36 */                if (unsafe2.getObjectVolatile(abstractC2364xd, j) != c2131r4) {
/* 38 */                    return unsafe2.getObjectVolatile(abstractC2364xd, j);
                        }
/* 43 */                this = abstractC2364xd;
/* 44 */                obj = obj2;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m9750c(Object obj) {
/* 3 */             f19034a.getClass();
/* 10 */            Object objectVolatile = AbstractC1703b.f11726a.getObjectVolatile(this, f19035b);
/* 16 */            if (objectVolatile == i13.f9399b) {
/* 22 */                objectVolatile = m9749b(mo8933d(obj));
                    }
/* 26 */            mo8932a(obj, objectVolatile);
/* 29 */            return objectVolatile;
                }

                /* JADX INFO: renamed from: d */
                public abstract C2131r4 mo8933d(Object obj);

                public final String toString() {
/* 29 */            return getClass().getSimpleName() + '@' + k50.m5983t(this);
                }
            }
