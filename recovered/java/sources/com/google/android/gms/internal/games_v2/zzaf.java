            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.de3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
                private final Intent zza;

                public zzaf(Intent intent) {
/* 4 */             this.zza = intent;
                }

                public static zzaf zza(Intent intent) {
/* 3 */             return new zzaf(intent);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzaf) {
/* 17 */                return de3.m3029k(this.zza, ((zzaf) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 1 */             Intent intent = this.zza;
/* 3 */             if (intent != null) {
/* 5 */                 return intent.hashCode();
                    }
/* 10 */            return 0;
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.zza, "resultData");
/* 13 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.zza, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
