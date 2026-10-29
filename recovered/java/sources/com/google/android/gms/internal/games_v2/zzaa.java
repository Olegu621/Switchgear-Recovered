            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzaa extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
                private final String zza;

                public zzaa(String str) {
/* 4 */             this.zza = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzaa) {
/* 17 */                return de3.m3029k(this.zza, ((zzaa) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.zza});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.zza, "gameRunToken");
/* 13 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.zza, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final String zza() {
/* 1 */             return this.zza;
                }
            }
