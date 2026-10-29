            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkw<K> implements Iterator<Map.Entry<K, Object>> {
                private Iterator<Map.Entry<K, Object>> zztg;

                public zzkw(Iterator<Map.Entry<K, Object>> it) {
/* 4 */             this.zztg = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zztg.hasNext();
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
/* 3 */             Map.Entry<K, Object> next = this.zztg.next();
                    return next.getValue() instanceof zzkt ? new zzkv(next) : next;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             this.zztg.remove();
                }
            }
