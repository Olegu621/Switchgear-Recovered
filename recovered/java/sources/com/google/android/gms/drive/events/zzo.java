            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.zzu;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzo extends zzu implements DriveEvent {
                public static final Parcelable.Creator<zzo> CREATOR = new cl3(21);

                /* JADX INFO: renamed from: a */
                public final DataHolder f3670a;

                /* JADX INFO: renamed from: b */
                public final boolean f3671b;

                /* JADX INFO: renamed from: c */
                public final int f3672c;

                public zzo(DataHolder dataHolder, boolean z, int i) {
/* 4 */             this.f3670a = dataHolder;
/* 6 */             this.f3671b = z;
/* 8 */             this.f3672c = i;
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 3;
                }

                @Override // com.google.android.gms.drive.zzu
                public final void zza(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3670a, i, false);
/* 16 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(this.f3671b ? 1 : 0);
/* 24 */            w11.m9420b0(parcel, 4, 4);
/* 29 */            parcel.writeInt(this.f3672c);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
