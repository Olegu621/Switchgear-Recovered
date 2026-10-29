            package com.google.android.gms.common.server;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new qd3(18);

                /* JADX INFO: renamed from: a */
                public final int f3562a;

                /* JADX INFO: renamed from: b */
                public final String f3563b;

                /* JADX INFO: renamed from: c */
                public final int f3564c;

                public FavaDiagnosticsEntity(int i, String str, int i2) {
/* 4 */             this.f3562a = i;
/* 6 */             this.f3563b = str;
/* 8 */             this.f3564c = i2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3562a);
/* 21 */            w11.m9410T(parcel, 2, this.f3563b, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3564c);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
