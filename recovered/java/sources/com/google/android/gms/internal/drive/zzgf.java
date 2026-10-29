            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgf> CREATOR = new zzgg();
                private final ParcelFileDescriptor zzin;
                private final IBinder zzio;
                private final String zzm;

                public zzgf(ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
/* 4 */             this.zzin = parcelFileDescriptor;
/* 6 */             this.zzio = iBinder;
/* 8 */             this.zzm = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9409S(parcel, 2, this.zzin, i | 1, false);
/* 19 */            w11.m9405O(parcel, 3, this.zzio);
/* 25 */            w11.m9410T(parcel, 4, this.zzm, false);
/* 28 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
