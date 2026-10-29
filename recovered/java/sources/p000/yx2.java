            package p000;

            import com.google.android.gms.measurement.internal.zzbe;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class yx2 implements Iterator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19849a = 0;

                /* JADX INFO: renamed from: b */
                public Iterator f19850b;

                public yx2(zzbe zzbeVar) {
/* 17 */            this.f19850b = zzbeVar.f4207a.keySet().iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    switch (this.f19849a) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 8 */             return this.f19850b.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
                    switch (this.f19849a) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
/* 12 */            return (String) this.f19850b.next();
                }

                @Override // java.util.Iterator
                public final void remove() {
                    switch (this.f19849a) {
                        case 0:
/* 25 */                    throw new UnsupportedOperationException();
                        case 1:
/* 19 */                    throw new UnsupportedOperationException("Remove not supported");
                        default:
/* 11 */                    throw new UnsupportedOperationException();
                    }
                }

/* 19 */        public /* synthetic */ yx2() {
                }

/* 20 */        public yx2(oq3 oq3Var) {
/* 23 */            this.f19850b = oq3Var.f14867a.iterator();
                }
            }
