            package com.google.android.gms.internal.location;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbq<E> extends zzbo<E> {
                private final zzbs<E> zza;

                public zzbq(zzbs<E> zzbsVar, int i) {
/* 5 */             super(zzbsVar.size(), i);
/* 8 */             this.zza = zzbsVar;
                }

                @Override // com.google.android.gms.internal.location.zzbo
                public final E zza(int i) {
/* 3 */             return this.zza.get(i);
                }
            }
