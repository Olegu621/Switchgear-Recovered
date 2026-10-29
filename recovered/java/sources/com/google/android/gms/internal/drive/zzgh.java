            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgh extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgh> CREATOR = new zzgi();
                private final boolean zzea;

                public zzgh(boolean z) {
/* 4 */             this.zzea = z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             boolean z = this.zzea;
/* 11 */            w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(z ? 1 : 0);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
