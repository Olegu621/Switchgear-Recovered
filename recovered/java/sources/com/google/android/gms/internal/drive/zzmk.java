            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    final class zzmk implements Iterator {
                private int pos;
                private Iterator zzvj;
                private final /* synthetic */ zzmi zzvk;

                private zzmk(zzmi zzmiVar) {
/* 1 */             this.zzvk = zzmiVar;
/* 14 */            this.pos = zzmiVar.zzve.size();
                }

                private final Iterator zzew() {
/* 3 */             if (this.zzvj == null) {
/* 19 */                this.zzvj = this.zzvk.zzvh.entrySet().iterator();
                    }
/* 21 */            return this.zzvj;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             int i = this.pos;
                    return (i > 0 && i <= this.zzvk.zzve.size()) || zzew().hasNext();
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
/* 9 */             if (zzew().hasNext()) {
/* 19 */                return (Map.Entry) zzew().next();
                    }
/* 1 */             List list = this.zzvk.zzve;
/* 30 */            int i = this.pos - 1;
/* 32 */            this.pos = i;
/* 38 */            return (Map.Entry) list.get(i);
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }

/* 16 */        public /* synthetic */ zzmk(zzmi zzmiVar, zzmj zzmjVar) {
/* 17 */            this(zzmiVar);
                }
            }
