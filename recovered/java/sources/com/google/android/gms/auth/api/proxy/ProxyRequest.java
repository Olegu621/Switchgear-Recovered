            package com.google.android.gms.auth.api.proxy;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ProxyRequest> CREATOR = new tc3(13);

                /* JADX INFO: renamed from: a */
                public final String f3354a;

                /* JADX INFO: renamed from: b */
                public final int f3355b;

                /* JADX INFO: renamed from: c */
                public final long f3356c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3357d;

                /* JADX INFO: renamed from: e */
                public final int f3358e;

                /* JADX INFO: renamed from: f */
                public final Bundle f3359f;

                public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
/* 4 */             this.f3358e = i;
/* 6 */             this.f3354a = str;
/* 8 */             this.f3355b = i2;
/* 10 */            this.f3356c = j;
/* 12 */            this.f3357d = bArr;
/* 14 */            this.f3359f = bundle;
                }

                public final String toString() {
/* 28 */            return "ProxyRequest[ url: " + this.f3354a + ", method: " + this.f3355b + " ]";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3354a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3355b);
/* 27 */            w11.m9420b0(parcel, 3, 8);
/* 32 */            parcel.writeLong(this.f3356c);
/* 37 */            w11.m9403M(parcel, 4, this.f3357d, false);
/* 43 */            w11.m9402L(parcel, 5, this.f3359f, false);
/* 48 */            w11.m9420b0(parcel, 1000, 4);
/* 53 */            parcel.writeInt(this.f3358e);
/* 56 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
