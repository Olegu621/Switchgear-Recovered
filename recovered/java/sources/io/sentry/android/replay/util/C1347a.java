            package io.sentry.android.replay.util;

            import androidx.compose.ui.text.TextLayoutResult;
            import p000.jd1;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1347a implements InterfaceC1358l {

                /* JADX INFO: renamed from: a */
                public final TextLayoutResult f10644a;

                static {
/* 1 */             int i = TextLayoutResult.$stable;
                }

                public C1347a(TextLayoutResult textLayoutResult) {
/* 4 */             this.f10644a = textLayoutResult;
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: a */
                public final int mo5029a(int i) {
/* 7 */             return jd1.m5796a(this.f10644a.getLineTop(i));
                }

                /* JADX INFO: renamed from: b */
                public final boolean m5030b() {
                    return this.f10644a.getMultiParagraph().getWidth() > ((float) ((int) (this.f10644a.getSize-YbymL2g() >> 32)));
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: e */
                public final int mo5031e(int i) {
/* 7 */             return jd1.m5796a(this.f10644a.getLineBottom(i));
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: f */
                public final int mo5032f() {
/* 3 */             return this.f10644a.getLineCount();
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: g */
                public final float mo5033g(int i) {
/* 1 */             boolean zM5030b = m5030b();
/* 5 */             TextLayoutResult textLayoutResult = this.f10644a;
                    return zM5030b ? textLayoutResult.getMultiParagraph().getLineWidth(i) : textLayoutResult.getLineRight(i);
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: i */
                public final Integer mo5034i() {
/* 1 */             return null;
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: j */
                public final float mo5035j(int i) {
/* 5 */             if (m5030b()) {
/* 7 */                 return 0.0f;
                    }
/* 11 */            return this.f10644a.getLineLeft(i);
                }
            }
