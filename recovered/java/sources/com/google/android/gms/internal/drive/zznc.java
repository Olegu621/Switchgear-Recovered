            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznc implements Iterator<String> {
                private final /* synthetic */ zzna zzvw;
                private Iterator<String> zzvx;

                public zznc(zzna zznaVar) {
/* 1 */             this.zzvw = zznaVar;
/* 14 */            this.zzvx = zznaVar.zzvt.iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zzvx.hasNext();
                }

                @Override // java.util.Iterator
                public final /* synthetic */ String next() {
/* 3 */             return this.zzvx.next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
