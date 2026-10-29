            package com.google.android.gms.common.server.converter;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zac extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zac> CREATOR = new qd3(28);

                /* JADX INFO: renamed from: a */
                public final int f3570a;

                /* JADX INFO: renamed from: b */
                public final String f3571b;

                /* JADX INFO: renamed from: c */
                public final int f3572c;

                public zac(String str, int i) {
/* 5 */             this.f3570a = 1;
/* 7 */             this.f3571b = str;
/* 9 */             this.f3572c = i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3570a);
/* 21 */            w11.m9410T(parcel, 2, this.f3571b, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3572c);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 11 */        public zac(int i, String str, int i2) {
/* 13 */            this.f3570a = i;
                    this.f3571b = str;
                    this.f3572c = i2;
                }
            }
