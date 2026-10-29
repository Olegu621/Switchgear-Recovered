            package p000;

            import kotlin.coroutines.AbstractC1840a;
            import kotlin.coroutines.AbstractC1841b;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1843d;
            import kotlin.coroutines.InterfaceC1845f;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class s10 extends AbstractC1840a implements InterfaceC1843d {

                /* JADX INFO: renamed from: b */
                public static final r10 f16378b = new r10(InterfaceC1843d.f12918S, q10.f15365a);

                public s10() {
/* 3 */             super(InterfaceC1843d.f12918S);
                }

                /* JADX INFO: renamed from: g */
                public abstract void mo1539g(CoroutineContext coroutineContext, Runnable runnable);

                @Override // kotlin.coroutines.AbstractC1840a, kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
                    CoroutineContext.Element element;
/* 1 */             interfaceC1845f.getClass();
/* 7 */             if (interfaceC1845f instanceof AbstractC1841b) {
/* 9 */                 AbstractC1841b abstractC1841b = (AbstractC1841b) interfaceC1845f;
/* 11 */                InterfaceC1845f interfaceC1845f2 = this.f12913a;
/* 13 */                interfaceC1845f2.getClass();
/* 16 */                if ((interfaceC1845f2 == abstractC1841b || abstractC1841b.f12915b == interfaceC1845f2) && (element = (CoroutineContext.Element) abstractC1841b.f12914a.invoke(this)) != null) {
/* 34 */                    return element;
                        }
                    } else if (InterfaceC1843d.f12918S == interfaceC1845f) {
/* 39 */                return this;
                    }
/* 6 */             return null;
                }

                /* JADX INFO: renamed from: h */
                public void mo1540h(CoroutineContext coroutineContext, Runnable runnable) {
/* 1 */             mo1539g(coroutineContext, runnable);
                }

                /* JADX INFO: renamed from: i */
                public boolean mo6281i() {
/* 3 */             return !(this instanceof jx2);
                }

                /* JADX INFO: renamed from: k */
                public s10 mo1541k(int i) {
/* 1 */             j13.m5643c(i);
/* 6 */             return new m71(this, i);
                }

                @Override // kotlin.coroutines.AbstractC1840a, kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 1 */             interfaceC1845f.getClass();
/* 6 */             if (!(interfaceC1845f instanceof AbstractC1841b)) {
                        return InterfaceC1843d.f12918S == interfaceC1845f ? C1846g.f12919a : this;
                    }
/* 8 */             AbstractC1841b abstractC1841b = (AbstractC1841b) interfaceC1845f;
/* 10 */            InterfaceC1845f interfaceC1845f2 = this.f12913a;
/* 12 */            interfaceC1845f2.getClass();
                    return ((interfaceC1845f2 == abstractC1841b || abstractC1841b.f12915b == interfaceC1845f2) && ((CoroutineContext.Element) abstractC1841b.f12914a.invoke(this)) != null) ? C1846g.f12919a : this;
                }

                public String toString() {
/* 29 */            return getClass().getSimpleName() + '@' + k50.m5983t(this);
                }
            }
