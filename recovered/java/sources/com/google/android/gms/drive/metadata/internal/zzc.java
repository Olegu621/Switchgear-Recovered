            package com.google.android.gms.drive.metadata.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.metadata.CustomPropertyKey;
            import java.util.Arrays;
            import p000.de3;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzc> CREATOR = new re3(29);

                /* JADX INFO: renamed from: a */
                public final CustomPropertyKey f3685a;

                /* JADX INFO: renamed from: b */
                public final String f3686b;

                public zzc(CustomPropertyKey customPropertyKey, String str) {
/* 6 */             kb1.m6062o(customPropertyKey, "key");
/* 9 */             this.f3685a = customPropertyKey;
/* 11 */            this.f3686b = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && obj.getClass() == zzc.class) {
/* 17 */                zzc zzcVar = (zzc) obj;
/* 27 */                if (de3.m3029k(this.f3685a, zzcVar.f3685a) && de3.m3029k(this.f3686b, zzcVar.f3686b)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 9 */             return Arrays.hashCode(new Object[]{this.f3685a, this.f3686b});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3685a, i, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3686b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
