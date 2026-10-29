            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.query.Filter;
            import p000.C1951n4;
            import p000.kb1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 135 */   public class FilterHolder extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<FilterHolder> CREATOR = new tf3(19);

                /* JADX INFO: renamed from: U */
                public final Filter f3699U;

                /* JADX INFO: renamed from: a */
                public final zzb f3700a;

                /* JADX INFO: renamed from: b */
                public final zzd f3701b;

                /* JADX INFO: renamed from: c */
                public final zzr f3702c;

                /* JADX INFO: renamed from: d */
                public final zzv f3703d;

                /* JADX INFO: renamed from: e */
                public final zzp f3704e;

                /* JADX INFO: renamed from: f */
                public final zzt f3705f;

                /* JADX INFO: renamed from: i */
                public final zzn f3706i;

                /* JADX INFO: renamed from: v */
                public final zzl f3707v;

                /* JADX INFO: renamed from: w */
                public final zzz f3708w;

                public FilterHolder(Filter filter) {
/* 6 */             kb1.m6062o(filter, "Null filter.");
/* 18 */            zzb zzbVar = filter instanceof zzb ? (zzb) filter : null;
/* 19 */            this.f3700a = zzbVar;
/* 29 */            zzd zzdVar = filter instanceof zzd ? (zzd) filter : null;
/* 30 */            this.f3701b = zzdVar;
/* 40 */            zzr zzrVar = filter instanceof zzr ? (zzr) filter : null;
/* 41 */            this.f3702c = zzrVar;
/* 51 */            zzv zzvVar = filter instanceof zzv ? (zzv) filter : null;
/* 52 */            this.f3703d = zzvVar;
/* 62 */            zzp zzpVar = filter instanceof zzp ? (zzp) filter : null;
/* 63 */            this.f3704e = zzpVar;
/* 73 */            zzt zztVar = filter instanceof zzt ? (zzt) filter : null;
/* 74 */            this.f3705f = zztVar;
/* 84 */            zzn zznVar = filter instanceof zzn ? (zzn) filter : null;
/* 85 */            this.f3706i = zznVar;
/* 95 */            zzl zzlVar = filter instanceof zzl ? (zzl) filter : null;
/* 96 */            this.f3707v = zzlVar;
/* 106 */           zzz zzzVar = filter instanceof zzz ? (zzz) filter : null;
/* 107 */           this.f3708w = zzzVar;
/* 109 */           if (zzbVar == null && zzdVar == null && zzrVar == null && zzvVar == null && zzpVar == null && zztVar == null && zznVar == null && zzlVar == null && zzzVar == null) {
/* 130 */               C1951n4.m6859j("Invalid filter type.");
/* 133 */               throw null;
                    }
/* 134 */           this.f3699U = filter;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3700a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f3701b, i, false);
/* 23 */            w11.m9409S(parcel, 3, this.f3702c, i, false);
/* 29 */            w11.m9409S(parcel, 4, this.f3703d, i, false);
/* 35 */            w11.m9409S(parcel, 5, this.f3704e, i, false);
/* 41 */            w11.m9409S(parcel, 6, this.f3705f, i, false);
/* 47 */            w11.m9409S(parcel, 7, this.f3706i, i, false);
/* 54 */            w11.m9409S(parcel, 8, this.f3707v, i, false);
/* 61 */            w11.m9409S(parcel, 9, this.f3708w, i, false);
/* 64 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 136 */       public FilterHolder(zzb zzbVar, zzd zzdVar, zzr zzrVar, zzv zzvVar, zzp zzpVar, zzt zztVar, zzn zznVar, zzl zzlVar, zzz zzzVar) {
/* 138 */           this.f3700a = zzbVar;
/* 139 */           this.f3701b = zzdVar;
/* 140 */           this.f3702c = zzrVar;
/* 141 */           this.f3703d = zzvVar;
/* 142 */           this.f3704e = zzpVar;
/* 143 */           this.f3705f = zztVar;
/* 144 */           this.f3706i = zznVar;
/* 145 */           this.f3707v = zzlVar;
/* 146 */           this.f3708w = zzzVar;
                    if (zzbVar != null) {
/* 147 */               this.f3699U = zzbVar;
                        return;
                    }
                    if (zzdVar != null) {
/* 148 */               this.f3699U = zzdVar;
                        return;
                    }
                    if (zzrVar != null) {
/* 149 */               this.f3699U = zzrVar;
                        return;
                    }
                    if (zzvVar != null) {
/* 150 */               this.f3699U = zzvVar;
                        return;
                    }
                    if (zzpVar != null) {
/* 151 */               this.f3699U = zzpVar;
                        return;
                    }
                    if (zztVar != null) {
/* 152 */               this.f3699U = zztVar;
                        return;
                    }
                    if (zznVar != null) {
/* 153 */               this.f3699U = zznVar;
                        return;
                    }
                    if (zzlVar != null) {
/* 154 */               this.f3699U = zzlVar;
                    } else if (zzzVar != null) {
/* 155 */               this.f3699U = zzzVar;
                    } else {
/* 156 */               C1951n4.m6859j("At least one filter must be set.");
                        throw null;
                    }
                }
            }
