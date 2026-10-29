            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public final class zzah extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzah> CREATOR = new tc3(27);

                /* JADX INFO: renamed from: U */
                public final long f4195U;

                /* JADX INFO: renamed from: V */
                public final zzbg f4196V;

                /* JADX INFO: renamed from: a */
                public String f4197a;

                /* JADX INFO: renamed from: b */
                public String f4198b;

                /* JADX INFO: renamed from: c */
                public zzpk f4199c;

                /* JADX INFO: renamed from: d */
                public long f4200d;

                /* JADX INFO: renamed from: e */
                public boolean f4201e;

                /* JADX INFO: renamed from: f */
                public String f4202f;

                /* JADX INFO: renamed from: i */
                public final zzbg f4203i;

                /* JADX INFO: renamed from: v */
                public long f4204v;

                /* JADX INFO: renamed from: w */
                public zzbg f4205w;

                public zzah(zzah zzahVar) {
/* 4 */             kb1.m6061n(zzahVar);
/* 9 */             this.f4197a = zzahVar.f4197a;
/* 13 */            this.f4198b = zzahVar.f4198b;
/* 17 */            this.f4199c = zzahVar.f4199c;
/* 21 */            this.f4200d = zzahVar.f4200d;
/* 25 */            this.f4201e = zzahVar.f4201e;
/* 29 */            this.f4202f = zzahVar.f4202f;
/* 33 */            this.f4203i = zzahVar.f4203i;
/* 37 */            this.f4204v = zzahVar.f4204v;
/* 41 */            this.f4205w = zzahVar.f4205w;
/* 45 */            this.f4195U = zzahVar.f4195U;
/* 49 */            this.f4196V = zzahVar.f4196V;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f4197a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f4198b, false);
/* 23 */            w11.m9409S(parcel, 4, this.f4199c, i, false);
/* 26 */            long j = this.f4200d;
/* 31 */            w11.m9420b0(parcel, 5, 8);
/* 34 */            parcel.writeLong(j);
/* 37 */            boolean z = this.f4201e;
/* 40 */            w11.m9420b0(parcel, 6, 4);
/* 43 */            parcel.writeInt(z ? 1 : 0);
/* 49 */            w11.m9410T(parcel, 7, this.f4202f, false);
/* 54 */            w11.m9409S(parcel, 8, this.f4203i, i, false);
/* 57 */            long j2 = this.f4204v;
/* 61 */            w11.m9420b0(parcel, 9, 8);
/* 64 */            parcel.writeLong(j2);
/* 71 */            w11.m9409S(parcel, 10, this.f4205w, i, false);
/* 76 */            w11.m9420b0(parcel, 11, 8);
/* 81 */            parcel.writeLong(this.f4195U);
/* 88 */            w11.m9409S(parcel, 12, this.f4196V, i, false);
/* 91 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 51 */        public zzah(String str, String str2, zzpk zzpkVar, long j, boolean z, String str3, zzbg zzbgVar, long j2, zzbg zzbgVar2, long j3, zzbg zzbgVar3) {
/* 53 */            this.f4197a = str;
                    this.f4198b = str2;
                    this.f4199c = zzpkVar;
                    this.f4200d = j;
                    this.f4201e = z;
                    this.f4202f = str3;
                    this.f4203i = zzbgVar;
                    this.f4204v = j2;
                    this.f4205w = zzbgVar2;
                    this.f4195U = j3;
                    this.f4196V = zzbgVar3;
                }
            }
