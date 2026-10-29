            package com.google.android.gms.internal.play_billing;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcb extends zzce {
                private static final zzcb zzb = new zzcb();

                private zzcb() {
/* 3 */             super(HttpUrl.FRAGMENT_ENCODE_SET);
                }

                @Override // com.google.android.gms.internal.play_billing.zzce
                public final int hashCode() {
/* 1 */             return System.identityHashCode(this);
                }

                public final String toString() {
/* 1 */             return "+∞";
                }

                @Override // com.google.android.gms.internal.play_billing.zzce, java.lang.Comparable
                /* JADX INFO: renamed from: zza */
                public final int compareTo(zzce zzceVar) {
                    return zzceVar == this ? 0 : 1;
                }

                @Override // com.google.android.gms.internal.play_billing.zzce
                public final void zzc(StringBuilder sb) {
/* 6 */             throw new AssertionError();
                }

                @Override // com.google.android.gms.internal.play_billing.zzce
                public final void zzd(StringBuilder sb) {
/* 3 */             sb.append("+∞)");
                }
            }
