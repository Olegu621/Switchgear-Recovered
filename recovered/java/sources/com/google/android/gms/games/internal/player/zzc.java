            package com.google.android.gms.games.internal.player;

            import android.net.Uri;
            import android.os.Parcel;
            import com.google.android.gms.common.data.DataHolder;
            import java.util.Arrays;
            import p000.md3;
            import p000.nf3;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc extends z30 implements zza {

                /* JADX INFO: renamed from: d */
                public final nf3 f4038d;

                public zzc(DataHolder dataHolder, int i, nf3 nf3Var) {
/* 1 */             super(dataHolder, i);
/* 4 */             this.f4038d = nf3Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return MostRecentGameInfoEntity.m2110E1(this, obj);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 33 */            return Arrays.hashCode(new Object[]{zze(), zzf(), Long.valueOf(zza()), zzd(), zzc(), zzb()});
                }

                public final String toString() {
/* 1 */             return MostRecentGameInfoEntity.m2109D1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             md3.m6640a(new MostRecentGameInfoEntity(this), parcel, i);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final long zza() {
/* 5 */             return m10269e(this.f4038d.f14250u);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzb() {
/* 5 */             return m10273w(this.f4038d.f14253x);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzc() {
/* 5 */             return m10273w(this.f4038d.f14252w);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final Uri zzd() {
/* 5 */             return m10273w(this.f4038d.f14251v);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final String zze() {
/* 5 */             return m10270j(this.f4038d.f14248s);
                }

                @Override // com.google.android.gms.games.internal.player.zza
                public final String zzf() {
/* 5 */             return m10270j(this.f4038d.f14249t);
                }
            }
