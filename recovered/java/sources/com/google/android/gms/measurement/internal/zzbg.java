            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.fm0;
            import p000.kb1;
            import p000.re3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final class zzbg extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbg> CREATOR = new re3(1);

                /* JADX INFO: renamed from: a */
                public final String f4208a;

                /* JADX INFO: renamed from: b */
                public final zzbe f4209b;

                /* JADX INFO: renamed from: c */
                public final String f4210c;

                /* JADX INFO: renamed from: d */
                public final long f4211d;

                public zzbg(zzbg zzbgVar, long j) {
/* 4 */             kb1.m6061n(zzbgVar);
/* 9 */             this.f4208a = zzbgVar.f4208a;
/* 13 */            this.f4209b = zzbgVar.f4209b;
/* 17 */            this.f4210c = zzbgVar.f4210c;
/* 19 */            this.f4211d = j;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f4209b);
/* 7 */             String str = this.f4210c;
/* 13 */            int length = String.valueOf(str).length();
/* 17 */            String str2 = this.f4208a;
/* 39 */            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
/* 46 */            fm0.m3796v(sb, "origin=", str, ",name=", str2);
/* 51 */            return fm0.m3789o(sb, ",params=", strValueOf);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             re3.m8151a(this, parcel, i);
                }

/* 21 */        public zzbg(String str, zzbe zzbeVar, String str2, long j) {
/* 23 */            this.f4208a = str;
                    this.f4209b = zzbeVar;
                    this.f4210c = str2;
                    this.f4211d = j;
                }
            }
