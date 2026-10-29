            package io.sentry.android.replay.video;

            import android.media.MediaMuxer;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.video.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1361b {

                /* JADX INFO: renamed from: a */
                public final long f10673a;

                /* JADX INFO: renamed from: b */
                public final MediaMuxer f10674b;

                /* JADX INFO: renamed from: c */
                public boolean f10675c;

                /* JADX INFO: renamed from: d */
                public int f10676d;

                /* JADX INFO: renamed from: e */
                public int f10677e;

                /* JADX INFO: renamed from: f */
                public long f10678f;

                public C1361b(String str, float f) {
/* 1 */             str.getClass();
/* 12 */            this.f10673a = (long) (1000000.0f / f);
/* 20 */            this.f10674b = new MediaMuxer(str, 0);
                }
            }
