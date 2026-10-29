            package com.google.android.gms.games.event;

            import android.net.Uri;
            import android.os.Parcelable;
            import com.google.android.gms.games.Player;
            import p000.un0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface Event extends un0, Parcelable {
                /* JADX INFO: renamed from: c */
                Uri mo2102c();

                /* JADX INFO: renamed from: g */
                String mo2103g();

                String getDescription();

                @Deprecated
                String getIconImageUrl();

                String getName();

                long getValue();

                boolean isVisible();

                /* JADX INFO: renamed from: p */
                Player mo2104p();

                /* JADX INFO: renamed from: q1 */
                String mo2105q1();
            }
