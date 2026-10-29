            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class r01 implements ix0 {

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ AtomicIntegerFieldUpdater f15818b = AtomicIntegerFieldUpdater.newUpdater(r01.class, "_isCompleting$volatile");

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f15819c = AtomicReferenceFieldUpdater.newUpdater(r01.class, Object.class, "_rootCause$volatile");

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f15820d;

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ long f15821e;

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ long f15822f;
                private volatile /* synthetic */ Object _exceptionsHolder$volatile;
                private volatile /* synthetic */ int _isCompleting$volatile = 0;
                private volatile /* synthetic */ Object _rootCause$volatile;

                /* JADX INFO: renamed from: a */
                public final qn1 f15823a;

                static {
/* 21 */            Unsafe unsafe = AbstractC1703b.f11726a;
/* 31 */            f15822f = unsafe.objectFieldOffset(r01.class.getDeclaredField("_rootCause$volatile"));
/* 39 */            f15820d = AtomicReferenceFieldUpdater.newUpdater(r01.class, Object.class, "_exceptionsHolder$volatile");
/* 49 */            f15821e = unsafe.objectFieldOffset(r01.class.getDeclaredField("_exceptionsHolder$volatile"));
                }

                public r01(qn1 qn1Var, Throwable th) {
/* 4 */             this.f15823a = qn1Var;
/* 9 */             this._rootCause$volatile = th;
                }

                /* JADX INFO: renamed from: a */
                public final void m8037a(Throwable th) {
/* 1 */             Throwable thM8039d = m8039d();
/* 5 */             if (thM8039d == null) {
/* 7 */                 m8044i(th);
/* 10 */                return;
                    }
/* 11 */            if (th == thM8039d) {
/* 30 */                return;
                    }
/* 14 */            Object objM8038b = m8038b();
/* 18 */            if (objM8038b == null) {
/* 20 */                m8043h(th);
/* 23 */                return;
                    }
/* 26 */            if (!(objM8038b instanceof Throwable)) {
/* 49 */                if (objM8038b instanceof ArrayList) {
/* 53 */                    ((ArrayList) objM8038b).add(th);
/* 56 */                    return;
                        } else {
/* 59 */                    ds0.m3201r(objM8038b, "State is ");
/* 62 */                    return;
                        }
                    }
/* 28 */            if (th == objM8038b) {
/* 30 */                return;
                    }
/* 34 */            ArrayList arrayList = new ArrayList(4);
/* 37 */            arrayList.add(objM8038b);
/* 40 */            arrayList.add(th);
/* 43 */            m8043h(arrayList);
                }

                /* JADX INFO: renamed from: b */
                public final Object m8038b() {
/* 3 */             f15820d.getClass();
/* 10 */            return AbstractC1703b.f11726a.getObjectVolatile(this, f15821e);
                }

                @Override // p000.ix0
                /* JADX INFO: renamed from: c */
                public final qn1 mo4393c() {
/* 1 */             return this.f15823a;
                }

                /* JADX INFO: renamed from: d */
                public final Throwable m8039d() {
/* 3 */             f15819c.getClass();
/* 14 */            return (Throwable) AbstractC1703b.f11726a.getObjectVolatile(this, f15822f);
                }

                /* JADX INFO: renamed from: e */
                public final boolean m8040e() {
                    return m8039d() != null;
                }

                /* JADX INFO: renamed from: f */
                public final boolean m8041f() {
                    return f15818b.get(this) != 0;
                }

                /* JADX INFO: renamed from: g */
                public final ArrayList m8042g(Throwable th) {
                    ArrayList arrayList;
/* 1 */             Object objM8038b = m8038b();
/* 6 */             if (objM8038b == null) {
/* 10 */                arrayList = new ArrayList(4);
                    } else if (objM8038b instanceof Throwable) {
/* 20 */                ArrayList arrayList2 = new ArrayList(4);
/* 23 */                arrayList2.add(objM8038b);
/* 26 */                arrayList = arrayList2;
                    } else {
/* 30 */                if (!(objM8038b instanceof ArrayList)) {
/* 63 */                    ds0.m3201r(objM8038b, "State is ");
/* 66 */                    return null;
                        }
/* 32 */                arrayList = (ArrayList) objM8038b;
                    }
/* 34 */            Throwable thM8039d = m8039d();
/* 38 */            if (thM8039d != null) {
/* 41 */                arrayList.add(0, thM8039d);
                    }
/* 44 */            if (th != null && !th.equals(thM8039d)) {
/* 52 */                arrayList.add(th);
                    }
/* 57 */            m8043h(j13.f12000j);
/* 60 */            return arrayList;
                }

                /* JADX INFO: renamed from: h */
                public final void m8043h(Object obj) {
/* 3 */             f15820d.getClass();
/* 10 */            AbstractC1703b.f11726a.putObjectVolatile(this, f15821e, obj);
                }

                /* JADX INFO: renamed from: i */
                public final void m8044i(Throwable th) {
/* 3 */             f15819c.getClass();
/* 10 */            AbstractC1703b.f11726a.putObjectVolatile(this, f15822f, th);
                }

                @Override // p000.ix0
                public final boolean isActive() {
                    return m8039d() == null;
                }

                public final String toString() {
/* 66 */            return "Finishing[cancelling=" + m8040e() + ", completing=" + m8041f() + ", rootCause=" + m8039d() + ", exceptions=" + m8038b() + ", list=" + this.f15823a + ']';
                }
            }
