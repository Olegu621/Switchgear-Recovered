            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.dr3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 2 */     public final class zzr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(0);

                /* JADX INFO: renamed from: U */
                public final long f4234U;

                /* JADX INFO: renamed from: V */
                public final String f4235V;

                /* JADX INFO: renamed from: W */
                public final long f4236W;

                /* JADX INFO: renamed from: X */
                public final int f4237X;

                /* JADX INFO: renamed from: Y */
                public final boolean f4238Y;

                /* JADX INFO: renamed from: Z */
                public final boolean f4239Z;

                /* JADX INFO: renamed from: a */
                public final String f4240a;

                /* JADX INFO: renamed from: a0 */
                public final Boolean f4241a0;

                /* JADX INFO: renamed from: b */
                public final String f4242b;

                /* JADX INFO: renamed from: b0 */
                public final long f4243b0;

                /* JADX INFO: renamed from: c */
                public final String f4244c;

                /* JADX INFO: renamed from: c0 */
                public final List f4245c0;

                /* JADX INFO: renamed from: d */
                public final String f4246d;

                /* JADX INFO: renamed from: d0 */
                public final String f4247d0;

                /* JADX INFO: renamed from: e */
                public final long f4248e;

                /* JADX INFO: renamed from: e0 */
                public final String f4249e0;

                /* JADX INFO: renamed from: f */
                public final long f4250f;

                /* JADX INFO: renamed from: f0 */
                public final String f4251f0;

                /* JADX INFO: renamed from: g0 */
                public final boolean f4252g0;

                /* JADX INFO: renamed from: h0 */
                public final long f4253h0;

                /* JADX INFO: renamed from: i */
                public final String f4254i;

                /* JADX INFO: renamed from: i0 */
                public final int f4255i0;

                /* JADX INFO: renamed from: j0 */
                public final String f4256j0;

                /* JADX INFO: renamed from: k0 */
                public final int f4257k0;

                /* JADX INFO: renamed from: l0 */
                public final long f4258l0;

                /* JADX INFO: renamed from: m0 */
                public final String f4259m0;

                /* JADX INFO: renamed from: n0 */
                public final String f4260n0;

                /* JADX INFO: renamed from: o0 */
                public final long f4261o0;

                /* JADX INFO: renamed from: p0 */
                public final int f4262p0;

                /* JADX INFO: renamed from: v */
                public final boolean f4263v;

                /* JADX INFO: renamed from: w */
                public final boolean f4264w;

                public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
/* 2 */             kb1.m6058k(str);
                    this.f4240a = str;
/* 3 */             this.f4242b = true == TextUtils.isEmpty(str2) ? null : str2;
                    this.f4244c = str3;
                    this.f4234U = j;
                    this.f4246d = str4;
                    this.f4248e = j2;
                    this.f4250f = j3;
                    this.f4254i = str5;
                    this.f4263v = z;
                    this.f4264w = z2;
                    this.f4235V = str6;
                    this.f4236W = j4;
                    this.f4237X = i;
                    this.f4238Y = z3;
                    this.f4239Z = z4;
                    this.f4241a0 = bool;
                    this.f4243b0 = j5;
                    this.f4245c0 = list;
                    this.f4247d0 = str7;
                    this.f4249e0 = str8;
                    this.f4251f0 = str9;
                    this.f4252g0 = z5;
                    this.f4253h0 = j6;
                    this.f4255i0 = i2;
                    this.f4256j0 = str10;
                    this.f4257k0 = i3;
                    this.f4258l0 = j7;
                    this.f4259m0 = str11;
                    this.f4260n0 = str12;
                    this.f4261o0 = j8;
                    this.f4262p0 = i4;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f4240a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f4242b, false);
