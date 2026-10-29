            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.List;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgd extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzgd> CREATOR = new zzge();
                private final List<String> zzim;

                public zzgd(List<String> list) {
/* 4 */             this.zzim = list;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9412V(parcel, this.zzim, 2);
/* 13 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
