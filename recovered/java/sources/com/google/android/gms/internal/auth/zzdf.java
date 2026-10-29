            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdf extends zzdh {
                static final zzdf zza = new zzdf();

                private zzdf() {
                }

                public final boolean equals(Object obj) {
                    return obj == this;
                }

                public final int hashCode() {
/* 1 */             return 2040732332;
                }

                public final String toString() {
/* 1 */             return "Optional.absent()";
                }

                @Override // com.google.android.gms.internal.auth.zzdh
                public final Object zza() {
/* 8 */             throw new IllegalStateException("Optional.get() cannot be called on an absent value");
                }

                @Override // com.google.android.gms.internal.auth.zzdh
                public final boolean zzb() {
/* 1 */             return false;
                }
            }
