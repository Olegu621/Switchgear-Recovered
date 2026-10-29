            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.Contents;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfh extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzfh> CREATOR = new zzfi();
                final Contents zzes;
                final boolean zzhv;

                public zzfh(Contents contents, boolean z) {
/* 4 */             this.zzes = contents;
/* 6 */             this.zzhv = z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzes, i, false);
/* 14 */            boolean z = this.zzhv;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(z ? 1 : 0);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final Contents zzar() {
/* 1 */             return this.zzes;
                }
            }
