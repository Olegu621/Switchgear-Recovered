            package io.sentry.android.core;

            import java.util.concurrent.CopyOnWriteArraySet;
            import p000.AbstractC2211ta;
            
            /* JADX INFO: renamed from: io.sentry.android.core.l1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1240l1 extends AbstractC2211ta {
                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: o */
                public final void mo4869o(boolean z) {
/* 1 */             super.mo4869o(z);
/* 16 */            if (z) {
/* 18 */                m8745c("android.webkit.WebView");
/* 21 */                m8745c("android.widget.VideoView");
/* 24 */                m8745c("androidx.camera.view.PreviewView");
/* 27 */                m8745c("androidx.media3.ui.PlayerView");
/* 30 */                m8745c("com.google.android.exoplayer2.ui.PlayerView");
/* 33 */                m8745c("com.google.android.exoplayer2.ui.StyledPlayerView");
/* 36 */                return;
                    }
/* 39 */            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f17000a;
/* 41 */            copyOnWriteArraySet.remove("android.webkit.WebView");
/* 44 */            copyOnWriteArraySet.remove("android.widget.VideoView");
/* 47 */            copyOnWriteArraySet.remove("androidx.camera.view.PreviewView");
/* 50 */            copyOnWriteArraySet.remove("androidx.media3.ui.PlayerView");
/* 53 */            copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.PlayerView");
/* 56 */            copyOnWriteArraySet.remove("com.google.android.exoplayer2.ui.StyledPlayerView");
                }

                @Override // p000.AbstractC2211ta
                /* JADX INFO: renamed from: r */
                public final void mo4870r() {
                }
            }
