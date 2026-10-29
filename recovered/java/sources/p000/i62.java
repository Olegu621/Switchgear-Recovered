            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import kotlin.jvm.functions.Function0;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class i62 implements p51, Serializable {

                /* JADX INFO: renamed from: c */
                public static final h62 f9467c = new h62(null);

                /* JADX INFO: renamed from: d */
                public static final AtomicReferenceFieldUpdater f9468d = AtomicReferenceFieldUpdater.newUpdater(i62.class, Object.class, "b");

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ long f9469e = AbstractC1703b.f11726a.objectFieldOffset(i62.class.getDeclaredField("b"));

                /* JADX INFO: renamed from: a */
                public volatile Function0 f9470a;

                /* JADX INFO: renamed from: b */
                public volatile Object f9471b;

                private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 7 */             return new vx0(getValue());
                }

                @Override // p000.p51
                public final Object getValue() {
                    i62 i62Var;
/* 1 */             Object obj = this.f9471b;
/* 3 */             xw2 xw2Var = xw2.f19388a;
/* 5 */             if (obj != xw2Var) {
/* 7 */                 return obj;
                    }
/* 8 */             Function0 function0 = this.f9470a;
/* 10 */            if (function0 != null) {
/* 12 */                Object objInvoke = function0.invoke();
/* 16 */                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9468d;
                        while (true) {
/* 18 */                    atomicReferenceFieldUpdater.getClass();
/* 21 */                    Unsafe unsafe = AbstractC1703b.f11726a;
/* 23 */                    long j = f9469e;
/* 25 */                    i62Var = this;
/* 30 */                    if (unsafe.compareAndSwapObject(i62Var, j, xw2Var, objInvoke)) {
/* 33 */                        i62Var.f9470a = null;
/* 35 */                        return objInvoke;
                            }
/* 40 */                    if (unsafe.getObjectVolatile(i62Var, j) == xw2Var) {
/* 43 */                        this = i62Var;
                            }
                        }
                    } else {
/* 45 */                i62Var = this;
                    }
/* 46 */            return i62Var.f9471b;
                }

                @Override // p000.p51
                public final boolean isInitialized() {
                    return this.f9471b != xw2.f19388a;
                }

                public final String toString() {
                    return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
                }
            }
