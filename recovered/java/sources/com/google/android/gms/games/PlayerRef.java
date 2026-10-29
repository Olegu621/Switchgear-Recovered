            package com.google.android.gms.games;

            import android.net.Uri;
            import android.os.Parcel;
            import com.google.android.gms.common.data.DataHolder;
            import p000.io3;
            import p000.nf3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class PlayerRef extends io3 implements Player {

                /* JADX INFO: renamed from: d */
                public final nf3 f3966d;

                /* JADX INFO: renamed from: e */
                public final PlayerLevelInfo f3967e;

                /* JADX INFO: renamed from: f */
                public final com.google.android.gms.games.internal.player.zzc f3968f;

                /* JADX INFO: renamed from: i */
                public final zzv f3969i;

                /* JADX INFO: renamed from: v */
                public final zzc f3970v;

                public PlayerRef(DataHolder dataHolder, int i) {
/* 1 */             super(dataHolder, i);
/* 6 */             nf3 nf3Var = new nf3();
/* 9 */             this.f3966d = nf3Var;
/* 16 */            this.f3968f = new com.google.android.gms.games.internal.player.zzc(dataHolder, i, nf3Var);
/* 23 */            this.f3969i = new zzv(dataHolder, i, nf3Var);
/* 30 */            this.f3970v = new zzc(dataHolder, i, nf3Var);
/* 32 */            String str = nf3Var.f14239j;
/* 38 */            if (m10272u(str) || m10269e(str) == -1) {
/* 121 */               this.f3967e = null;
/* 123 */               return;
                    }
/* 53 */            int iM10268d = m10268d(nf3Var.f14240k);
/* 59 */            int iM10268d2 = m10268d(nf3Var.f14243n);
/* 67 */            long jM10269e = m10269e(nf3Var.f14241l);
/* 71 */            String str2 = nf3Var.f14242m;
/* 77 */            PlayerLevel playerLevel = new PlayerLevel(iM10268d, jM10269e, m10269e(str2));
/* 117 */           this.f3967e = new PlayerLevelInfo(m10269e(str), m10269e(nf3Var.f14245p), playerLevel, iM10268d != iM10268d2 ? new PlayerLevel(iM10268d2, m10269e(str2), m10269e(nf3Var.f14244o)) : playerLevel);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: C */
                public final long mo2079C() {
/* 5 */             return m10269e(this.f3966d.f14236g);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: F */
                public final Uri mo2080F() {
/* 5 */             return m10273w(this.f3966d.f14221D);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: L0 */
                public final PlayerRelationshipInfo mo2081L0() {
/* 1 */             zzv zzvVar = this.f3969i;
/* 8 */             if (zzvVar.mo2093z() == -1 && zzvVar.zzb() == null && zzvVar.zza() == null) {
/* 23 */                return null;
                    }
/* 24 */            return zzvVar;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: P */
                public final CurrentPlayerInfo mo2082P() {
/* 1 */             zzc zzcVar = this.f3970v;
/* 3 */             nf3 nf3Var = zzcVar.f4088d;
/* 11 */            if (!zzcVar.m10271r(nf3Var.f14228K) || zzcVar.m10272u(nf3Var.f14228K)) {
/* 22 */                return null;
                    }
/* 21 */            return zzcVar;
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: X */
                public final long mo2083X() {
/* 1 */             nf3 nf3Var = this.f3966d;
/* 9 */             if (!m10271r(nf3Var.f14238i) || m10272u(nf3Var.f14238i)) {
/* 27 */                return -1L;
                    }
/* 22 */            return m10269e(nf3Var.f14238i);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: c */
                public final Uri mo2084c() {
/* 5 */             return m10273w(this.f3966d.f14232c);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return PlayerEntity.m2092H1(this, obj);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: f */
                public final String mo2085f() {
/* 5 */             return m10270j(this.f3966d.f14231b);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: f0 */
                public final PlayerLevelInfo mo2086f0() {
/* 1 */             return this.f3967e;
                }

                @Override // p000.un0
                public final /* synthetic */ Object freeze() {
/* 3 */             return new PlayerEntity(this);
                }

                @Override // com.google.android.gms.games.Player
                public final String getBannerImageLandscapeUrl() {
/* 5 */             return m10270j(this.f3966d.f14220C);
                }

                @Override // com.google.android.gms.games.Player
                public final String getBannerImagePortraitUrl() {
/* 5 */             return m10270j(this.f3966d.f14222E);
                }

                @Override // com.google.android.gms.games.Player
                public final String getHiResImageUrl() {
/* 5 */             return m10270j(this.f3966d.f14235f);
                }

                @Override // com.google.android.gms.games.Player
                public final String getIconImageUrl() {
/* 5 */             return m10270j(this.f3966d.f14233d);
                }

                @Override // com.google.android.gms.games.Player
                public final String getTitle() {
/* 5 */             return m10270j(this.f3966d.f14246q);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: h */
                public final Uri mo2087h() {
/* 5 */             return m10273w(this.f3966d.f14234e);
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return PlayerEntity.m2090F1(this);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: l */
                public final Uri mo2088l() {
/* 5 */             return m10273w(this.f3966d.f14219B);
                }

                @Override // com.google.android.gms.games.Player
                /* JADX INFO: renamed from: t1 */
                public final String mo2089t1() {
/* 5 */             return m10270j(this.f3966d.f14230a);
                }

                public final String toString() {
/* 1 */             return PlayerEntity.m2091G1(this);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             new PlayerEntity(this).writeToParcel(parcel, i);
                }

                @Override // com.google.android.gms.games.Player
                public final int zza() {
/* 5 */             return m10268d(this.f3966d.f14237h);
                }

                @Override // com.google.android.gms.games.Player
                public final long zzb() {
/* 3 */             String str = this.f3966d.f14223F;
/* 9 */             if (!m10271r(str) || m10272u(str)) {
/* 23 */                return -1L;
                    }
/* 18 */            return m10269e(str);
                }

                @Override // com.google.android.gms.games.Player
                public final com.google.android.gms.games.internal.player.zza zzc() {
/* 9 */             if (m10272u(this.f3966d.f14248s)) {
/* 11 */                return null;
                    }
/* 13 */            return this.f3968f;
                }

                @Override // com.google.android.gms.games.Player
                public final String zzd() {
/* 5 */             return m10270j(this.f3966d.f14255z);
                }

                @Override // com.google.android.gms.games.Player
                public final String zze() {
/* 5 */             return m10270j(this.f3966d.f14218A);
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzf() {
/* 5 */             return m10266a(this.f3966d.f14254y);
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzg() {
/* 1 */             nf3 nf3Var = this.f3966d;
                    return m10271r(nf3Var.f14229L) && m10266a(nf3Var.f14229L);
                }

                @Override // com.google.android.gms.games.Player
                public final boolean zzh() {
/* 5 */             return m10266a(this.f3966d.f14247r);
                }
            }
