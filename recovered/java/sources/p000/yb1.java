            package p000;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yb1 implements Iterator, Map.Entry {

                /* JADX INFO: renamed from: a */
                public int f19566a;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ kx0 f19569d;

                /* JADX INFO: renamed from: c */
                public boolean f19568c = false;

                /* JADX INFO: renamed from: b */
                public int f19567b = -1;

                public yb1(kx0 kx0Var) {
/* 4 */             this.f19569d = kx0Var;
/* 15 */            this.f19566a = kx0Var.mo4169e() - 1;
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 4 */             if (!this.f19568c) {
/* 63 */                f42.m3656l("This container does not support retaining Map.Entry objects");
/* 3 */                 return false;
                    }
/* 8 */             if (!(obj instanceof Map.Entry)) {
/* 3 */                 return false;
                    }
/* 11 */            Map.Entry entry = (Map.Entry) obj;
/* 13 */            Object key = entry.getKey();
/* 17 */            int i = this.f19567b;
/* 19 */            kx0 kx0Var = this.f19569d;
/* 21 */            Object objMo4167c = kx0Var.mo4167c(i, 0);
/* 25 */            if (key != objMo4167c && (key == null || !key.equals(objMo4167c))) {
/* 3 */                 return false;
                    }
/* 37 */            Object value = entry.getValue();
/* 44 */            Object objMo4167c2 = kx0Var.mo4167c(this.f19567b, 1);
                    return value == objMo4167c2 || (value != null && value.equals(objMo4167c2));
                }

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 3 */             if (this.f19568c) {
/* 10 */                return this.f19569d.mo4167c(this.f19567b, 0);
                    }
/* 17 */            f42.m3656l("This container does not support retaining Map.Entry objects");
/* 20 */            return null;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 3 */             if (this.f19568c) {
/* 10 */                return this.f19569d.mo4167c(this.f19567b, 1);
                    }
/* 17 */            f42.m3656l("This container does not support retaining Map.Entry objects");
/* 20 */            return null;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f19567b < this.f19566a;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 4 */             if (!this.f19568c) {
/* 41 */                f42.m3656l("This container does not support retaining Map.Entry objects");
/* 3 */                 return 0;
                    }
/* 6 */             int i = this.f19567b;
/* 8 */             kx0 kx0Var = this.f19569d;
/* 10 */            Object objMo4167c = kx0Var.mo4167c(i, 0);
/* 17 */            Object objMo4167c2 = kx0Var.mo4167c(this.f19567b, 1);
/* 36 */            return (objMo4167c == null ? 0 : objMo4167c.hashCode()) ^ (objMo4167c2 != null ? objMo4167c2.hashCode() : 0);
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                C1951n4.m6864o();
/* 19 */                return null;
                    }
/* 11 */            this.f19567b++;
/* 13 */            this.f19568c = true;
/* 15 */            return this;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.f19568c) {
/* 28 */                f42.m3664t();
/* 31 */                return;
                    }
/* 9 */             this.f19569d.mo4173i(this.f19567b);
/* 16 */            this.f19567b--;
/* 22 */            this.f19566a--;
/* 25 */            this.f19568c = false;
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             if (this.f19568c) {
/* 9 */                 return this.f19569d.mo4174j(this.f19567b, obj);
                    }
/* 16 */            f42.m3656l("This container does not support retaining Map.Entry objects");
/* 19 */            return null;
                }

                public final String toString() {
/* 25 */            return getKey() + "=" + getValue();
                }
            }
