            package com.google.android.gms.common.moduleinstall;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.C1951n4;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new qd3(27);

                /* JADX INFO: renamed from: a */
                public final int f3553a;

                /* JADX INFO: renamed from: b */
                public final int f3554b;

                /* JADX INFO: renamed from: c */
                public final Long f3555c;

                /* JADX INFO: renamed from: d */
                public final Long f3556d;

                /* JADX INFO: renamed from: e */
                public final int f3557e;

                public ModuleInstallStatusUpdate(int i, int i2, Long l, Long l2, int i3) {
/* 4 */             this.f3553a = i;
/* 6 */             this.f3554b = i2;
/* 8 */             this.f3555c = l;
/* 10 */            this.f3556d = l2;
/* 12 */            this.f3557e = i3;
/* 14 */            if (l == null || l2 == null || l2.longValue() == 0 || l2.longValue() != 0) {
/* 36 */                return;
                    }
/* 39 */            C1951n4.m6859j("Given Long is zero");
/* 43 */            throw null;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3553a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3554b);
/* 29 */            w11.m9408R(parcel, 3, this.f3555c);
/* 34 */            w11.m9408R(parcel, 4, this.f3556d);
/* 38 */            w11.m9420b0(parcel, 5, 4);
/* 43 */            parcel.writeInt(this.f3557e);
/* 46 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
