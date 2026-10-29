            package com.google.android.gms.games.snapshot;

            import android.net.Uri;
            import android.os.Parcelable;
            import com.google.android.gms.games.Game;
            import com.google.android.gms.games.Player;
            import p000.un0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface SnapshotMetadata extends un0, Parcelable {
                /* JADX INFO: renamed from: A0 */
                Uri mo2127A0();

                /* JADX INFO: renamed from: C1 */
                Game mo2128C1();

                /* JADX INFO: renamed from: G */
                long mo2129G();

                /* JADX INFO: renamed from: I0 */
                Player mo2130I0();

                /* JADX INFO: renamed from: O0 */
                boolean mo2131O0();

                /* JADX INFO: renamed from: g0 */
                long mo2132g0();

                @Deprecated
                String getCoverImageUrl();

                String getDescription();

                /* JADX INFO: renamed from: o0 */
                String mo2133o0();

                /* JADX INFO: renamed from: p1 */
                float mo2134p1();

                /* JADX INFO: renamed from: u1 */
                String mo2135u1();

                /* JADX INFO: renamed from: v */
                long mo2136v();

                /* JADX INFO: renamed from: z1 */
                String mo2137z1();

                String zza();
            }
