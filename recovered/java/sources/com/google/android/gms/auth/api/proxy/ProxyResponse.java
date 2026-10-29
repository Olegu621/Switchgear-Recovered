            package com.google.android.gms.auth.api.proxy;

            import android.app.PendingIntent;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProxyResponse extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ProxyResponse> CREATOR = new md3(23);

                /* JADX INFO: renamed from: a */
                public final int f3360a;

                /* JADX INFO: renamed from: b */
                public final PendingIntent f3361b;

                /* JADX INFO: renamed from: c */
                public final int f3362c;

                /* JADX INFO: renamed from: d */
                public final byte[] f3363d;

                /* JADX INFO: renamed from: e */
                public final int f3364e;

                /* JADX INFO: renamed from: f */
                public final Bundle f3365f;

                public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
/* 4 */             this.f3364e = i;
/* 6 */             this.f3360a = i2;
/* 8 */             this.f3362c = i3;
/* 10 */            this.f3365f = bundle;
/* 12 */            this.f3363d = bArr;
/* 14 */            this.f3361b = pendingIntent;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3360a);
/* 21 */            w11.m9409S(parcel, 2, this.f3361b, i, false);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3362c);
/* 35 */            w11.m9402L(parcel, 4, this.f3365f, false);
/* 41 */            w11.m9403M(parcel, 5, this.f3363d, false);
/* 46 */            w11.m9420b0(parcel, 1000, 4);
/* 51 */            parcel.writeInt(this.f3364e);
/* 54 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
