            package com.google.android.gms.internal.auth;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhc implements Iterator {
                final Iterator zza;
                final /* synthetic */ zzhd zzb;

                public zzhc(zzhd zzhdVar) {
/* 1 */             this.zzb = zzhdVar;
/* 14 */            this.zza = zzhdVar.zza.iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zza.hasNext();
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 7 */             return (String) this.zza.next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
