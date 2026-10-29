            package p000;

            import java.util.Collection;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: renamed from: id */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public final class C1024id extends le2 implements Map {

                /* JADX INFO: renamed from: v */
                public C0987hd f9550v;

                public C1024id(le2 le2Var) {
/* 4 */             int i = le2Var.f13213c;
/* 6 */             m6423b(i);
/* 12 */            if (this.f13213c != 0) {
/* 35 */                for (int i2 = 0; i2 < i; i2++) {
/* 45 */                    put(le2Var.m6428h(i2), le2Var.m6430j(i2));
                        }
                    } else if (i > 0) {
/* 20 */                System.arraycopy(le2Var.f13211a, 0, this.f13211a, 0, i);
/* 29 */                System.arraycopy(le2Var.f13212b, 0, this.f13212b, 0, i << 1);
/* 32 */                this.f13213c = i;
                    }
                }

                @Override // java.util.Map
                public final Set entrySet() {
/* 3 */             int i = 0;
/* 4 */             if (this.f9550v == null) {
/* 11 */                this.f9550v = new C0987hd(this, i);
                    }
/* 13 */            C0987hd c0987hd = this.f9550v;
/* 19 */            if (((xb1) c0987hd.f13033a) == null) {
/* 26 */                c0987hd.f13033a = new xb1(c0987hd, i);
                    }
/* 30 */            return (xb1) c0987hd.f13033a;
                }

                @Override // java.util.Map
                public final Set keySet() {
/* 3 */             if (this.f9550v == null) {
/* 11 */                this.f9550v = new C0987hd(this, 0);
                    }
/* 13 */            C0987hd c0987hd = this.f9550v;
/* 19 */            if (((xb1) c0987hd.f13034b) == null) {
/* 27 */                c0987hd.f13034b = new xb1(c0987hd, 1);
                    }
/* 31 */            return (xb1) c0987hd.f13034b;
                }

                @Override // java.util.Map
                public final void putAll(Map map) {
/* 8 */             m6423b(map.size() + this.f13213c);
/* 23 */            for (Map.Entry entry : map.entrySet()) {
/* 39 */                put(entry.getKey(), entry.getValue());
                    }
                }

                @Override // java.util.Map
                public final Collection values() {
/* 3 */             if (this.f9550v == null) {
/* 11 */                this.f9550v = new C0987hd(this, 0);
                    }
/* 13 */            C0987hd c0987hd = this.f9550v;
/* 19 */            if (((zb1) c0987hd.f13035c) == null) {
/* 26 */                c0987hd.f13035c = new zb1(c0987hd);
                    }
/* 30 */            return (zb1) c0987hd.f13035c;
                }

/* 51 */        public C1024id() {
                }
            }
