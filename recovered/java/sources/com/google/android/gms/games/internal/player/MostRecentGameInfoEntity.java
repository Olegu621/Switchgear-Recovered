            package com.google.android.gms.games.internal.player;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.md3;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 39 */    public final class MostRecentGameInfoEntity extends zzh implements zza {
                public static final Parcelable.Creator<MostRecentGameInfoEntity> CREATOR = new md3(18);

                /* JADX INFO: renamed from: a */
                public final String f4016a;

                /* JADX INFO: renamed from: b */
                public final String f4017b;

                /* JADX INFO: renamed from: c */
                public final long f4018c;

                /* JADX INFO: renamed from: d */
                public final Uri f4019d;

                /* JADX INFO: renamed from: e */
                public final Uri f4020e;

                /* JADX INFO: renamed from: f */
                public final Uri f4021f;

                public MostRecentGameInfoEntity(zza zzaVar) {
/* 8 */             this.f4016a = zzaVar.zze();
/* 14 */            this.f4017b = zzaVar.zzf();
/* 20 */            this.f4018c = zzaVar.zza();
/* 26 */            this.f4019d = zzaVar.zzd();
/* 32 */            this.f4020e = zzaVar.zzc();
/* 38 */            this.f4021f = zzaVar.zzb();
                }

                /* JADX INFO: renamed from: D1 */
                public static String m2109D1(zza zzaVar) {
/* 3 */             wc0 wc0Var = new wc0(zzaVar);
/* 12 */            wc0Var.m9529d(zzaVar.zze(), "GameId");
/* 21 */            wc0Var.m9529d(zzaVar.zzf(), "GameName");
/* 34 */            wc0Var.m9529d(Long.valueOf(zzaVar.zza()), "ActivityTimestampMillis");
/* 43 */            wc0Var.m9529d(zzaVar.zzd(), "GameIconUri");
/* 52 */            wc0Var.m9529d(zzaVar.zzc(), "GameHiResUri");
/* 61 */            wc0Var.m9529d(zzaVar.zzb(), "GameFeaturedUri");
/* 64 */            return wc0Var.toString();
                }

                /* JADX INFO: renamed from: E1 */
                public static boolean m2110E1(zza zzaVar, Object obj) {
/* 3 */             if (!(obj instanceof zza)) {
/* 105 */               return false;
                    }
/* 6 */             if (zzaVar == obj) {
/* 103 */               return true;
                    }
/* 9 */             zza zzaVar2 = (zza) obj;
                    return de3.m3029k(zzaVar2.zze(), zzaVar.zze()) && de3.m3029k(zzaVar2.zzf(), zzaVar.zzf()) && de3.m3029k(Long.valueOf(zzaVar2.zza()), Long.valueOf(zzaVar.zza())) && de3.m3029k(zzaVar2.zzd(), zzaVar.zzd()) && de3.m3029k(zzaVar2.zzc(), zzaVar.zzc()) && de3.m3029k(zzaVar2.zzb(), zzaVar.zzb());
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2110E1(this, obj);
                }

                public final int hashCode() {
/* 33 */            return Arrays.hashCode(new Object[]{zze(), zzf(), Long.valueOf(zza()), zzd(), zzc(), zzb()});
                }

                public final String toString() {
/* 1 */             return m2109D1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             md3.m6640a(this, parcel, i);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final long zza() {
/* 1 */             return this.f4018c;
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzb() {
/* 1 */             return this.f4021f;
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzc() {
/* 1 */             return this.f4020e;
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzd() {
/* 1 */             return this.f4019d;
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final String zze() {
/* 1 */             return this.f4016a;
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final String zzf() {
/* 1 */             return this.f4017b;
                }

/* 40 */        public MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
/* 42 */            this.f4016a = str;
                    this.f4017b = str2;
                    this.f4018c = j;
                    this.f4019d = uri;
                    this.f4020e = uri2;
                    this.f4021f = uri3;
                }
            }
