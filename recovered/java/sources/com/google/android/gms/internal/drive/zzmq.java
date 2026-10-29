            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     final class zzmq implements Iterator {
                private int pos;
                private Iterator zzvj;
                private final /* synthetic */ zzmi zzvk;
                private boolean zzvo;

                private zzmq(zzmi zzmiVar) {
/* 1 */             this.zzvk = zzmiVar;
/* 7 */             this.pos = -1;
                }

                private final Iterator zzew() {
/* 3 */             if (this.zzvj == null) {
/* 19 */                this.zzvj = this.zzvk.zzvf.entrySet().iterator();
                    }
/* 21 */            return this.zzvj;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.pos + 1 < this.zzvk.zzve.size() || (!this.zzvk.zzvf.isEmpty() && zzew().hasNext());
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
/* 2 */             this.zzvo = true;
/* 6 */             int i = this.pos + 1;
/* 7 */             this.pos = i;
                    return i < this.zzvk.zzve.size() ? (Map.Entry) this.zzvk.zzve.get(this.pos) : (Map.Entry) zzew().next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.zzvo) {
/* 49 */                f42.m3656l("remove() was called before next()");
/* 52 */                return;
                    }
/* 6 */             this.zzvo = false;
/* 118 */           this.zzvk.zzeu();
/* 25 */            if (this.pos >= this.zzvk.zzve.size()) {
/* 43 */                zzew().remove();
/* 46 */                return;
                    }
/* 27 */            zzmi zzmiVar = this.zzvk;
/* 29 */            int i = this.pos;
/* 33 */            this.pos = i - 1;
/* 119 */           zzmiVar.zzax(i);
                }

/* 9 */         public /* synthetic */ zzmq(zzmi zzmiVar, zzmj zzmjVar) {
/* 10 */            this(zzmiVar);
                }
            }
