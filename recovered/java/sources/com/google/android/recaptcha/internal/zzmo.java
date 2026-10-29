            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzmo implements Iterator {
                boolean zza = true;
                final /* synthetic */ Iterator zzb;

                public zzmo(zzmp zzmpVar, Iterator it) {
/* 1 */             this.zzb = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return this.zzb.hasNext();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 3 */             Object next = this.zzb.next();
/* 8 */             this.zza = false;
/* 10 */            return next;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 7 */             zzmd.zze(!this.zza, "no calls to next() since the last call to remove()");
/* 12 */            this.zzb.remove();
                }
            }
