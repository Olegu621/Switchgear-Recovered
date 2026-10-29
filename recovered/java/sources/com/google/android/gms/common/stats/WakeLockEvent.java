            package com.google.android.gms.common.stats;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import okhttp3.HttpUrl;
            import p000.fm0;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class WakeLockEvent extends StatsEvent {
                public static final Parcelable.Creator<WakeLockEvent> CREATOR = new tc3(16);

                /* JADX INFO: renamed from: U */
                public final long f3600U;

                /* JADX INFO: renamed from: V */
                public final int f3601V;

                /* JADX INFO: renamed from: W */
                public final String f3602W;

                /* JADX INFO: renamed from: X */
                public final float f3603X;

                /* JADX INFO: renamed from: Y */
                public final long f3604Y;

                /* JADX INFO: renamed from: Z */
                public final boolean f3605Z;

                /* JADX INFO: renamed from: a */
                public final int f3606a;

                /* JADX INFO: renamed from: b */
                public final long f3607b;

                /* JADX INFO: renamed from: c */
                public final int f3608c;

                /* JADX INFO: renamed from: d */
                public final String f3609d;

                /* JADX INFO: renamed from: e */
                public final String f3610e;

                /* JADX INFO: renamed from: f */
                public final String f3611f;

                /* JADX INFO: renamed from: i */
                public final int f3612i;

                /* JADX INFO: renamed from: v */
                public final List f3613v;

                /* JADX INFO: renamed from: w */
                public final String f3614w;

                public WakeLockEvent(int i, long j, int i2, String str, int i3, ArrayList arrayList, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
/* 4 */             this.f3606a = i;
/* 6 */             this.f3607b = j;
/* 8 */             this.f3608c = i2;
/* 10 */            this.f3609d = str;
/* 12 */            this.f3610e = str3;
/* 16 */            this.f3611f = str5;
/* 18 */            this.f3612i = i3;
/* 20 */            this.f3613v = arrayList;
/* 22 */            this.f3614w = str2;
/* 24 */            this.f3600U = j2;
/* 26 */            this.f3601V = i4;
/* 28 */            this.f3602W = str4;
/* 30 */            this.f3603X = f;
/* 33 */            this.f3604Y = j3;
/* 37 */            this.f3605Z = z;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3606a);
/* 20 */            w11.m9420b0(parcel, 2, 8);
/* 25 */            parcel.writeLong(this.f3607b);
/* 31 */            w11.m9410T(parcel, 4, this.f3609d, false);
/* 35 */            w11.m9420b0(parcel, 5, 4);
/* 40 */            parcel.writeInt(this.f3612i);
/* 46 */            w11.m9412V(parcel, this.f3613v, 6);
/* 49 */            w11.m9420b0(parcel, 8, 8);
/* 54 */            parcel.writeLong(this.f3600U);
/* 61 */            w11.m9410T(parcel, 10, this.f3610e, false);
/* 66 */            w11.m9420b0(parcel, 11, 4);
/* 71 */            parcel.writeInt(this.f3608c);
/* 78 */            w11.m9410T(parcel, 12, this.f3614w, false);
/* 85 */            w11.m9410T(parcel, 13, this.f3602W, false);
/* 90 */            w11.m9420b0(parcel, 14, 4);
/* 95 */            parcel.writeInt(this.f3601V);
/* 100 */           w11.m9420b0(parcel, 15, 4);
/* 105 */           parcel.writeFloat(this.f3603X);
/* 110 */           w11.m9420b0(parcel, 16, 8);
/* 115 */           parcel.writeLong(this.f3604Y);
/* 122 */           w11.m9410T(parcel, 17, this.f3611f, false);
/* 127 */           w11.m9420b0(parcel, 18, 4);
/* 132 */           parcel.writeInt(this.f3605Z ? 1 : 0);
/* 135 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.common.stats.StatsEvent
                public final long zza() {
/* 1 */             return this.f3607b;
                }

                @Override // com.google.android.gms.common.stats.StatsEvent
                public final int zzb() {
/* 1 */             return this.f3608c;
                }

                @Override // com.google.android.gms.common.stats.StatsEvent
                public final String zzc() {
/* 1 */             String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             List list = this.f3613v;
/* 11 */            String strJoin = list == null ? HttpUrl.FRAGMENT_ENCODE_SET : TextUtils.join(",", list);
/* 15 */            String str2 = this.f3609d;
/* 21 */            int length = String.valueOf(str2).length();
/* 25 */            int i = this.f3612i;
/* 37 */            int length2 = String.valueOf(i).length() + length + 2;
/* 44 */            int length3 = String.valueOf(strJoin).length();
/* 48 */            int i2 = this.f3601V;
/* 61 */            int length4 = String.valueOf(i2).length() + length2 + 1 + length3 + 1;
/* 62 */            String str3 = this.f3610e;
/* 64 */            if (str3 == null) {
/* 66 */                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 74 */            int length5 = str3.length() + length4 + 1 + 1;
/* 76 */            String str4 = this.f3602W;
/* 78 */            if (str4 == null) {
/* 80 */                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 86 */            int length6 = str4.length() + length5 + 1;
/* 88 */            float f = this.f3603X;
/* 99 */            int length7 = String.valueOf(f).length() + length6 + 1;
/* 101 */           String str5 = this.f3611f;
/* 103 */           if (str5 != null) {
/* 106 */               str = str5;
                    }
/* 112 */           int length8 = str.length() + length7 + 1;
/* 114 */           boolean z = this.f3605Z;
/* 127 */           StringBuilder sb = new StringBuilder(length8 + String.valueOf(z).length());
/* 132 */           sb.append("\t");
/* 135 */           sb.append(str2);
/* 138 */           sb.append("\t");
/* 141 */           sb.append(i);
/* 144 */           sb.append("\t");
/* 147 */           sb.append(strJoin);
/* 150 */           sb.append("\t");
/* 153 */           sb.append(i2);
/* 156 */           fm0.m3796v(sb, "\t", str3, "\t", str4);
/* 159 */           sb.append("\t");
/* 162 */           sb.append(f);
/* 165 */           sb.append("\t");
/* 168 */           sb.append(str);
/* 171 */           sb.append("\t");
/* 174 */           sb.append(z);
/* 177 */           return sb.toString();
                }
            }
