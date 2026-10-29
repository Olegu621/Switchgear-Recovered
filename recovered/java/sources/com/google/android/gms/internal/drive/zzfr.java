            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();
                private final ParcelFileDescriptor zzih;

                public zzfr(ParcelFileDescriptor parcelFileDescriptor) {
/* 4 */             this.zzih = parcelFileDescriptor;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9409S(parcel, 2, this.zzih, i | 1, false);
/* 16 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
