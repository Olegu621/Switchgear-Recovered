            package com.google.android.gms.internal.measurement;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaj implements Iterator {
                final /* synthetic */ Iterator zza;

                public zzaj(Iterator it) {
/* 1 */             this.zza = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zza.hasNext();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 11 */            return new zzas((String) this.zza.next());
                }
            }
