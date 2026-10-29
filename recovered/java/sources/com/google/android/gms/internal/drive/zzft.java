            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzft extends com.google.android.gms.drive.zzu {
                public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
                final boolean zzea;
                final DataHolder zzii;

                public zzft(DataHolder dataHolder, boolean z) {
/* 4 */             this.zzii = dataHolder;
/* 6 */             this.zzea = z;
                }

                @Override // com.google.android.gms.drive.zzu
                public final void zza(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzii, i, false);
/* 14 */            boolean z = this.zzea;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(z ? 1 : 0);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final DataHolder zzau() {
/* 1 */             return this.zzii;
                }
            }
