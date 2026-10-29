            package com.google.android.gms.common;

            import android.content.Context;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import p000.cl3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzp> CREATOR = new cl3(25);

                /* JADX INFO: renamed from: a */
                public final String f3615a;

                /* JADX INFO: renamed from: b */
                public final boolean f3616b;

                /* JADX INFO: renamed from: c */
                public final boolean f3617c;

                /* JADX INFO: renamed from: d */
                public final Context f3618d;

                /* JADX INFO: renamed from: e */
                public final boolean f3619e;

                /* JADX INFO: renamed from: f */
                public final boolean f3620f;

                /* JADX INFO: renamed from: i */
                public final boolean f3621i;

                public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
/* 4 */             this.f3615a = str;
/* 6 */             this.f3616b = z;
/* 8 */             this.f3617c = z2;
/* 20 */            this.f3618d = (Context) ObjectWrapper.m2045b(IObjectWrapper.Stub.m2044a(iBinder));
/* 22 */            this.f3619e = z3;
/* 24 */            this.f3620f = z4;
/* 26 */            this.f3621i = z5;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3615a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3616b ? 1 : 0);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3617c ? 1 : 0);
/* 40 */            w11.m9405O(parcel, 4, new ObjectWrapper(this.f3618d));
/* 44 */            w11.m9420b0(parcel, 5, 4);
/* 49 */            parcel.writeInt(this.f3619e ? 1 : 0);
/* 53 */            w11.m9420b0(parcel, 6, 4);
/* 58 */            parcel.writeInt(this.f3620f ? 1 : 0);
/* 63 */            w11.m9420b0(parcel, 8, 4);
/* 68 */            parcel.writeInt(this.f3621i ? 1 : 0);
/* 71 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
