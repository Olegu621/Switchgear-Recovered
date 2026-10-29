            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcy implements zzdf {
                private final Iterator zza;
                private boolean zzb;
                private Object zzc;

                public zzcy(Iterator it) {
/* 4 */             it.getClass();
/* 7 */             this.zza = it;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.zzb || this.zza.hasNext();
                }

                @Override // com.google.android.gms.internal.play_billing.zzdf, java.util.Iterator
                public final Object next() {
/* 3 */             if (!this.zzb) {
/* 7 */                 return this.zza.next();
                    }
/* 12 */            Object obj = this.zzc;
/* 15 */            this.zzb = false;
/* 18 */            this.zzc = null;
/* 20 */            return obj;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (this.zzb) {
/* 13 */                f42.m3656l("Can't remove after you've peeked at next");
                    } else {
/* 7 */                 this.zza.remove();
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzdf
                public final Object zza() {
/* 3 */             if (!this.zzb) {
/* 11 */                this.zzc = this.zza.next();
/* 14 */                this.zzb = true;
                    }
/* 16 */            return this.zzc;
                }
            }
