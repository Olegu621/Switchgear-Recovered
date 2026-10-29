            package com.google.android.gms.games;

            import android.net.Uri;
            import android.os.Parcelable;
            import p000.un0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface Player extends un0, Parcelable {
                /* JADX INFO: renamed from: C */
                long mo2079C();

                /* JADX INFO: renamed from: F */
                Uri mo2080F();

                /* JADX INFO: renamed from: L0 */
                PlayerRelationshipInfo mo2081L0();

                /* JADX INFO: renamed from: P */
                CurrentPlayerInfo mo2082P();

                /* JADX INFO: renamed from: X */
                long mo2083X();

                /* JADX INFO: renamed from: c */
                Uri mo2084c();

                /* JADX INFO: renamed from: f */
                String mo2085f();

                /* JADX INFO: renamed from: f0 */
                PlayerLevelInfo mo2086f0();

                @Deprecated
                String getBannerImageLandscapeUrl();

                @Deprecated
                String getBannerImagePortraitUrl();

                @Deprecated
                String getHiResImageUrl();

                @Deprecated
                String getIconImageUrl();

                String getTitle();

                /* JADX INFO: renamed from: h */
                Uri mo2087h();

                /* JADX INFO: renamed from: l */
                Uri mo2088l();

                /* JADX INFO: renamed from: t1 */
                String mo2089t1();

                int zza();

                long zzb();

                com.google.android.gms.games.internal.player.zza zzc();

                String zzd();

                String zze();

                boolean zzf();

                boolean zzg();

                boolean zzh();
            }
