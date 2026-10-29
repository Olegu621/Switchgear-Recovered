            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfv extends com.google.android.gms.drive.zzu {
                public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
                final DataHolder zzij;

                public zzfv(DataHolder dataHolder) {
/* 4 */             this.zzij = dataHolder;
                }

                @Override // com.google.android.gms.drive.zzu
                public final void zza(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzij, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final DataHolder zzav() {
/* 1 */             return this.zzij;
                }
            }
