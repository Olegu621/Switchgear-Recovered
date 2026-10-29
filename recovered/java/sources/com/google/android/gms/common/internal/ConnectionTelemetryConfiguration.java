            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new cl3(3);

                /* JADX INFO: renamed from: a */
                public final RootTelemetryConfiguration f3480a;

                /* JADX INFO: renamed from: b */
                public final boolean f3481b;

                /* JADX INFO: renamed from: c */
                public final boolean f3482c;

                /* JADX INFO: renamed from: d */
                public final int[] f3483d;

                /* JADX INFO: renamed from: e */
                public final int f3484e;

                /* JADX INFO: renamed from: f */
                public final int[] f3485f;

                public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
/* 4 */             this.f3480a = rootTelemetryConfiguration;
/* 6 */             this.f3481b = z;
/* 8 */             this.f3482c = z2;
/* 10 */            this.f3483d = iArr;
/* 12 */            this.f3484e = i;
/* 14 */            this.f3485f = iArr2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3480a, i, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3481b ? 1 : 0);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3482c ? 1 : 0);
/* 35 */            w11.m9406P(parcel, 4, this.f3483d, false);
/* 39 */            w11.m9420b0(parcel, 5, 4);
/* 44 */            parcel.writeInt(this.f3484e);
/* 50 */            w11.m9406P(parcel, 6, this.f3485f, false);
/* 53 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
