            package com.google.android.gms.common.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MethodInvocation extends AbstractSafeParcelable {
                public static final Parcelable.Creator<MethodInvocation> CREATOR = new ub3(6);

                /* JADX INFO: renamed from: a */
                public final int f3505a;

                /* JADX INFO: renamed from: b */
                public final int f3506b;

                /* JADX INFO: renamed from: c */
                public final int f3507c;

                /* JADX INFO: renamed from: d */
                public final long f3508d;

                /* JADX INFO: renamed from: e */
                public final long f3509e;

                /* JADX INFO: renamed from: f */
                public final String f3510f;

                /* JADX INFO: renamed from: i */
                public final String f3511i;

                /* JADX INFO: renamed from: v */
                public final int f3512v;

                /* JADX INFO: renamed from: w */
                public final int f3513w;

                public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
/* 4 */             this.f3505a = i;
/* 6 */             this.f3506b = i2;
/* 8 */             this.f3507c = i3;
/* 10 */            this.f3508d = j;
/* 12 */            this.f3509e = j2;
/* 14 */            this.f3510f = str;
/* 16 */            this.f3511i = str2;
/* 18 */            this.f3512v = i4;
/* 20 */            this.f3513w = i5;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3505a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3506b);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f3507c);
/* 37 */            w11.m9420b0(parcel, 4, 8);
/* 42 */            parcel.writeLong(this.f3508d);
/* 46 */            w11.m9420b0(parcel, 5, 8);
/* 51 */            parcel.writeLong(this.f3509e);
/* 58 */            w11.m9410T(parcel, 6, this.f3510f, false);
/* 64 */            w11.m9410T(parcel, 7, this.f3511i, false);
/* 67 */            w11.m9420b0(parcel, 8, 4);
/* 72 */            parcel.writeInt(this.f3512v);
/* 77 */            w11.m9420b0(parcel, 9, 4);
/* 82 */            parcel.writeInt(this.f3513w);
/* 85 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