/* 23 */            w11.m9410T(parcel, 4, this.f4244c, false);
/* 29 */            w11.m9410T(parcel, 5, this.f4246d, false);
/* 35 */            w11.m9420b0(parcel, 6, 8);
/* 40 */            parcel.writeLong(this.f4248e);
/* 44 */            w11.m9420b0(parcel, 7, 8);
/* 49 */            parcel.writeLong(this.f4250f);
/* 54 */            w11.m9410T(parcel, 8, this.f4254i, false);
/* 59 */            w11.m9420b0(parcel, 9, 4);
/* 64 */            parcel.writeInt(this.f4263v ? 1 : 0);
/* 69 */            w11.m9420b0(parcel, 10, 4);
/* 74 */            parcel.writeInt(this.f4264w ? 1 : 0);
/* 79 */            w11.m9420b0(parcel, 11, 8);
/* 84 */            parcel.writeLong(this.f4234U);
/* 91 */            w11.m9410T(parcel, 12, this.f4235V, false);
/* 96 */            w11.m9420b0(parcel, 14, 8);
/* 101 */           parcel.writeLong(this.f4236W);
/* 106 */           w11.m9420b0(parcel, 15, 4);
/* 111 */           parcel.writeInt(this.f4237X);
/* 116 */           w11.m9420b0(parcel, 16, 4);
/* 121 */           parcel.writeInt(this.f4238Y ? 1 : 0);
/* 126 */           w11.m9420b0(parcel, 18, 4);
/* 131 */           parcel.writeInt(this.f4239Z ? 1 : 0);
/* 138 */           w11.m9401K(parcel, 21, this.f4241a0);
/* 143 */           w11.m9420b0(parcel, 22, 8);
/* 148 */           parcel.writeLong(this.f4243b0);
/* 155 */           w11.m9412V(parcel, this.f4245c0, 23);
/* 162 */           w11.m9410T(parcel, 25, this.f4247d0, false);
/* 169 */           w11.m9410T(parcel, 26, this.f4249e0, false);
/* 176 */           w11.m9410T(parcel, 27, this.f4251f0, false);
/* 181 */           w11.m9420b0(parcel, 28, 4);
/* 186 */           parcel.writeInt(this.f4252g0 ? 1 : 0);
/* 191 */           w11.m9420b0(parcel, 29, 8);
/* 196 */           parcel.writeLong(this.f4253h0);
/* 201 */           w11.m9420b0(parcel, 30, 4);
/* 206 */           parcel.writeInt(this.f4255i0);
/* 213 */           w11.m9410T(parcel, 31, this.f4256j0, false);
/* 218 */           w11.m9420b0(parcel, 32, 4);
/* 223 */           parcel.writeInt(this.f4257k0);
/* 228 */           w11.m9420b0(parcel, 34, 8);
/* 233 */           parcel.writeLong(this.f4258l0);
/* 240 */           w11.m9410T(parcel, 35, this.f4259m0, false);
/* 247 */           w11.m9410T(parcel, 36, this.f4260n0, false);
/* 252 */           w11.m9420b0(parcel, 37, 8);
/* 257 */           parcel.writeLong(this.f4261o0);
/* 262 */           w11.m9420b0(parcel, 38, 4);
/* 267 */           parcel.writeInt(this.f4262p0);
/* 270 */           w11.m9428f0(iM9422c0, parcel);
                }

/* 3 */         public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
/* 5 */             this.f4240a = str;
                    this.f4242b = str2;
                    this.f4244c = str3;
                    this.f4234U = j3;
                    this.f4246d = str4;
                    this.f4248e = j;
                    this.f4250f = j2;
                    this.f4254i = str5;
                    this.f4263v = z;
                    this.f4264w = z2;
                    this.f4235V = str6;
                    this.f4236W = j4;
                    this.f4237X = i;
                    this.f4238Y = z3;
                    this.f4239Z = z4;
                    this.f4241a0 = bool;
                    this.f4243b0 = j5;
                    this.f4245c0 = arrayList;
                    this.f4247d0 = str7;
                    this.f4249e0 = str8;
                    this.f4251f0 = str9;
                    this.f4252g0 = z5;
                    this.f4253h0 = j6;
                    this.f4255i0 = i2;
                    this.f4256j0 = str10;
                    this.f4257k0 = i3;
                    this.f4258l0 = j7;
                    this.f4259m0 = str11;
                    this.f4260n0 = str12;
                    this.f4261o0 = j8;
                    this.f4262p0 = i4;
                }
            }
