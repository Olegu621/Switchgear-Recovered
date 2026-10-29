            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.List;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class TelemetryData extends AbstractSafeParcelable {
                public static final Parcelable.Creator<TelemetryData> CREATOR = new qd3(19);

                /* JADX INFO: renamed from: a */
                public final int f3519a;

                /* JADX INFO: renamed from: b */
                public List f3520b;

                public TelemetryData(int i, List list) {
/* 4 */             this.f3519a = i;
/* 6 */             this.f3520b = list;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3519a);
/* 21 */            w11.m9414X(parcel, 2, this.f3520b, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
