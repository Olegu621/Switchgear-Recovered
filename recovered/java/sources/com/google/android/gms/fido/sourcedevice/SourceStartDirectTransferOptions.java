            package com.google.android.gms.fido.sourcedevice;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SourceStartDirectTransferOptions extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<SourceStartDirectTransferOptions> CREATOR = new md3(14);

                /* JADX INFO: renamed from: a */
                public int f3859a;

                /* JADX INFO: renamed from: b */
                public boolean f3860b;

                /* JADX INFO: renamed from: c */
                public ArrayList f3861c;

                /* JADX INFO: renamed from: d */
                public boolean f3862d;

                /* JADX INFO: renamed from: e */
                public String f3863e;

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f3859a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            boolean z = this.f3860b;
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(z ? 1 : 0);
/* 30 */            w11.m9414X(parcel, 3, this.f3861c, false);
/* 33 */            boolean z2 = this.f3862d;
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 38 */            parcel.writeInt(z2 ? 1 : 0);
/* 44 */            w11.m9410T(parcel, 5, this.f3863e, false);
/* 47 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
