            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class RootTelemetryConfiguration extends AbstractSafeParcelable {
                public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new tc3(23);

                /* JADX INFO: renamed from: a */
                public final int f3514a;

                /* JADX INFO: renamed from: b */
                public final boolean f3515b;

                /* JADX INFO: renamed from: c */
                public final boolean f3516c;

                /* JADX INFO: renamed from: d */
                public final int f3517d;

                /* JADX INFO: renamed from: e */
                public final int f3518e;

                public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
/* 4 */             this.f3514a = i;
/* 6 */             this.f3515b = z;
/* 8 */             this.f3516c = z2;
/* 10 */            this.f3517d = i2;
/* 12 */            this.f3518e = i3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3514a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3515b ? 1 : 0);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f3516c ? 1 : 0);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f3517d);
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f3518e);
/* 52 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
