            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.List;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzem extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzem> CREATOR = new zzen();
                private final int responseCode;
                private final List<com.google.android.gms.drive.zzr> zzhb;

                public zzem(List<com.google.android.gms.drive.zzr> list, int i) {
/* 4 */             this.zzhb = list;
/* 6 */             this.responseCode = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 2, this.zzhb, false);
/* 14 */            int i2 = this.responseCode;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(i2);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
