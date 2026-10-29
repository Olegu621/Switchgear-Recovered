            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzr> CREATOR = new zzs();
                private final int mode;

                public zzr(int i) {
/* 18 */            kb1.m6053f("Cannot create a new read-only contents!", i == 536870912 || i == 805306368);
/* 21 */            this.mode = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.mode;
/* 11 */            w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
